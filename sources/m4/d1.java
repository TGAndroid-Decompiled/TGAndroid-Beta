package m4;
public final class d1 extends b2.k1 {
    public static final Object f14749k = new Object();
    public final b2.k0 e;
    public final boolean f14750f;
    public final boolean f14751g;
    public final boolean h;
    public final b2.e0 f14752i;
    public final long f14753j;

    public d1(e1 e1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.e = e1Var.w();
        this.f14750f = e1Var.d0();
        this.f14751g = e1Var.t0();
        if (!e1Var.w0().p() && e1Var.w0().m(e1Var.l0(), new b2.j1(), 0L).f3057k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (e1Var.M0()) {
            e0Var = b2.e0.f2965f;
        } else {
            e0Var = null;
        }
        this.f14752i = e0Var;
        this.f14753j = e2.d0.Q(e1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f14749k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f2927c;
        Object obj = f14749k;
        h1Var.h(obj, obj, 0, this.f14753j, 0L, bVar, false);
        h1Var.f3007f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f14749k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f14749k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f14750f, this.f14751g, this.f14752i, 0L, this.f14753j, 0, 0, 0L);
        j1Var.f3057k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
