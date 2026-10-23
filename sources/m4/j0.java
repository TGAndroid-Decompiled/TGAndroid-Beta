package m4;
public final class j0 implements Runnable {
    public final int f16652a;
    public final p0 f16653b;
    public final m1 f16654c;

    public j0(p0 p0Var, m1 m1Var, int i10) {
        this.f16652a = i10;
        this.f16653b = p0Var;
        this.f16654c = m1Var;
    }

    @Override
    public final void run() {
        b2.o1 o1Var;
        switch (this.f16652a) {
            case 0:
                p0 p0Var = this.f16653b;
                n4.s sVar = p0Var.f16729m;
                m1 m1Var = this.f16654c;
                sVar.F(p0Var.G(m1Var));
                n0 n0Var = p0Var.f16725i;
                if (m1Var.s().a(17)) {
                    o1Var = m1Var.y0();
                } else {
                    o1Var = b2.o1.f3897a;
                }
                n0Var.s(o1Var);
                return;
            default:
                p0 p0Var2 = this.f16653b;
                p0Var2.f16729m.F(p0Var2.G(this.f16654c));
                return;
        }
    }
}
