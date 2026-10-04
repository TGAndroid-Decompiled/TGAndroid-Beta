package m4;
public final class f0 implements Runnable {
    public final int f16139a;
    public final k0 f16140b;
    public final e1 f16141c;

    public f0(k0 k0Var, e1 e1Var, int i10) {
        this.f16139a = i10;
        this.f16140b = k0Var;
        this.f16141c = e1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f16139a) {
            case 0:
                k0 k0Var = this.f16140b;
                n4.y yVar = k0Var.f16212k;
                e1 e1Var = this.f16141c;
                yVar.Z(k0Var.G(e1Var));
                i0 i0Var = k0Var.f16210i;
                if (e1Var.t().a(17)) {
                    k1Var = e1Var.w0();
                } else {
                    k1Var = b2.k1.f3325a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f16140b;
                k0Var2.f16212k.Z(k0Var2.G(this.f16141c));
                return;
        }
    }
}
