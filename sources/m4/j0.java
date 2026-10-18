package m4;
public final class j0 implements Runnable {
    public final int f16590a;
    public final p0 f16591b;
    public final m1 f16592c;

    public j0(p0 p0Var, m1 m1Var, int i10) {
        this.f16590a = i10;
        this.f16591b = p0Var;
        this.f16592c = m1Var;
    }

    @Override
    public final void run() {
        b2.o1 o1Var;
        switch (this.f16590a) {
            case 0:
                p0 p0Var = this.f16591b;
                n4.s sVar = p0Var.f16667m;
                m1 m1Var = this.f16592c;
                sVar.J(p0Var.G(m1Var));
                n0 n0Var = p0Var.f16663i;
                if (m1Var.s().a(17)) {
                    o1Var = m1Var.y0();
                } else {
                    o1Var = b2.o1.f3894a;
                }
                n0Var.s(o1Var);
                return;
            default:
                p0 p0Var2 = this.f16591b;
                p0Var2.f16667m.J(p0Var2.G(this.f16592c));
                return;
        }
    }
}
