package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class bge {
    public static n73 a(ub9 ub9Var, String str, n29 n29Var, int i) {
        Map map = Collections.EMPTY_MAP;
        Uri d = d2f.d(str, n29Var.c);
        long j = n29Var.a;
        long j2 = n29Var.b;
        String a = ub9Var.a();
        if (a == null) {
            a = d2f.d(((xg0) ub9Var.b.get(0)).a, n29Var.c).toString();
        }
        String str2 = a;
        yve.l(d, "The uri must be set.");
        return new n73(d, 1, null, o99.h, j, j2, str2, i);
    }
}
