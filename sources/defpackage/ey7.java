package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
public abstract class ey7 {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(iy0 iy0Var, String str) {
        wu2 parent = iy0Var.getParent();
        ArrayList arrayList = ((yg0) parent).b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iy0 iy0Var2 = (iy0) obj;
            if (iy0Var2.getType().equals(iy0Var.getType())) {
                if (iy0Var2 == iy0Var) {
                    break;
                }
                i++;
            }
        }
        String concat = String.format("/%s[%d]", iy0Var.getType(), Integer.valueOf(i)).concat(str);
        if (parent instanceof iy0) {
            return a((iy0) parent, concat);
        }
        return concat;
    }
}
