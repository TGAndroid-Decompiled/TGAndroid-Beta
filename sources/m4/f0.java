package m4;
public final class f0 implements Runnable {
    public final int f14803a;
    public final k0 f14804b;
    public final e1 f14805c;

    public f0(k0 k0Var, e1 e1Var, int i10) {
        this.f14803a = i10;
        this.f14804b = k0Var;
        this.f14805c = e1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f14803a) {
            case 0:
                k0 k0Var = this.f14804b;
                n4.y yVar = k0Var.f14871k;
                e1 e1Var = this.f14805c;
                yVar.Z(k0Var.G(e1Var));
                i0 i0Var = k0Var.f14869i;
                if (e1Var.t().a(17)) {
                    k1Var = e1Var.w0();
                } else {
                    k1Var = b2.k1.f3080a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f14804b;
                k0Var2.f14871k.Z(k0Var2.G(this.f14805c));
                return;
        }
    }
}
