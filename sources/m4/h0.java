package m4;
public final class h0 implements Runnable {
    public final int f15853a;
    public final m0 f15854b;
    public final g1 f15855c;

    public h0(m0 m0Var, g1 g1Var, int i10) {
        this.f15853a = i10;
        this.f15854b = m0Var;
        this.f15855c = g1Var;
    }

    @Override
    public final void run() {
        b2.k1 k1Var;
        switch (this.f15853a) {
            case 0:
                m0 m0Var = this.f15854b;
                n4.y yVar = m0Var.f15909k;
                g1 g1Var = this.f15855c;
                yVar.W(m0Var.G(g1Var));
                k0 k0Var = m0Var.f15907i;
                if (g1Var.t().a(17)) {
                    k1Var = g1Var.w0();
                } else {
                    k1Var = b2.k1.f3402a;
                }
                k0Var.s(k1Var);
                return;
            default:
                m0 m0Var2 = this.f15854b;
                m0Var2.f15909k.W(m0Var2.G(this.f15855c));
                return;
        }
    }
}
