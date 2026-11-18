package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x10;
import org.telegram.ui.dd0;
public abstract class cb {
    public static boolean f4514a;
    public static boolean f4515b;
    public static ArrayList f4516c;
    public static LongSparseArray d;
    public static ArrayList f4517e;

    public static ArrayList a(x10 x10Var) {
        boolean z10;
        if (x10Var != null && !f4515b) {
            if (f4517e == null) {
                f4517e = new ArrayList();
            }
            f4517e.add(x10Var);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f4516c;
    }

    public static void b() {
        if (!f4514a && !f4515b) {
            f4514a = true;
            f4516c = new ArrayList();
            d = new LongSparseArray();
            Utilities.f22779e.c(new dd0(14));
        }
    }

    public static void c(org.telegram.ui.web.w0 w0Var) {
        if (w0Var != null && w0Var.d != null) {
            b();
            org.telegram.ui.web.w0 w0Var2 = (org.telegram.ui.web.w0) d.get(w0Var.f53338a);
            if (w0Var2 != null) {
                w0Var2.d = w0Var.d;
            } else {
                f4516c.add(w0Var);
                d.put(w0Var.f53338a, w0Var);
            }
            org.telegram.messenger.g0.r(new dd0(13));
            org.telegram.messenger.g0.h3(new dd0(13), 1000L);
        }
    }
}
