package m4;
public final class j1 extends b2.k1 {
    public static final Object f14580k = new Object();
    public final b2.k0 e;
    public final boolean f14581f;
    public final boolean f14582g;
    public final boolean h;
    public final b2.e0 f14583i;
    public final long f14584j;

    public j1(k1 k1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.e = k1Var.w();
        this.f14581f = k1Var.d0();
        this.f14582g = k1Var.t0();
        if (!k1Var.w0().p() && k1Var.w0().m(k1Var.l0(), new b2.j1(), 0L).f3062k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (k1Var.M0()) {
            e0Var = b2.e0.f2970f;
        } else {
            e0Var = null;
        }
        this.f14583i = e0Var;
        this.f14584j = e2.d0.Q(k1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f14580k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f2932c;
        Object obj = f14580k;
        h1Var.h(obj, obj, 0, this.f14584j, 0L, bVar, false);
        h1Var.f3012f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f14580k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f14580k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f14581f, this.f14582g, this.f14583i, 0L, this.f14584j, 0, 0, 0L);
        j1Var.f3062k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
