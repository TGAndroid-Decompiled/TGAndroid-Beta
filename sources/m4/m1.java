package m4;
public final class m1 extends b2.p1 {
    public static final Object f15548j = new Object();
    public final b2.p0 e;
    public final boolean f15549f;
    public final boolean f15550g;
    public final b2.j0 h;
    public final long f15551i;

    public m1(n1 n1Var) {
        b2.j0 j0Var;
        this.e = n1Var.v();
        this.f15549f = n1Var.e0();
        this.f15550g = n1Var.v0();
        if (n1Var.P0()) {
            j0Var = b2.j0.f2167f;
        } else {
            j0Var = null;
        }
        this.h = j0Var;
        this.f15551i = e2.m0.S(n1Var.z());
    }

    @Override
    public final int b(Object obj) {
        if (f15548j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.m1 f(int i10, b2.m1 m1Var, boolean z10) {
        m1Var.getClass();
        b2.c cVar = b2.c.f2086c;
        Object obj = f15548j;
        m1Var.h(obj, obj, 0, this.f15551i, 0L, cVar, false);
        m1Var.f2214f = false;
        return m1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f15548j;
    }

    @Override
    public final b2.o1 m(int i10, b2.o1 o1Var, long j10) {
        o1Var.b(f15548j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f15549f, this.f15550g, this.h, 0L, this.f15551i, 0, 0, 0L);
        o1Var.f2265k = false;
        return o1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
