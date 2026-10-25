package li;
public final class a1 implements Runnable {
    public final int f17073a;
    public final g1 f17074b;

    public a1(g1 g1Var, int i10) {
        this.f17073a = i10;
        this.f17074b = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f17073a) {
            case 0:
                g1 g1Var = this.f17074b;
                k4 k4Var = g1Var.W;
                if (k4Var != null && g1Var.d != null) {
                    g1Var.f17246a0 = true;
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
                this.f17074b.n();
                return;
            default:
                this.f17074b.s();
                return;
        }
    }
}
