package di;

import android.os.SystemClock;
public final class f7 implements Runnable {
    public final int f6948a;
    public final i7 f6949b;

    public f7(i7 i7Var, int i10) {
        this.f6948a = i10;
        this.f6949b = i7Var;
    }

    @Override
    public final void run() {
        switch (this.f6948a) {
            case 0:
                i7 i7Var = this.f6949b;
                i7Var.f7070r0 = false;
                i7Var.f7082z0 = false;
                i7Var.f7075v0 = SystemClock.elapsedRealtime();
                i7Var.f7074u0 = true;
                i7Var.f7077w0 = false;
                i7Var.J.c(false);
                i7Var.K.c(false);
                i7Var.L.c(false);
                ((fb) i7Var.f7048a).e(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                i7 i7Var2 = this.f6949b;
                i7Var2.Q = currentTimeMillis;
                i7Var2.R = 0L;
                i7Var2.f7070r0 = true;
                ((fb) i7Var2.f7048a).f6957a.J0.a(0L, true);
                return;
            case 2:
                i7 i7Var3 = this.f6949b;
                if (!i7Var3.f7070r0 && !i7Var3.b()) {
                    if (!kc.c(((fb) i7Var3.f7048a).f6957a)) {
                        i7Var3.f7077w0 = false;
                        i7Var3.J.c(false);
                        i7Var3.K.c(false);
                        i7Var3.L.c(false);
                        return;
                    }
                    i7Var3.f7082z0 = true;
                    i7Var3.A0 = true;
                    ((fb) i7Var3.f7048a).f(new f7(i7Var3, 4), true);
                    return;
                }
                return;
            case 3:
                i7 i7Var4 = this.f6949b;
                if (!i7Var4.f7070r0 && !i7Var4.b()) {
                    nb nbVar = ((fb) i7Var4.f7048a).f6957a.B0;
                    if (nbVar != null) {
                        nbVar.toggleDual();
                    }
                    i7Var4.d(360.0f);
                    i7Var4.f7077w0 = false;
                    i7Var4.J.c(false);
                    i7Var4.K.c(false);
                    i7Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                i7 i7Var5 = this.f6949b;
                i7Var5.Q = currentTimeMillis2;
                i7Var5.f7070r0 = true;
                g7 g7Var = i7Var5.f7048a;
                i7Var5.R = 0L;
                ((fb) g7Var).f6957a.J0.a(0L, true);
                return;
        }
    }
}
