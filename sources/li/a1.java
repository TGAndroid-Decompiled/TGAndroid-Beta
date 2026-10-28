package li;
public final class a1 implements Runnable {
    public final int f17072a;
    public final g1 f17073b;

    public a1(g1 g1Var, int i10) {
        this.f17072a = i10;
        this.f17073b = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f17072a) {
            case 0:
                g1 g1Var = this.f17073b;
                k4 k4Var = g1Var.W;
                if (k4Var != null && g1Var.d != null) {
                    g1Var.f17245a0 = true;
                    k4Var.b().setPressed(false);
                    try {
                        g1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((r2) g1Var.d).a(g1Var, g1Var.W, true);
                    return;
                }
                return;
            case 1:
                this.f17073b.n();
                return;
            default:
                this.f17073b.s();
                return;
        }
    }
}
