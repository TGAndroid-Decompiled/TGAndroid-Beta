package i2;
public final class k1 extends u2.r {
    public final int f10767f = 0;
    public final Object f10768g;

    public k1(b2.k1 k1Var, b2.k0 k0Var) {
        super(k1Var);
        this.f10768g = k0Var;
    }

    @Override
    public b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        switch (this.f10767f) {
            case 0:
                b2.k1 k1Var = this.e;
                b2.h1 f7 = k1Var.f(i10, h1Var, z10);
                if (k1Var.m(f7.f3009c, (b2.j1) this.f10768g, 0L).a()) {
                    f7.h(h1Var.f3007a, h1Var.f3008b, h1Var.f3009c, h1Var.d, h1Var.e, b2.b.f2930c, true);
                } else {
                    f7.f3010f = true;
                }
                return f7;
            default:
                return super.f(i10, h1Var, z10);
        }
    }

    @Override
    public b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        switch (this.f10767f) {
            case 1:
                super.m(i10, j1Var, j3);
                b2.k0 k0Var = (b2.k0) this.f10768g;
                j1Var.f3055c = k0Var;
                b2.f0 f0Var = k0Var.f3073b;
                j1Var.getClass();
                return j1Var;
            default:
                return super.m(i10, j1Var, j3);
        }
    }

    public k1(b2.k1 k1Var) {
        super(k1Var);
        this.f10768g = new b2.j1();
    }
}
