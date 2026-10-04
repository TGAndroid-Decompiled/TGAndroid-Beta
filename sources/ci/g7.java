package ci;

import android.os.SystemClock;
public final class g7 implements Runnable {
    public final int f5113a;
    public final j7 f5114b;

    public g7(j7 j7Var, int i10) {
        this.f5113a = i10;
        this.f5114b = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f5113a) {
            case 0:
                j7 j7Var = this.f5114b;
                j7Var.f5239r0 = false;
                j7Var.f5251z0 = false;
                j7Var.f5244v0 = SystemClock.elapsedRealtime();
                j7Var.f5243u0 = true;
                j7Var.f5246w0 = false;
                j7Var.J.c(false);
                j7Var.K.c(false);
                j7Var.L.c(false);
                ((fb) j7Var.f5216a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                j7 j7Var2 = this.f5114b;
                j7Var2.Q = currentTimeMillis;
                j7Var2.R = 0L;
                j7Var2.f5239r0 = true;
                ((fb) j7Var2.f5216a).f5090a.J0.a(0L, true);
                return;
            case 2:
                j7 j7Var3 = this.f5114b;
                if (!j7Var3.f5239r0 && !j7Var3.b()) {
                    if (!kc.d(((fb) j7Var3.f5216a).f5090a)) {
                        j7Var3.f5246w0 = false;
                        j7Var3.J.c(false);
                        j7Var3.K.c(false);
                        j7Var3.L.c(false);
                        return;
                    }
                    j7Var3.f5251z0 = true;
                    j7Var3.A0 = true;
                    ((fb) j7Var3.f5216a).e(new g7(j7Var3, 4), true);
                    return;
                }
                return;
            case 3:
                j7 j7Var4 = this.f5114b;
                if (!j7Var4.f5239r0 && !j7Var4.b()) {
                    nb nbVar = ((fb) j7Var4.f5216a).f5090a.B0;
                    if (nbVar != null) {
                        nbVar.toggleDual();
                    }
                    j7Var4.d(360.0f);
                    j7Var4.f5246w0 = false;
                    j7Var4.J.c(false);
                    j7Var4.K.c(false);
                    j7Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                j7 j7Var5 = this.f5114b;
                j7Var5.Q = currentTimeMillis2;
                j7Var5.f5239r0 = true;
                h7 h7Var = j7Var5.f5216a;
                j7Var5.R = 0L;
                ((fb) h7Var).f5090a.J0.a(0L, true);
                return;
        }
    }
}
