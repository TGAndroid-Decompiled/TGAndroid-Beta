package m4;
public final class f0 implements Runnable {
    public final int f14814a;
    public final k0 f14815b;
    public final e1 f14816c;

    public f0(k0 k0Var, e1 e1Var, int i10) {
        this.f14814a = i10;
        this.f14815b = k0Var;
        this.f14816c = e1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f14814a) {
            case 0:
                k0 k0Var = this.f14815b;
                n4.y yVar = k0Var.f14882k;
                e1 e1Var = this.f14816c;
                yVar.Z(k0Var.G(e1Var));
                i0 i0Var = k0Var.f14880i;
                if (e1Var.t().a(17)) {
                    k1Var = e1Var.w0();
                } else {
                    k1Var = b2.k1.f3075a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f14815b;
                k0Var2.f14882k.Z(k0Var2.G(this.f14816c));
                return;
        }
    }
}
