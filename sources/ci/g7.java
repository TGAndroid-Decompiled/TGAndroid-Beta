package ci;

import android.os.SystemClock;
public final class g7 implements Runnable {
    public final int f5112a;
    public final j7 f5113b;

    public g7(j7 j7Var, int i10) {
        this.f5112a = i10;
        this.f5113b = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f5112a) {
            case 0:
                j7 j7Var = this.f5113b;
                j7Var.f5238r0 = false;
                j7Var.f5250z0 = false;
                j7Var.f5243v0 = SystemClock.elapsedRealtime();
                j7Var.f5242u0 = true;
                j7Var.f5245w0 = false;
                j7Var.J.c(false);
                j7Var.K.c(false);
                j7Var.L.c(false);
                ((fb) j7Var.f5215a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                j7 j7Var2 = this.f5113b;
                j7Var2.Q = currentTimeMillis;
                j7Var2.R = 0L;
                j7Var2.f5238r0 = true;
                ((fb) j7Var2.f5215a).f5089a.J0.a(0L, true);
                return;
            case 2:
                j7 j7Var3 = this.f5113b;
                if (!j7Var3.f5238r0 && !j7Var3.b()) {
                    if (!kc.d(((fb) j7Var3.f5215a).f5089a)) {
                        j7Var3.f5245w0 = false;
                        j7Var3.J.c(false);
                        j7Var3.K.c(false);
                        j7Var3.L.c(false);
                        return;
                    }
                    j7Var3.f5250z0 = true;
                    j7Var3.A0 = true;
                    ((fb) j7Var3.f5215a).e(new g7(j7Var3, 4), true);
                    return;
                }
                return;
            case 3:
                j7 j7Var4 = this.f5113b;
                if (!j7Var4.f5238r0 && !j7Var4.b()) {
                    nb nbVar = ((fb) j7Var4.f5215a).f5089a.B0;
                    if (nbVar != null) {
                        nbVar.toggleDual();
                    }
                    j7Var4.d(360.0f);
                    j7Var4.f5245w0 = false;
                    j7Var4.J.c(false);
                    j7Var4.K.c(false);
                    j7Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                j7 j7Var5 = this.f5113b;
                j7Var5.Q = currentTimeMillis2;
                j7Var5.f5238r0 = true;
                h7 h7Var = j7Var5.f5215a;
                j7Var5.R = 0L;
                ((fb) h7Var).f5089a.J0.a(0L, true);
                return;
        }
    }
}
