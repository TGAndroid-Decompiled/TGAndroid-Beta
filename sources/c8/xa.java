package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.ui.p61;
public abstract class xa {
    public static boolean f5951a;
    public static boolean f5952b;
    public static ArrayList f5953c;
    public static LongSparseArray d;
    public static ArrayList f5954e;

    public static ArrayList a(c20 c20Var) {
        boolean z9;
        if (c20Var != null && !f5952b) {
            if (f5954e == null) {
                f5954e = new ArrayList();
            }
            f5954e.add(c20Var);
            z9 = true;
        } else {
            z9 = false;
        }
        b();
        if (z9) {
            return null;
        }
        return f5953c;
    }

    public static void b() {
        if (!f5951a && !f5952b) {
            f5951a = true;
            f5953c = new ArrayList();
            d = new LongSparseArray();
            Utilities.f21336e.c(new p61(8));
        }
    }

    public static void c(org.telegram.ui.web.y0 y0Var) {
        if (y0Var != null && y0Var.d != null) {
            b();
            org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) d.get(y0Var.f51383a);
            if (y0Var2 != null) {
                y0Var2.d = y0Var.d;
            } else {
                f5953c.add(y0Var);
                d.put(y0Var.f51383a, y0Var);
            }
            org.telegram.messenger.g0.r(new p61(7));
            org.telegram.messenger.g0.i3(new p61(7), 1000L);
        }
    }
}
