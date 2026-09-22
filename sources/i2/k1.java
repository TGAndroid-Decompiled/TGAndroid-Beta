package i2;
public final class k1 extends u2.r {
    public final int f10771f = 0;
    public final Object f10772g;

    public k1(b2.k1 k1Var, b2.k0 k0Var) {
        super(k1Var);
        this.f10772g = k0Var;
    }

    @Override
    public b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        switch (this.f10771f) {
            case 0:
                b2.k1 k1Var = this.e;
                b2.h1 f7 = k1Var.f(i10, h1Var, z10);
                if (k1Var.m(f7.f3013c, (b2.j1) this.f10772g, 0L).a()) {
                    f7.h(h1Var.f3011a, h1Var.f3012b, h1Var.f3013c, h1Var.d, h1Var.e, b2.b.f2934c, true);
                } else {
                    f7.f3014f = true;
                }
                return f7;
            default:
                return super.f(i10, h1Var, z10);
        }
    }

    @Override
    public b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        switch (this.f10771f) {
            case 1:
                super.m(i10, j1Var, j3);
                b2.k0 k0Var = (b2.k0) this.f10772g;
                j1Var.f3059c = k0Var;
                b2.f0 f0Var = k0Var.f3077b;
                j1Var.getClass();
                return j1Var;
            default:
                return super.m(i10, j1Var, j3);
        }
    }

    public k1(b2.k1 k1Var) {
        super(k1Var);
        this.f10772g = new b2.j1();
    }
}
