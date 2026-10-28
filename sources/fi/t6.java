package fi;

import android.os.SystemClock;
public final class t6 implements Runnable {
    public final int f11708a;
    public final w6 f11709b;

    public t6(w6 w6Var, int i10) {
        this.f11708a = i10;
        this.f11709b = w6Var;
    }

    @Override
    public final void run() {
        switch (this.f11708a) {
            case 0:
                w6 w6Var = this.f11709b;
                w6Var.f11874r0 = false;
                w6Var.f11886z0 = false;
                w6Var.f11879v0 = SystemClock.elapsedRealtime();
                w6Var.f11878u0 = true;
                w6Var.f11881w0 = false;
                w6Var.J.c(false);
                w6Var.K.c(false);
                w6Var.L.c(false);
                ((ma) w6Var.f11852a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                w6 w6Var2 = this.f11709b;
                w6Var2.Q = currentTimeMillis;
                w6Var2.R = 0L;
                w6Var2.f11874r0 = true;
                ((ma) w6Var2.f11852a).f11269a.J0.a(0L, true);
                return;
            case 2:
                w6 w6Var3 = this.f11709b;
                if (!w6Var3.f11874r0 && !w6Var3.b()) {
                    if (!sb.c(((ma) w6Var3.f11852a).f11269a)) {
                        w6Var3.f11881w0 = false;
                        w6Var3.J.c(false);
                        w6Var3.K.c(false);
                        w6Var3.L.c(false);
                        return;
                    }
                    w6Var3.f11886z0 = true;
                    w6Var3.A0 = true;
                    ((ma) w6Var3.f11852a).f(new t6(w6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                w6 w6Var4 = this.f11709b;
                if (!w6Var4.f11874r0 && !w6Var4.b()) {
                    va vaVar = ((ma) w6Var4.f11852a).f11269a.B0;
                    if (vaVar != null) {
                        vaVar.toggleDual();
                    }
                    w6Var4.d(360.0f);
                    w6Var4.f11881w0 = false;
                    w6Var4.J.c(false);
                    w6Var4.K.c(false);
                    w6Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                w6 w6Var5 = this.f11709b;
                w6Var5.Q = currentTimeMillis2;
                w6Var5.f11874r0 = true;
                u6 u6Var = w6Var5.f11852a;
                w6Var5.R = 0L;
                ((ma) u6Var).f11269a.J0.a(0L, true);
                return;
        }
    }
}
