package di;

import android.os.SystemClock;
public final class i7 implements Runnable {
    public final int f7371a;
    public final l7 f7372b;

    public i7(l7 l7Var, int i10) {
        this.f7371a = i10;
        this.f7372b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f7371a) {
            case 0:
                l7 l7Var = this.f7372b;
                l7Var.f7557r0 = false;
                l7Var.f7569z0 = false;
                l7Var.f7562v0 = SystemClock.elapsedRealtime();
                l7Var.f7561u0 = true;
                l7Var.f7564w0 = false;
                l7Var.J.c(false);
                l7Var.K.c(false);
                l7Var.L.c(false);
                ((jb) l7Var.f7534a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                l7 l7Var2 = this.f7372b;
                l7Var2.Q = currentTimeMillis;
                l7Var2.R = 0L;
                l7Var2.f7557r0 = true;
                ((jb) l7Var2.f7534a).f7443a.J0.a(0L, true);
                return;
            case 2:
                l7 l7Var3 = this.f7372b;
                if (!l7Var3.f7557r0 && !l7Var3.b()) {
                    if (!pc.d(((jb) l7Var3.f7534a).f7443a)) {
                        l7Var3.f7564w0 = false;
                        l7Var3.J.c(false);
                        l7Var3.K.c(false);
                        l7Var3.L.c(false);
                        return;
                    }
                    l7Var3.f7569z0 = true;
                    l7Var3.A0 = true;
                    ((jb) l7Var3.f7534a).e(new i7(l7Var3, 4), true);
                    return;
                }
                return;
            case 3:
                l7 l7Var4 = this.f7372b;
                if (!l7Var4.f7557r0 && !l7Var4.b()) {
                    sb sbVar = ((jb) l7Var4.f7534a).f7443a.B0;
                    if (sbVar != null) {
                        sbVar.toggleDual();
                    }
                    l7Var4.d(360.0f);
                    l7Var4.f7564w0 = false;
                    l7Var4.J.c(false);
                    l7Var4.K.c(false);
                    l7Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                l7 l7Var5 = this.f7372b;
                l7Var5.Q = currentTimeMillis2;
                l7Var5.f7557r0 = true;
                j7 j7Var = l7Var5.f7534a;
                l7Var5.R = 0L;
                ((jb) j7Var).f7443a.J0.a(0L, true);
                return;
        }
    }
}
