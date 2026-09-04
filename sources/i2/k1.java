package i2;
public final class k1 extends u2.r {
    public final int f11614f = 0;
    public final Object f11615g;

    public k1(b2.k1 k1Var, b2.k0 k0Var) {
        super(k1Var);
        this.f11615g = k0Var;
    }

    @Override
    public b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        switch (this.f11614f) {
            case 0:
                b2.k1 k1Var = this.f46787e;
                b2.h1 f7 = k1Var.f(i10, h1Var, z10);
                if (k1Var.m(f7.f2056c, (b2.j1) this.f11615g, 0L).a()) {
                    f7.h(h1Var.f2054a, h1Var.f2055b, h1Var.f2056c, h1Var.d, h1Var.f2057e, b2.b.f1966c, true);
                } else {
                    f7.f2058f = true;
                }
                return f7;
            default:
                return super.f(i10, h1Var, z10);
        }
    }

    @Override
    public b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        switch (this.f11614f) {
            case 1:
                super.m(i10, j1Var, j3);
                b2.k0 k0Var = (b2.k0) this.f11615g;
                j1Var.f2108c = k0Var;
                b2.f0 f0Var = k0Var.f2127b;
                j1Var.getClass();
                return j1Var;
            default:
                return super.m(i10, j1Var, j3);
        }
    }

    public k1(b2.k1 k1Var) {
        super(k1Var);
        this.f11615g = new b2.j1();
    }
}
