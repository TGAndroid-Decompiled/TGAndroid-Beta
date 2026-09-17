package ci;

import android.os.SystemClock;
public final class i7 implements Runnable {
    public final int f4788a;
    public final l7 f4789b;

    public i7(l7 l7Var, int i10) {
        this.f4788a = i10;
        this.f4789b = l7Var;
    }

    @Override
    public final void run() {
        switch (this.f4788a) {
            case 0:
                l7 l7Var = this.f4789b;
                l7Var.f4962r0 = false;
                l7Var.f4974z0 = false;
                l7Var.f4967v0 = SystemClock.elapsedRealtime();
                l7Var.f4966u0 = true;
                l7Var.f4969w0 = false;
                l7Var.J.c(false);
                l7Var.K.c(false);
                l7Var.L.c(false);
                ((jb) l7Var.f4940a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                l7 l7Var2 = this.f4789b;
                l7Var2.Q = currentTimeMillis;
                l7Var2.R = 0L;
                l7Var2.f4962r0 = true;
                ((jb) l7Var2.f4940a).f4859a.J0.a(0L, true);
                return;
            case 2:
                l7 l7Var3 = this.f4789b;
                if (!l7Var3.f4962r0 && !l7Var3.b()) {
                    if (!oc.d(((jb) l7Var3.f4940a).f4859a)) {
                        l7Var3.f4969w0 = false;
                        l7Var3.J.c(false);
                        l7Var3.K.c(false);
                        l7Var3.L.c(false);
                        return;
                    }
                    l7Var3.f4974z0 = true;
                    l7Var3.A0 = true;
                    ((jb) l7Var3.f4940a).e(new i7(l7Var3, 4), true);
                    return;
                }
                return;
            case 3:
                l7 l7Var4 = this.f4789b;
                if (!l7Var4.f4962r0 && !l7Var4.b()) {
                    rb rbVar = ((jb) l7Var4.f4940a).f4859a.B0;
                    if (rbVar != null) {
                        rbVar.toggleDual();
                    }
                    l7Var4.d(360.0f);
                    l7Var4.f4969w0 = false;
                    l7Var4.J.c(false);
                    l7Var4.K.c(false);
                    l7Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                l7 l7Var5 = this.f4789b;
                l7Var5.Q = currentTimeMillis2;
                l7Var5.f4962r0 = true;
                j7 j7Var = l7Var5.f4940a;
                l7Var5.R = 0L;
                ((jb) j7Var).f4859a.J0.a(0L, true);
                return;
        }
    }
}
