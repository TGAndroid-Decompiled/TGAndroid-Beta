package di;

import android.os.SystemClock;
public final class i7 implements Runnable {
    public final int f7399a;
    public final l7 f7400b;

    public i7(l7 l7Var, int i10) {
        this.f7399a = i10;
        this.f7400b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f7399a) {
            case 0:
                l7 l7Var = this.f7400b;
                l7Var.f7585r0 = false;
                l7Var.f7597z0 = false;
                l7Var.f7590v0 = SystemClock.elapsedRealtime();
                l7Var.f7589u0 = true;
                l7Var.f7592w0 = false;
                l7Var.J.c(false);
                l7Var.K.c(false);
                l7Var.L.c(false);
                ((jb) l7Var.f7562a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                l7 l7Var2 = this.f7400b;
                l7Var2.Q = currentTimeMillis;
                l7Var2.R = 0L;
                l7Var2.f7585r0 = true;
                ((jb) l7Var2.f7562a).f7471a.J0.a(0L, true);
                return;
            case 2:
                l7 l7Var3 = this.f7400b;
                if (!l7Var3.f7585r0 && !l7Var3.b()) {
                    if (!pc.d(((jb) l7Var3.f7562a).f7471a)) {
                        l7Var3.f7592w0 = false;
                        l7Var3.J.c(false);
                        l7Var3.K.c(false);
                        l7Var3.L.c(false);
                        return;
                    }
                    l7Var3.f7597z0 = true;
                    l7Var3.A0 = true;
                    ((jb) l7Var3.f7562a).e(new i7(l7Var3, 4), true);
                    return;
                }
                return;
            case 3:
                l7 l7Var4 = this.f7400b;
                if (!l7Var4.f7585r0 && !l7Var4.b()) {
                    sb sbVar = ((jb) l7Var4.f7562a).f7471a.B0;
                    if (sbVar != null) {
                        sbVar.toggleDual();
                    }
                    l7Var4.d(360.0f);
                    l7Var4.f7592w0 = false;
                    l7Var4.J.c(false);
                    l7Var4.K.c(false);
                    l7Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                l7 l7Var5 = this.f7400b;
                l7Var5.Q = currentTimeMillis2;
                l7Var5.f7585r0 = true;
                j7 j7Var = l7Var5.f7562a;
                l7Var5.R = 0L;
                ((jb) j7Var).f7471a.J0.a(0L, true);
                return;
        }
    }
}
