package m4;
public final class f0 implements Runnable {
    public final int f14533a;
    public final l0 f14534b;
    public final f1 f14535c;

    public f0(l0 l0Var, f1 f1Var, int i10) {
        this.f14533a = i10;
        this.f14534b = l0Var;
        this.f14535c = f1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f14533a) {
            case 0:
                l0 l0Var = this.f14534b;
                n4.y yVar = l0Var.f14610k;
                f1 f1Var = this.f14535c;
                yVar.Y(l0Var.G(f1Var));
                j0 j0Var = l0Var.f14608i;
                if (f1Var.t().a(17)) {
                    k1Var = f1Var.w0();
                } else {
                    k1Var = b2.k1.f3073a;
                }
                j0Var.s(k1Var);
                return;
            default:
                l0 l0Var2 = this.f14534b;
                l0Var2.f14610k.Y(l0Var2.G(this.f14535c));
                return;
        }
    }
}
