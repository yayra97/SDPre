import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){

    printMenu();

    System.out.print("Enter your selection: ");
      selection = scanner.nextInt();

      switch (selection) {
  case 1:
    System.out.println("Hello Human");
    break;
  case 2:
    System.out.println("Apples, Bananas, Coconuts");
    break;
  case 3:
    System.out.println("Exit");
     scanner.close();
    return; 
    default:

    System.out.println("Invalid selection. Please try again.");

   
       }
      
    }
  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}

