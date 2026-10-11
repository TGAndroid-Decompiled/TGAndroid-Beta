package m4;
public final class g0 implements Runnable {
    public final int f16162a;
    public final l0 f16163b;
    public final g1 f16164c;

    public g0(l0 l0Var, g1 g1Var, int i10) {
        this.f16162a = i10;
        this.f16163b = l0Var;
        this.f16164c = g1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f16162a) {
            case 0:
                l0 l0Var = this.f16163b;
                n4.x xVar = l0Var.f16201k;
                g1 g1Var = this.f16164c;
                xVar.W(l0Var.G(g1Var));
                j0 j0Var = l0Var.f16199i;
                if (g1Var.t().a(17)) {
                    k1Var = g1Var.w0();
                } else {
                    k1Var = b2.k1.f3404a;
                }
                j0Var.s(k1Var);
                return;
            default:
                l0 l0Var2 = this.f16163b;
                l0Var2.f16201k.W(l0Var2.G(this.f16164c));
                return;
        }
    }
}
