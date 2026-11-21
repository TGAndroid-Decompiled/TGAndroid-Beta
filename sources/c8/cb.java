package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x10;
import org.telegram.ui.cd0;
public abstract class cb {
    public static boolean f4543a;
    public static boolean f4544b;
    public static ArrayList f4545c;
    public static LongSparseArray d;
    public static ArrayList f4546e;

    public static ArrayList a(x10 x10Var) {
        boolean z10;
        if (x10Var != null && !f4544b) {
            if (f4546e == null) {
                f4546e = new ArrayList();
            }
            f4546e.add(x10Var);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f4545c;
    }

    public static void b() {
        if (!f4543a && !f4544b) {
            f4543a = true;
            f4545c = new ArrayList();
            d = new LongSparseArray();
            Utilities.f22807e.c(new cd0(14));
        }
    }

    public static void c(org.telegram.ui.web.w0 w0Var) {
        if (w0Var != null && w0Var.d != null) {
            b();
            org.telegram.ui.web.w0 w0Var2 = (org.telegram.ui.web.w0) d.get(w0Var.f53381a);
            if (w0Var2 != null) {
                w0Var2.d = w0Var.d;
            } else {
                f4545c.add(w0Var);
                d.put(w0Var.f53381a, w0Var);
            }
            org.telegram.messenger.g0.r(new cd0(13));
            org.telegram.messenger.g0.h3(new cd0(13), 1000L);
        }
    }
}
