package m4;
public final class f0 implements Runnable {
    public final int f14692a;
    public final k0 f14693b;
    public final j1 f14694c;

    public f0(k0 k0Var, j1 j1Var, int i10) {
        this.f14692a = i10;
        this.f14693b = k0Var;
        this.f14694c = j1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f14692a) {
            case 0:
                k0 k0Var = this.f14693b;
                n4.y yVar = k0Var.f14773k;
                j1 j1Var = this.f14694c;
                yVar.Z(k0Var.G(j1Var));
                i0 i0Var = k0Var.f14771i;
                if (j1Var.t().a(17)) {
                    k1Var = j1Var.w0();
                } else {
                    k1Var = b2.k1.f3081a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f14693b;
                k0Var2.f14773k.Z(k0Var2.G(this.f14694c));
                return;
        }
    }
}
