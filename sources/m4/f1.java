package m4;
public final class f1 extends b2.k1 {
    public static final Object f15817k = new Object();
    public final b2.k0 f15818e;
    public final boolean f15819f;
    public final boolean f15820g;
    public final boolean h;
    public final b2.e0 f15821i;
    public final long f15822j;

    public f1(g1 g1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.f15818e = g1Var.w();
        this.f15819f = g1Var.d0();
        this.f15820g = g1Var.t0();
        if (!g1Var.w0().p() && g1Var.w0().m(g1Var.m0(), new b2.j1(), 0L).f3385k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (g1Var.M0()) {
            e0Var = b2.e0.f3281f;
        } else {
            e0Var = null;
        }
        this.f15821i = e0Var;
        this.f15822j = e2.d0.P(g1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f15817k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f3237c;
        Object obj = f15817k;
        h1Var.h(obj, obj, 0, this.f15822j, 0L, bVar, false);
        h1Var.f3329f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f15817k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f15817k, this.f15818e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f15819f, this.f15820g, this.f15821i, 0L, this.f15822j, 0, 0, 0L);
        j1Var.f3385k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
