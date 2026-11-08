package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.ui.o61;
public abstract class xa {
    public static boolean f5953a;
    public static boolean f5954b;
    public static ArrayList f5955c;
    public static LongSparseArray d;
    public static ArrayList f5956e;

    public static ArrayList a(c20 c20Var) {
        boolean z9;
        if (c20Var != null && !f5954b) {
            if (f5956e == null) {
                f5956e = new ArrayList();
            }
            f5956e.add(c20Var);
            z9 = true;
        } else {
            z9 = false;
        }
        b();
        if (z9) {
            return null;
        }
        return f5955c;
    }

    public static void b() {
        if (!f5953a && !f5954b) {
            f5953a = true;
            f5955c = new ArrayList();
            d = new LongSparseArray();
            Utilities.f21336e.c(new o61(8));
        }
    }

    public static void c(org.telegram.ui.web.y0 y0Var) {
        if (y0Var != null && y0Var.d != null) {
            b();
            org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) d.get(y0Var.f51402a);
            if (y0Var2 != null) {
                y0Var2.d = y0Var.d;
            } else {
                f5955c.add(y0Var);
                d.put(y0Var.f51402a, y0Var);
            }
            org.telegram.messenger.g0.r(new o61(7));
            org.telegram.messenger.g0.i3(new o61(7), 1000L);
        }
    }
}
