package m4;
public final class i1 extends b2.k1 {
    public static final Object f14812k = new Object();
    public final b2.k0 e;
    public final boolean f14813f;
    public final boolean f14814g;
    public final boolean h;
    public final b2.e0 f14815i;
    public final long f14816j;

    public i1(j1 j1Var) {
        boolean z10;
        b2.e0 e0Var;
        this.e = j1Var.w();
        this.f14813f = j1Var.d0();
        this.f14814g = j1Var.t0();
        if (!j1Var.w0().p() && j1Var.w0().m(j1Var.l0(), new b2.j1(), 0L).f3064k) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j1Var.M0()) {
            e0Var = b2.e0.f2972f;
        } else {
            e0Var = null;
        }
        this.f14815i = e0Var;
        this.f14816j = e2.d0.Q(j1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f14812k.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.h1 f(int i10, b2.h1 h1Var, boolean z10) {
        h1Var.getClass();
        b2.b bVar = b2.b.f2934c;
        Object obj = f14812k;
        h1Var.h(obj, obj, 0, this.f14816j, 0L, bVar, false);
        h1Var.f3014f = this.h;
        return h1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f14812k;
    }

    @Override
    public final b2.j1 m(int i10, b2.j1 j1Var, long j3) {
        j1Var.b(f14812k, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f14813f, this.f14814g, this.f14815i, 0L, this.f14816j, 0, 0, 0L);
        j1Var.f3064k = this.h;
        return j1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
