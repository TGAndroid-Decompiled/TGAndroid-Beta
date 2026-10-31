package org.scilab.forge.jlatexmath;

import a1.g;
import java.util.HashMap;
import sc.e;
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String A = e.A(str, "@env");
        StringBuilder i11 = e.i(str2, " #");
        int i12 = i10 + 1;
        i11.append(i12);
        i11.append(" ");
        i11.append(str3);
        NewCommandMacro.addNewCommand(A, i11.toString(), i12);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        HashMap<String, String> hashMap = NewCommandMacro.macrocode;
        if (hashMap.get(str + "@env") != null) {
            String A = e.A(str, "@env");
            StringBuilder i11 = e.i(str2, " #");
            int i12 = i10 + 1;
            i11.append(i12);
            i11.append(" ");
            i11.append(str3);
            NewCommandMacro.addReNewCommand(A, i11.toString(), i12);
            return;
        }
        throw new ParseException(g.n("Environment ", str, "is not defined ! Use newenvironment instead ..."));
    }
}
