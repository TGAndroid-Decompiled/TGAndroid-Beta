package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z10;
import org.telegram.ui.ah0;
public abstract class za {
    public static boolean f4817a;
    public static boolean f4818b;
    public static ArrayList f4819c;
    public static LongSparseArray d;
    public static ArrayList f4820e;

    public static ArrayList a(z10 z10Var) {
        boolean z10;
        if (z10Var != null && !f4818b) {
            if (f4820e == null) {
                f4820e = new ArrayList();
            }
            f4820e.add(z10Var);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f4819c;
    }

    public static void b() {
        if (!f4817a && !f4818b) {
            f4817a = true;
            f4819c = new ArrayList();
            d = new LongSparseArray();
            Utilities.f22416e.c(new ah0(12));
        }
    }

    public static void c(org.telegram.ui.web.w0 w0Var) {
        if (w0Var != null && w0Var.d != null) {
            b();
            org.telegram.ui.web.w0 w0Var2 = (org.telegram.ui.web.w0) d.get(w0Var.f52858a);
            if (w0Var2 != null) {
                w0Var2.d = w0Var.d;
            } else {
                f4819c.add(w0Var);
                d.put(w0Var.f52858a, w0Var);
            }
            org.telegram.messenger.g0.r(new ah0(11));
            org.telegram.messenger.g0.i3(new ah0(11), 1000L);
        }
    }
}
