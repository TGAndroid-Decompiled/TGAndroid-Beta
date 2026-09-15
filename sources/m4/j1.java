package m4;
public final class j1 extends b2.k1 {
    public static final Object f14582k = new Object();
    public final b2.k0 e;
    public final boolean f14583f;
    public final boolean f14584g;
    public final boolean h;
    public final b2.e0 f14585i;
    public final long f14586j;

    public j1(k1 k1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.e = k1Var.w();
        this.f14583f = k1Var.d0();
        this.f14584g = k1Var.t0();
        if (!k1Var.w0().p() && k1Var.w0().m(k1Var.l0(), new b2.j1(), 0L).f3060k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (k1Var.M0()) {
            e0Var = b2.e0.f2968f;
        } else {
            e0Var = null;
        }
        this.f14585i = e0Var;
        this.f14586j = e2.d0.Q(k1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f14582k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f2930c;
        Object obj = f14582k;
        h1Var.h(obj, obj, 0, this.f14586j, 0L, bVar, false);
        h1Var.f3010f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f14582k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f14582k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f14583f, this.f14584g, this.f14585i, 0L, this.f14586j, 0, 0, 0L);
        j1Var.f3060k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
