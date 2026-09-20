package m4;
public final class f0 implements Runnable {
    public final int f14728a;
    public final k0 f14729b;
    public final j1 f14730c;

    public f0(k0 k0Var, j1 j1Var, int i10) {
        this.f14728a = i10;
        this.f14729b = k0Var;
        this.f14730c = j1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f14728a) {
            case 0:
                k0 k0Var = this.f14729b;
                n4.y yVar = k0Var.f14809k;
                j1 j1Var = this.f14730c;
                yVar.a0(k0Var.G(j1Var));
                i0 i0Var = k0Var.f14807i;
                if (j1Var.t().a(17)) {
                    k1Var = j1Var.w0();
                } else {
                    k1Var = b2.k1.f3081a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f14729b;
                k0Var2.f14809k.a0(k0Var2.G(this.f14730c));
                return;
        }
    }
}
