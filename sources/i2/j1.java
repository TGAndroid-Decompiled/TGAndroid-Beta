package i2;
public final class j1 extends u2.s {
    public final int f10242f = 0;
    public final Object f10243g;

    public j1(b2.k1 k1Var, b2.k0 k0Var) {
        super(k1Var);
        this.f10243g = k0Var;
    }

    @Override
    public b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        switch (this.f10242f) {
            case 0:
                b2.k1 k1Var = this.e;
                b2.h1 f7 = k1Var.f(i10, h1Var, z10);
                if (k1Var.m(f7.f1707c, (b2.j1) this.f10243g, 0L).a()) {
                    f7.h(h1Var.f1705a, h1Var.f1706b, h1Var.f1707c, h1Var.d, h1Var.e, b2.b.f1628c, true);
                } else {
                    f7.f1708f = true;
                }
                return f7;
            default:
                return super.f(i10, h1Var, z10);
        }
    }

    @Override
    public b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        switch (this.f10242f) {
            case 1:
                super.m(i10, j1Var, j3);
                b2.k0 k0Var = (b2.k0) this.f10243g;
                j1Var.f1753c = k0Var;
                b2.f0 f0Var = k0Var.f1771b;
                j1Var.getClass();
                return j1Var;
            default:
                return super.m(i10, j1Var, j3);
        }
    }

    public j1(b2.k1 k1Var) {
        super(k1Var);
        this.f10243g = new b2.j1();
    }
}
