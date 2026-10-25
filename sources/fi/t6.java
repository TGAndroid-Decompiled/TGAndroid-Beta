package fi;

import android.os.SystemClock;
public final class t6 implements Runnable {
    public final int f11709a;
    public final w6 f11710b;

    public t6(w6 w6Var, int i10) {
        this.f11709a = i10;
        this.f11710b = w6Var;
    }

    @Override
    public final void run() {
        switch (this.f11709a) {
            case 0:
                w6 w6Var = this.f11710b;
                w6Var.f11875r0 = false;
                w6Var.f11887z0 = false;
                w6Var.f11880v0 = SystemClock.elapsedRealtime();
                w6Var.f11879u0 = true;
                w6Var.f11882w0 = false;
                w6Var.J.c(false);
                w6Var.K.c(false);
                w6Var.L.c(false);
                ((ma) w6Var.f11853a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                w6 w6Var2 = this.f11710b;
                w6Var2.Q = currentTimeMillis;
                w6Var2.R = 0L;
                w6Var2.f11875r0 = true;
                ((ma) w6Var2.f11853a).f11270a.J0.a(0L, true);
                return;
            case 2:
                w6 w6Var3 = this.f11710b;
                if (!w6Var3.f11875r0 && !w6Var3.b()) {
                    if (!sb.c(((ma) w6Var3.f11853a).f11270a)) {
                        w6Var3.f11882w0 = false;
                        w6Var3.J.c(false);
                        w6Var3.K.c(false);
                        w6Var3.L.c(false);
                        return;
                    }
                    w6Var3.f11887z0 = true;
                    w6Var3.A0 = true;
                    ((ma) w6Var3.f11853a).f(new t6(w6Var3, 4), true);
                    return;
                }
                return;
            case 3:
                w6 w6Var4 = this.f11710b;
                if (!w6Var4.f11875r0 && !w6Var4.b()) {
                    va vaVar = ((ma) w6Var4.f11853a).f11270a.B0;
                    if (vaVar != null) {
                        vaVar.toggleDual();
                    }
                    w6Var4.d(360.0f);
                    w6Var4.f11882w0 = false;
                    w6Var4.J.c(false);
                    w6Var4.K.c(false);
                    w6Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                w6 w6Var5 = this.f11710b;
                w6Var5.Q = currentTimeMillis2;
                w6Var5.f11875r0 = true;
                u6 u6Var = w6Var5.f11853a;
                w6Var5.R = 0L;
                ((ma) u6Var).f11270a.J0.a(0L, true);
                return;
        }
    }
}
