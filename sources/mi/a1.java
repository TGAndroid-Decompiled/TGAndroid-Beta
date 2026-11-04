package mi;
public final class a1 implements Runnable {
    public final int f19450a;
    public final h1 f19451b;

    public a1(h1 h1Var, int i3) {
        this.f19450a = i3;
        this.f19451b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f19450a) {
            case 0:
                h1 h1Var = this.f19451b;
                j4 j4Var = h1Var.G2;
                if (j4Var != null && h1Var.f19646a2 != null) {
                    h1Var.H2 = true;
                    j4Var.b().f21585a.m(false);
                    try {
                        h1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((s2) h1Var.f19646a2).a(h1Var, h1Var.G2, true);
                    return;
                }
                return;
            case 1:
                this.f19451b.J();
                return;
            default:
                this.f19451b.O();
                return;
        }
    }
}
