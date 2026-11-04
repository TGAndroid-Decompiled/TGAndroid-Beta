package b8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.u10;
import org.telegram.ui.hb1;
public abstract class xf {
    public static boolean f3126a;
    public static boolean f3127b;
    public static ArrayList f3128c;
    public static LongSparseArray d;
    public static ArrayList f3129e;

    public static ArrayList a(u10 u10Var) {
        boolean z10;
        if (u10Var != null && !f3127b) {
            if (f3129e == null) {
                f3129e = new ArrayList();
            }
            f3129e.add(u10Var);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f3128c;
    }

    public static void b() {
        if (!f3126a && !f3127b) {
            f3126a = true;
            f3128c = new ArrayList();
            d = new LongSparseArray();
            Utilities.f21387e.c(new hb1(7));
        }
    }

    public static void c(org.telegram.ui.web.x0 x0Var) {
        if (x0Var != null && x0Var.d != null) {
            b();
            org.telegram.ui.web.x0 x0Var2 = (org.telegram.ui.web.x0) d.get(x0Var.f51102a);
            if (x0Var2 != null) {
                x0Var2.d = x0Var.d;
            } else {
                f3128c.add(x0Var);
                d.put(x0Var.f51102a, x0Var);
            }
            org.telegram.messenger.g0.r(new hb1(6));
            org.telegram.messenger.g0.i3(new hb1(6), 1000L);
        }
    }
}
