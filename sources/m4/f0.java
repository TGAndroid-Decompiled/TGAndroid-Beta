package m4;
public final class f0 implements Runnable {
    public final int f15914a;
    public final k0 f15915b;
    public final j1 f15916c;

    public f0(k0 k0Var, j1 j1Var, int i10) {
        this.f15914a = i10;
        this.f15915b = k0Var;
        this.f15916c = j1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f15914a) {
            case 0:
                k0 k0Var = this.f15915b;
                n4.y yVar = k0Var.f16000k;
                j1 j1Var = this.f15916c;
                yVar.L(k0Var.G(j1Var));
                i0 i0Var = k0Var.f15998i;
                if (j1Var.t().a(17)) {
                    k1Var = j1Var.w0();
                } else {
                    k1Var = b2.k1.f2158a;
                }
                i0Var.s(k1Var);
                return;
            default:
                k0 k0Var2 = this.f15915b;
                k0Var2.f16000k.L(k0Var2.G(this.f15916c));
                return;
        }
    }
}
