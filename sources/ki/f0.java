package ki;

import org.telegram.ui.Components.g11;
public final class f0 implements Runnable {
    public final int f14922a;
    public final t0 f14923b;
    public final p0 f14924c;

    public f0(t0 t0Var, p0 p0Var, int i10, int i11) {
        this.f14922a = i11;
        this.f14923b = t0Var;
        this.f14924c = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f14922a) {
            case 0:
                t0 t0Var = this.f14923b;
                p0 p0Var = this.f14924c;
                ((g11) t0Var.f15116e).c(p0Var.f15067a);
                return;
            case 1:
                t0 t0Var2 = this.f14923b;
                p0 p0Var2 = this.f14924c;
                ((g11) t0Var2.f15116e).c(p0Var2.f15067a);
                return;
            default:
                t0 t0Var3 = this.f14923b;
                p0 p0Var3 = this.f14924c;
                q0 q0Var = t0Var3.f15116e;
                long j3 = p0Var3.f15067a;
                g11 g11Var = (g11) q0Var;
                synchronized (g11Var) {
                    g11Var.c(j3);
                }
                return;
        }
    }

    public f0(t0 t0Var, p0 p0Var, Exception exc) {
        this.f14922a = 2;
        this.f14923b = t0Var;
        this.f14924c = p0Var;
    }
}
