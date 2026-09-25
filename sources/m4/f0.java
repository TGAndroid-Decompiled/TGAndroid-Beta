package m4;
public final class f0 implements Runnable {
    public final int f14787a;
    public final k0 f14788b;
    public final e1 f14789c;

    public f0(k0 k0Var, e1 e1Var, int i10) {
        this.f14787a = i10;
        this.f14788b = k0Var;
        this.f14789c = e1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f14787a) {
            case 0:
                k0 k0Var = this.f14788b;
                n4.y yVar = k0Var.f14855k;
                e1 e1Var = this.f14789c;
                yVar.Z(k0Var.G(e1Var));
                i0 i0Var = k0Var.f14853i;
                if (e1Var.t().a(17)) {
                    k1Var = e1Var.w0();
                } else {
                    k1Var = b2.k1.f3073a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f14788b;
                k0Var2.f14855k.Z(k0Var2.G(this.f14789c));
                return;
        }
    }
}
