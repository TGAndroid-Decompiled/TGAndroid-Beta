package m4;
public final class j0 implements Runnable {
    public final int f16583a;
    public final p0 f16584b;
    public final m1 f16585c;

    public j0(p0 p0Var, m1 m1Var, int i10) {
        this.f16583a = i10;
        this.f16584b = p0Var;
        this.f16585c = m1Var;
    }

    @Override
    public final void run() {
        b2.o1 o1Var;
        switch (this.f16583a) {
            case 0:
                p0 p0Var = this.f16584b;
                n4.s sVar = p0Var.f16660m;
                m1 m1Var = this.f16585c;
                sVar.J(p0Var.G(m1Var));
                n0 n0Var = p0Var.f16656i;
                if (m1Var.s().a(17)) {
                    o1Var = m1Var.y0();
                } else {
                    o1Var = b2.o1.f3893a;
                }
                n0Var.s(o1Var);
                return;
            default:
                p0 p0Var2 = this.f16584b;
                p0Var2.f16660m.J(p0Var2.G(this.f16585c));
                return;
        }
    }
}
