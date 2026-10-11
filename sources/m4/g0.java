package m4;
public final class g0 implements Runnable {
    public final int f16126a;
    public final l0 f16127b;
    public final g1 f16128c;

    public g0(l0 l0Var, g1 g1Var, int i10) {
        this.f16126a = i10;
        this.f16127b = l0Var;
        this.f16128c = g1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f16126a) {
            case 0:
                l0 l0Var = this.f16127b;
                n4.x xVar = l0Var.f16165k;
                g1 g1Var = this.f16128c;
                xVar.W(l0Var.G(g1Var));
                j0 j0Var = l0Var.f16163i;
                if (g1Var.t().a(17)) {
                    k1Var = g1Var.w0();
                } else {
                    k1Var = b2.k1.f3404a;
                }
                j0Var.s(k1Var);
                return;
            default:
                l0 l0Var2 = this.f16127b;
                l0Var2.f16165k.W(l0Var2.G(this.f16128c));
                return;
        }
    }
}
