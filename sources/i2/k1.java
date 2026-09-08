package i2;
public final class k1 extends u2.r {
    public final int f11640f = 0;
    public final Object f11641g;

    public k1(b2.k1 k1Var, b2.k0 k0Var) {
        super(k1Var);
        this.f11641g = k0Var;
    }

    @Override
    public b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        switch (this.f11640f) {
            case 0:
                b2.k1 k1Var = this.f46815e;
                b2.h1 f7 = k1Var.f(i10, h1Var, z10);
                if (k1Var.m(f7.f2083c, (b2.j1) this.f11641g, 0L).a()) {
                    f7.h(h1Var.f2081a, h1Var.f2082b, h1Var.f2083c, h1Var.d, h1Var.f2084e, b2.b.f1993c, true);
                } else {
                    f7.f2085f = true;
                }
                return f7;
            default:
                return super.f(i10, h1Var, z10);
        }
    }

    @Override
    public b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        switch (this.f11640f) {
            case 1:
                super.m(i10, j1Var, j3);
                b2.k0 k0Var = (b2.k0) this.f11641g;
                j1Var.f2135c = k0Var;
                b2.f0 f0Var = k0Var.f2154b;
                j1Var.getClass();
                return j1Var;
            default:
                return super.m(i10, j1Var, j3);
        }
    }

    public k1(b2.k1 k1Var) {
        super(k1Var);
        this.f11641g = new b2.j1();
    }
}
