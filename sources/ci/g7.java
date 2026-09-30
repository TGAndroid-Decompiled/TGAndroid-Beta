package ci;

import android.os.SystemClock;
public final class g7 implements Runnable {
    public final int f4733a;
    public final j7 f4734b;

    public g7(j7 j7Var, int i10) {
        this.f4733a = i10;
        this.f4734b = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f4733a) {
            case 0:
                j7 j7Var = this.f4734b;
                j7Var.f4858r0 = false;
                j7Var.f4870z0 = false;
                j7Var.f4863v0 = SystemClock.elapsedRealtime();
                j7Var.f4862u0 = true;
                j7Var.f4865w0 = false;
                j7Var.J.c(false);
                j7Var.K.c(false);
                j7Var.L.c(false);
                ((gb) j7Var.f4836a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                j7 j7Var2 = this.f4734b;
                j7Var2.Q = currentTimeMillis;
                j7Var2.R = 0L;
                j7Var2.f4858r0 = true;
                ((gb) j7Var2.f4836a).f4742a.J0.a(0L, true);
                return;
            case 2:
                j7 j7Var3 = this.f4734b;
                if (!j7Var3.f4858r0 && !j7Var3.b()) {
                    if (!lc.d(((gb) j7Var3.f4836a).f4742a)) {
                        j7Var3.f4865w0 = false;
                        j7Var3.J.c(false);
                        j7Var3.K.c(false);
                        j7Var3.L.c(false);
                        return;
                    }
                    j7Var3.f4870z0 = true;
                    j7Var3.A0 = true;
                    ((gb) j7Var3.f4836a).e(new g7(j7Var3, 4), true);
                    return;
                }
                return;
            case 3:
                j7 j7Var4 = this.f4734b;
                if (!j7Var4.f4858r0 && !j7Var4.b()) {
                    ob obVar = ((gb) j7Var4.f4836a).f4742a.B0;
                    if (obVar != null) {
                        obVar.toggleDual();
                    }
                    j7Var4.d(360.0f);
                    j7Var4.f4865w0 = false;
                    j7Var4.J.c(false);
                    j7Var4.K.c(false);
                    j7Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                j7 j7Var5 = this.f4734b;
                j7Var5.Q = currentTimeMillis2;
                j7Var5.f4858r0 = true;
                h7 h7Var = j7Var5.f4836a;
                j7Var5.R = 0L;
                ((gb) h7Var).f4742a.J0.a(0L, true);
                return;
        }
    }
}
