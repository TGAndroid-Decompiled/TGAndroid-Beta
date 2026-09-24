package m4;
public final class f0 implements Runnable {
    public final int f14772a;
    public final k0 f14773b;
    public final e1 f14774c;

    public f0(k0 k0Var, e1 e1Var, int i10) {
        this.f14772a = i10;
        this.f14773b = k0Var;
        this.f14774c = e1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f14772a) {
            case 0:
                k0 k0Var = this.f14773b;
                n4.y yVar = k0Var.f14840k;
                e1 e1Var = this.f14774c;
                yVar.Z(k0Var.G(e1Var));
                i0 i0Var = k0Var.f14838i;
                if (e1Var.t().a(17)) {
                    k1Var = e1Var.w0();
                } else {
                    k1Var = b2.k1.f3073a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f14773b;
                k0Var2.f14840k.Z(k0Var2.G(this.f14774c));
                return;
        }
    }
}
