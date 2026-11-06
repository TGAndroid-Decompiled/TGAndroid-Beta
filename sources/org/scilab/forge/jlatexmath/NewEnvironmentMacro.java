package org.scilab.forge.jlatexmath;

import a8.p0;
import java.util.HashMap;
import rf.b;
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i7) {
        String q10 = b.q(str, "@env");
        StringBuilder j3 = b.j(str2, " #");
        int i10 = i7 + 1;
        j3.append(i10);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addNewCommand(q10, j3.toString(), i10);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i7) {
        HashMap<String, String> hashMap = NewCommandMacro.macrocode;
        if (hashMap.get(str + "@env") != null) {
            String q10 = b.q(str, "@env");
            StringBuilder j3 = b.j(str2, " #");
            int i10 = i7 + 1;
            j3.append(i10);
            j3.append(" ");
            j3.append(str3);
            NewCommandMacro.addReNewCommand(q10, j3.toString(), i10);
            return;
        }
        throw new ParseException(p0.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
    }
}
