package m4;
public final class f0 implements Runnable {
    public final int f15887a;
    public final k0 f15888b;
    public final j1 f15889c;

    public f0(k0 k0Var, j1 j1Var, int i10) {
        this.f15887a = i10;
        this.f15888b = k0Var;
        this.f15889c = j1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f15887a) {
            case 0:
                k0 k0Var = this.f15888b;
                n4.y yVar = k0Var.f15973k;
                j1 j1Var = this.f15889c;
                yVar.L(k0Var.G(j1Var));
                i0 i0Var = k0Var.f15971i;
                if (j1Var.t().a(17)) {
                    k1Var = j1Var.w0();
                } else {
                    k1Var = b2.k1.f2131a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f15888b;
                k0Var2.f15973k.L(k0Var2.G(this.f15889c));
                return;
        }
    }
}
