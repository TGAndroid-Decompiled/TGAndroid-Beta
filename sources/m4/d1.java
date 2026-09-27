package m4;
public final class d1 extends b2.k1 {
    public static final Object f14791k = new Object();
    public final b2.k0 e;
    public final boolean f14792f;
    public final boolean f14793g;
    public final boolean h;
    public final b2.e0 f14794i;
    public final long f14795j;

    public d1(e1 e1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.e = e1Var.w();
        this.f14792f = e1Var.d0();
        this.f14793g = e1Var.t0();
        if (!e1Var.w0().p() && e1Var.w0().m(e1Var.l0(), new b2.j1(), 0L).f3059k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (e1Var.M0()) {
            e0Var = b2.e0.f2967f;
        } else {
            e0Var = null;
        }
        this.f14794i = e0Var;
        this.f14795j = e2.d0.Q(e1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f14791k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f2929c;
        Object obj = f14791k;
        h1Var.h(obj, obj, 0, this.f14795j, 0L, bVar, false);
        h1Var.f3009f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f14791k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f14791k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f14792f, this.f14793g, this.f14794i, 0L, this.f14795j, 0, 0, 0L);
        j1Var.f3059k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
