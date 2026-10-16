package m4;
public final class i0 implements Runnable {
    public final int f15201a;
    public final p0 f15202b;
    public final m1 f15203c;

    public i0(p0 p0Var, m1 m1Var, int i10) {
        this.f15201a = i10;
        this.f15202b = p0Var;
        this.f15203c = m1Var;
    }

    @Override
    public final void run() {
        b2.p1 p1Var;
        switch (this.f15201a) {
            case 0:
                p0 p0Var = this.f15202b;
                n4.s sVar = p0Var.f15308m;
                m1 m1Var = this.f15203c;
                sVar.D(p0Var.G(m1Var));
                n0 n0Var = p0Var.f15304i;
                if (m1Var.s().a(17)) {
                    p1Var = m1Var.y0();
                } else {
                    p1Var = b2.p1.f2285a;
                }
                n0Var.s(p1Var);
                return;
            default:
                p0 p0Var2 = this.f15202b;
                p0Var2.f15308m.D(p0Var2.G(this.f15203c));
                return;
        }
    }
}
