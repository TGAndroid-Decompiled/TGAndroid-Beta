package org.scilab.forge.jlatexmath;

public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        NewCommandMacro.addNewCommand(str + "@env", sb.toString(), i2);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException("Environment " + str + "is not defined ! Use newenvironment instead ...");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        NewCommandMacro.addReNewCommand(str + "@env", sb.toString(), i2);
    }
}
