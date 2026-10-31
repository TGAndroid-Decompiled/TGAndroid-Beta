package li;

import org.telegram.ui.Components.lz0;
public final class k0 implements Runnable {
    public final int f12102a;
    public final x0 f12103b;
    public final t0 f12104c;

    public k0(x0 x0Var, t0 t0Var, int i10, int i11) {
        this.f12102a = i11;
        this.f12103b = x0Var;
        this.f12104c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f12102a) {
            case 0:
                x0 x0Var = this.f12103b;
                t0 t0Var = this.f12104c;
                ((lz0) x0Var.e).c(t0Var.f12247a);
                return;
            case 1:
                x0 x0Var2 = this.f12103b;
                t0 t0Var2 = this.f12104c;
                u0 u0Var = x0Var2.e;
                long j10 = t0Var2.f12247a;
                lz0 lz0Var = (lz0) u0Var;
                synchronized (lz0Var) {
                    lz0Var.c(j10);
                }
                return;
            default:
                x0 x0Var3 = this.f12103b;
                t0 t0Var3 = this.f12104c;
                ((lz0) x0Var3.e).c(t0Var3.f12247a);
                return;
        }
    }

    public k0(x0 x0Var, t0 t0Var, Exception exc) {
        this.f12102a = 1;
        this.f12103b = x0Var;
        this.f12104c = t0Var;
    }
}
