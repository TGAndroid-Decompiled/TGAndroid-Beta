package org.scilab.forge.jlatexmath;

import java.util.HashMap;
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i) {
        String o = qd4.o(str, "@env");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        NewCommandMacro.addNewCommand(o, sb.toString(), i2);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i) {
        HashMap<String, String> hashMap = NewCommandMacro.macrocode;
        if (hashMap.get(str + "@env") != null) {
            String o = qd4.o(str, "@env");
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" #");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" ");
            sb.append(str3);
            NewCommandMacro.addReNewCommand(o, sb.toString(), i2);
            return;
        }
        rm0.k(qd4.y("Environment ", str, "is not defined ! Use newenvironment instead ..."));
    }
}
