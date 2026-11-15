package oi;
public final class x0 implements Runnable {
    public final int f22111a;
    public final e1 f22112b;

    public x0(e1 e1Var, int i7) {
        this.f22111a = i7;
        this.f22112b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f22111a) {
            case 0:
                e1 e1Var = this.f22112b;
                f4 f4Var = e1Var.L2;
                if (f4Var != null && e1Var.f21654f2 != null) {
                    e1Var.M2 = true;
                    f4Var.b().f23550a.m(false);
                    try {
                        e1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((p2) e1Var.f21654f2).a(e1Var, e1Var.L2, true);
                    return;
                }
                return;
            case 1:
                this.f22112b.K();
                return;
            default:
                this.f22112b.P();
                return;
        }
    }
}
