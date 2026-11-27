package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
public abstract class k18 {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(qy0 qy0Var, String str) {
        qv2 parent = qy0Var.getParent();
        ArrayList arrayList = ((zg0) parent).b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qy0 qy0Var2 = (qy0) obj;
            if (qy0Var2.getType().equals(qy0Var.getType())) {
                if (qy0Var2 == qy0Var) {
                    break;
                }
                i++;
            }
        }
        String concat = String.format("/%s[%d]", qy0Var.getType(), Integer.valueOf(i)).concat(str);
        if (parent instanceof qy0) {
            return a((qy0) parent, concat);
        }
        return concat;
    }
}
