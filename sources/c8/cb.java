package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x10;
import org.telegram.ui.cd0;
public abstract class cb {
    public static boolean f4517a;
    public static boolean f4518b;
    public static ArrayList f4519c;
    public static LongSparseArray d;
    public static ArrayList f4520e;

    public static ArrayList a(x10 x10Var) {
        boolean z10;
        if (x10Var != null && !f4518b) {
            if (f4520e == null) {
                f4520e = new ArrayList();
            }
            f4520e.add(x10Var);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f4519c;
    }

    public static void b() {
        if (!f4517a && !f4518b) {
            f4517a = true;
            f4519c = new ArrayList();
            d = new LongSparseArray();
            Utilities.f22782e.c(new cd0(14));
        }
    }

    public static void c(org.telegram.ui.web.w0 w0Var) {
        if (w0Var != null && w0Var.d != null) {
            b();
            org.telegram.ui.web.w0 w0Var2 = (org.telegram.ui.web.w0) d.get(w0Var.f53387a);
            if (w0Var2 != null) {
                w0Var2.d = w0Var.d;
            } else {
                f4519c.add(w0Var);
                d.put(w0Var.f53387a, w0Var);
            }
            org.telegram.messenger.g0.r(new cd0(13));
            org.telegram.messenger.g0.h3(new cd0(13), 1000L);
        }
    }
}
