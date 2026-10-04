package m4;
public final class d1 extends b2.k1 {
    public static final Object f16112k = new Object();
    public final b2.k0 f16113e;
    public final boolean f16114f;
    public final boolean f16115g;
    public final boolean h;
    public final b2.e0 f16116i;
    public final long f16117j;

    public d1(e1 e1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.f16113e = e1Var.w();
        this.f16114f = e1Var.d0();
        this.f16115g = e1Var.t0();
        if (!e1Var.w0().p() && e1Var.w0().m(e1Var.l0(), new b2.j1(), 0L).f3308k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (e1Var.M0()) {
            e0Var = b2.e0.f3204f;
        } else {
            e0Var = null;
        }
        this.f16116i = e0Var;
        this.f16117j = e2.d0.Q(e1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f16112k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f3160c;
        Object obj = f16112k;
        h1Var.h(obj, obj, 0, this.f16117j, 0L, bVar, false);
        h1Var.f3252f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f16112k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f16112k, this.f16113e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f16114f, this.f16115g, this.f16116i, 0L, this.f16117j, 0, 0, 0L);
        j1Var.f3308k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
