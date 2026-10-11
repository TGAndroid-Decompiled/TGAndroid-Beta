package m4;
public final class f1 extends b2.k1 {
    public static final Object f16098k = new Object();
    public final b2.k0 f16099e;
    public final boolean f16100f;
    public final boolean f16101g;
    public final boolean h;
    public final b2.e0 f16102i;
    public final long f16103j;

    public f1(g1 g1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.f16099e = g1Var.w();
        this.f16100f = g1Var.d0();
        this.f16101g = g1Var.t0();
        if (!g1Var.w0().p() && g1Var.w0().m(g1Var.l0(), new b2.j1(), 0L).f3387k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (g1Var.M0()) {
            e0Var = b2.e0.f3283f;
        } else {
            e0Var = null;
        }
        this.f16102i = e0Var;
        this.f16103j = e2.d0.P(g1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f16098k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f3239c;
        Object obj = f16098k;
        h1Var.h(obj, obj, 0, this.f16103j, 0L, bVar, false);
        h1Var.f3331f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f16098k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f16098k, this.f16099e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f16100f, this.f16101g, this.f16102i, 0L, this.f16103j, 0, 0, 0L);
        j1Var.f3387k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
