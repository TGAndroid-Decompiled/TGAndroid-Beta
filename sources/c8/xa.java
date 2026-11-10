package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.ui.q61;
public abstract class xa {
    public static boolean f5956a;
    public static boolean f5957b;
    public static ArrayList f5958c;
    public static LongSparseArray d;
    public static ArrayList f5959e;

    public static ArrayList a(c20 c20Var) {
        boolean z9;
        if (c20Var != null && !f5957b) {
            if (f5959e == null) {
                f5959e = new ArrayList();
            }
            f5959e.add(c20Var);
            z9 = true;
        } else {
            z9 = false;
        }
        b();
        if (z9) {
            return null;
        }
        return f5958c;
    }

    public static void b() {
        if (!f5956a && !f5957b) {
            f5956a = true;
            f5958c = new ArrayList();
            d = new LongSparseArray();
            Utilities.f21341e.c(new q61(8));
        }
    }

    public static void c(org.telegram.ui.web.y0 y0Var) {
        if (y0Var != null && y0Var.d != null) {
            b();
            org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) d.get(y0Var.f51337a);
            if (y0Var2 != null) {
                y0Var2.d = y0Var.d;
            } else {
                f5958c.add(y0Var);
                d.put(y0Var.f51337a, y0Var);
            }
            org.telegram.messenger.g0.r(new q61(7));
            org.telegram.messenger.g0.i3(new q61(7), 1000L);
        }
    }
}
