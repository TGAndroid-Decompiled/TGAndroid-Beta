package b8;

import org.telegram.ui.Components.dk0;
public abstract class ne {
    public static void a(dk0 dk0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean q10;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        dk0Var.r(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var), q10);
    }

    public static int b(mi.a aVar) {
        int i3 = 0;
        if (aVar == null) {
            return 0;
        }
        int c2 = c(aVar);
        int max = Math.max(0, aVar.f19432c);
        if (max > 0) {
            i3 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(max, 1, 24, 28));
        }
        return c2 + i3;
    }

    public static int c(mi.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f19438k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(size, 1, 16, 12));
    }

    public static int d(mi.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f19438k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(size, 1, 16, 8));
    }
}
