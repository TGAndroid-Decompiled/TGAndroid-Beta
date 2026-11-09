package c8;

import org.telegram.ui.Components.ak0;
public abstract class l1 {
    public static void a(ak0 ak0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        boolean q10;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.l6.I.q();
        }
        ak0Var.r(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var), q10);
    }

    public static int b(li.a aVar) {
        int i7 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f18393c);
        if (max > 0) {
            i7 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(max, 1, 24, 28));
        }
        return c10 + i7;
    }

    public static int c(li.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f18399k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(size, 1, 16, 12));
    }

    public static int d(li.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f18399k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(size, 1, 16, 8));
    }
}
