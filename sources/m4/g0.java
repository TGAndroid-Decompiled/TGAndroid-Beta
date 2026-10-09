package m4;
public final class g0 implements Runnable {
    public final int f16102a;
    public final l0 f16103b;
    public final f1 f16104c;

    public g0(l0 l0Var, f1 f1Var, int i10) {
        this.f16102a = i10;
        this.f16103b = l0Var;
        this.f16104c = f1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f16102a) {
            case 0:
                l0 l0Var = this.f16103b;
                n4.x xVar = l0Var.f16159k;
                f1 f1Var = this.f16104c;
                xVar.b0(l0Var.G(f1Var));
                j0 j0Var = l0Var.f16157i;
                if (f1Var.t().a(17)) {
                    k1Var = f1Var.w0();
                } else {
                    k1Var = b2.k1.f3404a;
                }
                j0Var.s(k1Var);
                return;
            default:
                l0 l0Var2 = this.f16103b;
                l0Var2.f16159k.b0(l0Var2.G(this.f16104c));
                return;
        }
    }
}
