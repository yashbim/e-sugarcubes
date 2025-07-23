package com.example.e_sugarcubes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class ESugarcubesApplication

fun main(args: Array<String>) {
	runApplication<ESugarcubesApplication>(*args)
	val scanner = Scanner(System.`in`)
	println("Hello AIESECer!");
	var choice = 0;
	print("Enter your option: \n 1. Create Session \n 2. Join Session");
	choice = scanner.nextInt();

	if (choice == 1) {
		createSession();
	} else if (choice == 2) {
		joinSession();
	} else {
		println("Error!");
	}


}


fun createSession(){
	print("Let's create a session")
}

fun joinSession(){
	print("Let's join a session")
}

fun postCube(){}