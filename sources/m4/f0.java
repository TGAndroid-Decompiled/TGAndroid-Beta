package m4;
public final class f0 implements Runnable {
    public final int f14520a;
    public final l0 f14521b;
    public final k1 f14522c;

    public f0(l0 l0Var, k1 k1Var, int i10) {
        this.f14520a = i10;
        this.f14521b = l0Var;
        this.f14522c = k1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f14520a) {
            case 0:
                l0 l0Var = this.f14521b;
                n4.y yVar = l0Var.f14609k;
                k1 k1Var2 = this.f14522c;
                yVar.Y(l0Var.G(k1Var2));
                j0 j0Var = l0Var.f14607i;
                if (k1Var2.t().a(17)) {
                    k1Var = k1Var2.w0();
                } else {
                    k1Var = b2.k1.f3081a;
                }
                j0Var.s(k1Var);
                return;
            default:
                l0 l0Var2 = this.f14521b;
                l0Var2.f14609k.Y(l0Var2.G(this.f14522c));
                return;
        }
    }
}
