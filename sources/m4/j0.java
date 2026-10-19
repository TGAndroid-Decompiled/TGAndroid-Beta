package m4;
public final class j0 implements Runnable {
    public final int f16591a;
    public final p0 f16592b;
    public final m1 f16593c;

    public j0(p0 p0Var, m1 m1Var, int i10) {
        this.f16591a = i10;
        this.f16592b = p0Var;
        this.f16593c = m1Var;
    }

    @Override
    public final void run() {
        b2.o1 o1Var;
        switch (this.f16591a) {
            case 0:
                p0 p0Var = this.f16592b;
                n4.s sVar = p0Var.f16668m;
                m1 m1Var = this.f16593c;
                sVar.F(p0Var.G(m1Var));
                n0 n0Var = p0Var.f16664i;
                if (m1Var.s().a(17)) {
                    o1Var = m1Var.y0();
                } else {
                    o1Var = b2.o1.f3892a;
                }
                n0Var.s(o1Var);
                return;
            default:
                p0 p0Var2 = this.f16592b;
                p0Var2.f16668m.F(p0Var2.G(this.f16593c));
                return;
        }
    }
}
