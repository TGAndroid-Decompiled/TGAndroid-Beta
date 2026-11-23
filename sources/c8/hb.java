package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y10;
import org.telegram.ui.cd0;
public abstract class hb {
    public static boolean f4807a;
    public static boolean f4808b;
    public static ArrayList f4809c;
    public static LongSparseArray d;
    public static ArrayList f4810e;

    public static ArrayList a(y10 y10Var) {
        boolean z10;
        if (y10Var != null && !f4808b) {
            if (f4810e == null) {
                f4810e = new ArrayList();
            }
            f4810e.add(y10Var);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f4809c;
    }

    public static void b() {
        if (!f4807a && !f4808b) {
            f4807a = true;
            f4809c = new ArrayList();
            d = new LongSparseArray();
            Utilities.f22774e.c(new cd0(14));
        }
    }

    public static void c(org.telegram.ui.web.w0 w0Var) {
        if (w0Var != null && w0Var.d != null) {
            b();
            org.telegram.ui.web.w0 w0Var2 = (org.telegram.ui.web.w0) d.get(w0Var.f53349a);
            if (w0Var2 != null) {
                w0Var2.d = w0Var.d;
            } else {
                f4809c.add(w0Var);
                d.put(w0Var.f53349a, w0Var);
            }
            org.telegram.messenger.g0.r(new cd0(13));
            org.telegram.messenger.g0.h3(new cd0(13), 1000L);
        }
    }
}
