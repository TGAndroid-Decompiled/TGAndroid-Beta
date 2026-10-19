package m4;
public final class l1 extends b2.o1 {
    public static final Object f16636j = new Object();
    public final b2.o0 e;
    public final boolean f16637f;
    public final boolean f16638g;
    public final b2.i0 h;
    public final long f16639i;

    public l1(m1 m1Var) {
        b2.i0 i0Var;
        this.e = m1Var.v();
        this.f16637f = m1Var.e0();
        this.f16638g = m1Var.v0();
        if (m1Var.P0()) {
            i0Var = b2.i0.f3776f;
        } else {
            i0Var = null;
        }
        this.h = i0Var;
        this.f16639i = e2.m0.S(m1Var.z());
    }

    @Override
    public final int b(Object obj) {
        if (f16636j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        l1Var.getClass();
        b2.c cVar = b2.c.f3701c;
        Object obj = f16636j;
        l1Var.h(obj, obj, 0, this.f16639i, 0L, cVar, false);
        l1Var.f3823f = false;
        return l1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f16636j;
    }

    @Override
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        n1Var.b(f16636j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f16637f, this.f16638g, this.h, 0L, this.f16639i, 0, 0, 0L);
        n1Var.f3874k = false;
        return n1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
