package m4;
public final class f0 implements Runnable {
    public final int f14508a;
    public final l0 f14509b;
    public final k1 f14510c;

    public f0(l0 l0Var, k1 k1Var, int i10) {
        this.f14508a = i10;
        this.f14509b = l0Var;
        this.f14510c = k1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f14508a) {
            case 0:
                l0 l0Var = this.f14509b;
                n4.y yVar = l0Var.f14597k;
                k1 k1Var2 = this.f14510c;
                yVar.Y(l0Var.G(k1Var2));
                j0 j0Var = l0Var.f14595i;
                if (k1Var2.t().a(17)) {
                    k1Var = k1Var2.w0();
                } else {
                    k1Var = b2.k1.f3078a;
                }
                j0Var.s(k1Var);
                return;
            default:
                l0 l0Var2 = this.f14509b;
                l0Var2.f14597k.Y(l0Var2.G(this.f14510c));
                return;
        }
    }
}
