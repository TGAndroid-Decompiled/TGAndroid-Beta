package m4;
public final class m1 extends b2.o1 {
    public static final Object f12860j = new Object();
    public final b2.p0 e;
    public final boolean f12861f;
    public final boolean f12862g;
    public final b2.j0 h;
    public final long f12863i;

    public m1(n1 n1Var) {
        b2.j0 j0Var;
        this.e = n1Var.v();
        this.f12861f = n1Var.d0();
        this.f12862g = n1Var.v0();
        if (n1Var.P0()) {
            j0Var = b2.j0.f2072f;
        } else {
            j0Var = null;
        }
        this.h = j0Var;
        this.f12863i = e2.l0.S(n1Var.z());
    }

    @Override
    public final int b(Object obj) {
        if (f12860j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        l1Var.getClass();
        b2.c cVar = b2.c.f1990c;
        Object obj = f12860j;
        l1Var.h(obj, obj, 0, this.f12863i, 0L, cVar, false);
        l1Var.f2110f = false;
        return l1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f12860j;
    }

    @Override
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        n1Var.b(f12860j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f12861f, this.f12862g, this.h, 0L, this.f12863i, 0, 0, 0L);
        n1Var.f2144k = false;
        return n1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
