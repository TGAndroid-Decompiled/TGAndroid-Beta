package ci;

import android.os.SystemClock;
public final class g7 implements Runnable {
    public final int f4732a;
    public final j7 f4733b;

    public g7(j7 j7Var, int i10) {
        this.f4732a = i10;
        this.f4733b = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f4732a) {
            case 0:
                j7 j7Var = this.f4733b;
                j7Var.f4852r0 = false;
                j7Var.f4864z0 = false;
                j7Var.f4857v0 = SystemClock.elapsedRealtime();
                j7Var.f4856u0 = true;
                j7Var.f4859w0 = false;
                j7Var.J.c(false);
                j7Var.K.c(false);
                j7Var.L.c(false);
                ((fb) j7Var.f4830a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                j7 j7Var2 = this.f4733b;
                j7Var2.Q = currentTimeMillis;
                j7Var2.R = 0L;
                j7Var2.f4852r0 = true;
                ((fb) j7Var2.f4830a).f4711a.J0.a(0L, true);
                return;
            case 2:
                j7 j7Var3 = this.f4733b;
                if (!j7Var3.f4852r0 && !j7Var3.b()) {
                    if (!kc.d(((fb) j7Var3.f4830a).f4711a)) {
                        j7Var3.f4859w0 = false;
                        j7Var3.J.c(false);
                        j7Var3.K.c(false);
                        j7Var3.L.c(false);
                        return;
                    }
                    j7Var3.f4864z0 = true;
                    j7Var3.A0 = true;
                    ((fb) j7Var3.f4830a).e(new g7(j7Var3, 4), true);
                    return;
                }
                return;
            case 3:
                j7 j7Var4 = this.f4733b;
                if (!j7Var4.f4852r0 && !j7Var4.b()) {
                    nb nbVar = ((fb) j7Var4.f4830a).f4711a.B0;
                    if (nbVar != null) {
                        nbVar.toggleDual();
                    }
                    j7Var4.d(360.0f);
                    j7Var4.f4859w0 = false;
                    j7Var4.J.c(false);
                    j7Var4.K.c(false);
                    j7Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                j7 j7Var5 = this.f4733b;
                j7Var5.Q = currentTimeMillis2;
                j7Var5.f4852r0 = true;
                h7 h7Var = j7Var5.f4830a;
                j7Var5.R = 0L;
                ((fb) h7Var).f4711a.J0.a(0L, true);
                return;
        }
    }
}
