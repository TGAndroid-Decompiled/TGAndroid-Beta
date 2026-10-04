package m4;
public final class d1 extends b2.k1 {
    public static final Object f16111k = new Object();
    public final b2.k0 f16112e;
    public final boolean f16113f;
    public final boolean f16114g;
    public final boolean h;
    public final b2.e0 f16115i;
    public final long f16116j;

    public d1(e1 e1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.f16112e = e1Var.w();
        this.f16113f = e1Var.d0();
        this.f16114g = e1Var.t0();
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
        this.f16115i = e0Var;
        this.f16116j = e2.d0.Q(e1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f16111k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f3160c;
        Object obj = f16111k;
        h1Var.h(obj, obj, 0, this.f16116j, 0L, bVar, false);
        h1Var.f3252f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f16111k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f16111k, this.f16112e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f16113f, this.f16114g, this.f16115i, 0L, this.f16116j, 0, 0, 0L);
        j1Var.f3308k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
