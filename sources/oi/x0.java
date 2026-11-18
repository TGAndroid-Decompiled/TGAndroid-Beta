package oi;
public final class x0 implements Runnable {
    public final int f22447a;
    public final e1 f22448b;

    public x0(e1 e1Var, int i7) {
        this.f22447a = i7;
        this.f22448b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f22447a) {
            case 0:
                e1 e1Var = this.f22448b;
                h4 h4Var = e1Var.L2;
                if (h4Var != null && e1Var.f22011f2 != null) {
                    e1Var.M2 = true;
                    h4Var.b().f23422a.m(false);
                    try {
                        e1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((q2) e1Var.f22011f2).a(e1Var, e1Var.L2, true);
                    return;
                }
                return;
            case 1:
                this.f22448b.K();
                return;
            default:
                this.f22448b.P();
                return;
        }
    }
}
