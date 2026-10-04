package m4;
public final class f0 implements Runnable {
    public final int f16138a;
    public final k0 f16139b;
    public final e1 f16140c;

    public f0(k0 k0Var, e1 e1Var, int i10) {
        this.f16138a = i10;
        this.f16139b = k0Var;
        this.f16140c = e1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f16138a) {
            case 0:
                k0 k0Var = this.f16139b;
                n4.y yVar = k0Var.f16211k;
                e1 e1Var = this.f16140c;
                yVar.Z(k0Var.G(e1Var));
                i0 i0Var = k0Var.f16209i;
                if (e1Var.t().a(17)) {
                    k1Var = e1Var.w0();
                } else {
                    k1Var = b2.k1.f3325a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f16139b;
                k0Var2.f16211k.Z(k0Var2.G(this.f16140c));
                return;
        }
    }
}
