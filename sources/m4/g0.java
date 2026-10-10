package m4;
public final class g0 implements Runnable {
    public final int f16106a;
    public final l0 f16107b;
    public final f1 f16108c;

    public g0(l0 l0Var, f1 f1Var, int i10) {
        this.f16106a = i10;
        this.f16107b = l0Var;
        this.f16108c = f1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f16106a) {
            case 0:
                l0 l0Var = this.f16107b;
                n4.x xVar = l0Var.f16163k;
                f1 f1Var = this.f16108c;
                xVar.b0(l0Var.G(f1Var));
                j0 j0Var = l0Var.f16161i;
                if (f1Var.t().a(17)) {
                    k1Var = f1Var.w0();
                } else {
                    k1Var = b2.k1.f3404a;
                }
                j0Var.s(k1Var);
                return;
            default:
                l0 l0Var2 = this.f16107b;
                l0Var2.f16163k.b0(l0Var2.G(this.f16108c));
                return;
        }
    }
}
