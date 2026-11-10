package c8;

import org.telegram.ui.Components.zj0;
public abstract class l1 {
    public static void a(zj0 zj0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        boolean q10;
        if (h6Var != null) {
            q10 = h6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        zj0Var.r(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var), q10);
    }

    public static int b(li.a aVar) {
        int i7 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f18396c);
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
            size = aVar.f18402k.size();
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
            size = aVar.f18402k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(size, 1, 16, 8));
    }
}
