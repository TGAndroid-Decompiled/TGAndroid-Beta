package o4;
public final class k1 extends d2.n1 {
    public static final Object f20745j = new Object();
    public final d2.n0 f20746e;
    public final boolean f20747f;
    public final boolean f20748g;
    public final d2.h0 h;
    public final long f20749i;

    public k1(l1 l1Var) {
        d2.h0 h0Var;
        this.f20746e = l1Var.w();
        this.f20747f = l1Var.c0();
        this.f20748g = l1Var.s0();
        if (l1Var.P0()) {
            h0Var = d2.h0.f8116f;
        } else {
            h0Var = null;
        }
        this.h = h0Var;
        this.f20749i = g2.n0.S(l1Var.A());
    }

    @Override
    public final int b(Object obj) {
        if (f20745j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final d2.k1 f(int i3, d2.k1 k1Var, boolean z10) {
        k1Var.getClass();
        d2.c cVar = d2.c.f8039c;
        Object obj = f20745j;
        k1Var.h(obj, obj, 0, this.f20749i, 0L, cVar, false);
        k1Var.f8165f = false;
        return k1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i3) {
        return f20745j;
    }

    @Override
    public final d2.m1 m(int i3, d2.m1 m1Var, long j10) {
        m1Var.b(f20745j, this.f20746e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f20747f, this.f20748g, this.h, 0L, this.f20749i, 0, 0, 0L);
        m1Var.f8216k = false;
        return m1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
