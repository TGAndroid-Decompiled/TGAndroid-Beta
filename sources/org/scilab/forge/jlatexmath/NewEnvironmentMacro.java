package org.scilab.forge.jlatexmath;

import a4.a;
import java.util.HashMap;
import t8.b;
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String v = b.v(str, "@env");
        StringBuilder j3 = b.j(str2, " #");
        int i11 = i10 + 1;
        j3.append(i11);
        j3.append(" ");
        j3.append(str3);
        NewCommandMacro.addNewCommand(v, j3.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        HashMap<String, String> hashMap = NewCommandMacro.macrocode;
        if (hashMap.get(str + "@env") != null) {
            String v = b.v(str, "@env");
            StringBuilder j3 = b.j(str2, " #");
            int i11 = i10 + 1;
            j3.append(i11);
            j3.append(" ");
            j3.append(str3);
            NewCommandMacro.addReNewCommand(v, j3.toString(), i11);
            return;
        }
        throw new ParseException(a.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
    }
}
