package c8;

import org.telegram.ui.Components.ok0;
public abstract class fa {
    public static void a(ok0 ok0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        boolean q10;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        ok0Var.r(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var), q10);
    }

    public static int b(oi.a aVar) {
        int i7 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f21902c);
        if (max > 0) {
            i7 = org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(max, 1, 24, 28));
        }
        return c10 + i7;
    }

    public static int c(oi.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f21908k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(size, 1, 16, 12));
    }

    public static int d(oi.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f21908k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(size, 1, 16, 8));
    }
}
