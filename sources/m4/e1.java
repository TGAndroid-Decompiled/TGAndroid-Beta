package m4;
public final class e1 extends b2.k1 {
    public static final Object f16059k = new Object();
    public final b2.k0 f16060e;
    public final boolean f16061f;
    public final boolean f16062g;
    public final boolean h;
    public final b2.e0 f16063i;
    public final long f16064j;

    public e1(f1 f1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.f16060e = f1Var.w();
        this.f16061f = f1Var.d0();
        this.f16062g = f1Var.t0();
        if (!f1Var.w0().p() && f1Var.w0().m(f1Var.l0(), new b2.j1(), 0L).f3387k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (f1Var.M0()) {
            e0Var = b2.e0.f3283f;
        } else {
            e0Var = null;
        }
        this.f16063i = e0Var;
        this.f16064j = e2.d0.P(f1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f16059k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f3239c;
        Object obj = f16059k;
        h1Var.h(obj, obj, 0, this.f16064j, 0L, bVar, false);
        h1Var.f3331f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f16059k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f16059k, this.f16060e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f16061f, this.f16062g, this.f16063i, 0L, this.f16064j, 0, 0, 0L);
        j1Var.f3387k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
