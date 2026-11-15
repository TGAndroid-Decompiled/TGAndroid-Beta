package c8;

import org.telegram.ui.Components.ek0;
public abstract class ca {
    public static void a(ek0 ek0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean q10;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        ek0Var.r(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var), q10);
    }

    public static int b(oi.a aVar) {
        int i7 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f21545c);
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
            size = aVar.f21551k.size();
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
            size = aVar.f21551k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(size, 1, 16, 8));
    }
}
