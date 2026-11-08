package li;
public final class z0 implements Runnable {
    public final int f19038a;
    public final g1 f19039b;

    public z0(g1 g1Var, int i7) {
        this.f19038a = i7;
        this.f19039b = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f19038a) {
            case 0:
                g1 g1Var = this.f19039b;
                i4 i4Var = g1Var.F2;
                if (i4Var != null && g1Var.Z1 != null) {
                    g1Var.G2 = true;
                    i4Var.b().f23365a.m(false);
                    try {
                        g1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((r2) g1Var.Z1).a(g1Var, g1Var.F2, true);
                    return;
                }
                return;
            case 1:
                this.f19039b.J();
                return;
            default:
                this.f19039b.O();
                return;
        }
    }
}
