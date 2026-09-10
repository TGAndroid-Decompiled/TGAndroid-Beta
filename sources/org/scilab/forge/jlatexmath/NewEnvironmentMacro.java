package org.scilab.forge.jlatexmath;

import a4.a;
import java.util.HashMap;
import org.telegram.ui.Cells.r6;
import w.f;
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String t10 = r6.t(str, "@env");
        StringBuilder g10 = f.g(str2, " #");
        int i11 = i10 + 1;
        g10.append(i11);
        g10.append(" ");
        g10.append(str3);
        NewCommandMacro.addNewCommand(t10, g10.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        HashMap<String, String> hashMap = NewCommandMacro.macrocode;
        if (hashMap.get(str + "@env") != null) {
            String t10 = r6.t(str, "@env");
            StringBuilder g10 = f.g(str2, " #");
            int i11 = i10 + 1;
            g10.append(i11);
            g10.append(" ");
            g10.append(str3);
            NewCommandMacro.addReNewCommand(t10, g10.toString(), i11);
            return;
        }
        throw new ParseException(a.p("Environment ", str, "is not defined ! Use newenvironment instead ..."));
    }
}
