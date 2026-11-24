package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
public abstract class g08 {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(pz0 pz0Var, String str) {
        gw2 parent = pz0Var.getParent();
        ArrayList arrayList = ((yh0) parent).b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            pz0 pz0Var2 = (pz0) obj;
            if (pz0Var2.getType().equals(pz0Var.getType())) {
                if (pz0Var2 == pz0Var) {
                    break;
                }
                i++;
            }
        }
        String concat = String.format("/%s[%d]", pz0Var.getType(), Integer.valueOf(i)).concat(str);
        if (parent instanceof pz0) {
            return a((pz0) parent, concat);
        }
        return concat;
    }
}
