package m4;
public final class l1 extends b2.p1 {
    public static final Object f15278j = new Object();
    public final b2.p0 e;
    public final boolean f15279f;
    public final boolean f15280g;
    public final b2.j0 h;
    public final long f15281i;

    public l1(m1 m1Var) {
        b2.j0 j0Var;
        this.e = m1Var.v();
        this.f15279f = m1Var.e0();
        this.f15280g = m1Var.v0();
        if (m1Var.P0()) {
            j0Var = b2.j0.f2171f;
        } else {
            j0Var = null;
        }
        this.h = j0Var;
        this.f15281i = e2.m0.S(m1Var.z());
    }

    @Override
    public final int b(Object obj) {
        if (f15278j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        m1Var.getClass();
        b2.c cVar = b2.c.f2090c;
        Object obj = f15278j;
        m1Var.h(obj, obj, 0, this.f15281i, 0L, cVar, false);
        m1Var.f2218f = false;
        return m1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f15278j;
    }

    @Override
    public final b2.o1 m(int i10, b2.o1 o1Var, long j10) {
        o1Var.b(f15278j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f15279f, this.f15280g, this.h, 0L, this.f15281i, 0, 0, 0L);
        o1Var.f2269k = false;
        return o1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
