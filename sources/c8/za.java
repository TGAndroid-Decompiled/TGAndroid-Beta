package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z10;
import org.telegram.ui.ah0;
public abstract class za {
    public static boolean f4814a;
    public static boolean f4815b;
    public static ArrayList f4816c;
    public static LongSparseArray d;
    public static ArrayList f4817e;

    public static ArrayList a(z10 z10Var) {
        boolean z10;
        if (z10Var != null && !f4815b) {
            if (f4817e == null) {
                f4817e = new ArrayList();
            }
            f4817e.add(z10Var);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f4816c;
    }

    public static void b() {
        if (!f4814a && !f4815b) {
            f4814a = true;
            f4816c = new ArrayList();
            d = new LongSparseArray();
            Utilities.f22416e.c(new ah0(12));
        }
    }

    public static void c(org.telegram.ui.web.w0 w0Var) {
        if (w0Var != null && w0Var.d != null) {
            b();
            org.telegram.ui.web.w0 w0Var2 = (org.telegram.ui.web.w0) d.get(w0Var.f52855a);
            if (w0Var2 != null) {
                w0Var2.d = w0Var.d;
            } else {
                f4816c.add(w0Var);
                d.put(w0Var.f52855a, w0Var);
            }
            org.telegram.messenger.g0.r(new ah0(11));
            org.telegram.messenger.g0.i3(new ah0(11), 1000L);
        }
    }
}
