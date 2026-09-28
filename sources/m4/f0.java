package m4;
public final class f0 implements Runnable {
    public final int f14788a;
    public final k0 f14789b;
    public final e1 f14790c;

    public f0(k0 k0Var, e1 e1Var, int i10) {
        this.f14788a = i10;
        this.f14789b = k0Var;
        this.f14790c = e1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f14788a) {
            case 0:
                k0 k0Var = this.f14789b;
                n4.y yVar = k0Var.f14856k;
                e1 e1Var = this.f14790c;
                yVar.Z(k0Var.G(e1Var));
                i0 i0Var = k0Var.f14854i;
                if (e1Var.t().a(17)) {
                    k1Var = e1Var.w0();
                } else {
                    k1Var = b2.k1.f3073a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f14789b;
                k0Var2.f14856k.Z(k0Var2.G(this.f14790c));
                return;
        }
    }
}
