package oi;
public final class x0 implements Runnable {
    public final int f22473a;
    public final e1 f22474b;

    public x0(e1 e1Var, int i7) {
        this.f22473a = i7;
        this.f22474b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f22473a) {
            case 0:
                e1 e1Var = this.f22474b;
                h4 h4Var = e1Var.L2;
                if (h4Var != null && e1Var.f22037f2 != null) {
                    e1Var.M2 = true;
                    h4Var.b().f23578a.m(false);
                    try {
                        e1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((q2) e1Var.f22037f2).a(e1Var, e1Var.L2, true);
                    return;
                }
                return;
            case 1:
                this.f22474b.K();
                return;
            default:
                this.f22474b.P();
                return;
        }
    }
}
