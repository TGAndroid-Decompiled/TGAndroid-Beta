package m4;
public final class l1 extends b2.o1 {
    public static final Object f16630j = new Object();
    public final b2.o0 e;
    public final boolean f16631f;
    public final boolean f16632g;
    public final b2.i0 h;
    public final long f16633i;

    public l1(m1 m1Var) {
        b2.i0 i0Var;
        this.e = m1Var.v();
        this.f16631f = m1Var.e0();
        this.f16632g = m1Var.v0();
        if (m1Var.P0()) {
            i0Var = b2.i0.f3779f;
        } else {
            i0Var = null;
        }
        this.h = i0Var;
        this.f16633i = e2.m0.S(m1Var.z());
    }

    @Override
    public final int b(Object obj) {
        if (f16630j.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override
    public final b2.l1 f(int i10, b2.l1 l1Var, boolean z10) {
        l1Var.getClass();
        b2.c cVar = b2.c.f3704c;
        Object obj = f16630j;
        l1Var.h(obj, obj, 0, this.f16633i, 0L, cVar, false);
        l1Var.f3826f = false;
        return l1Var;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final Object l(int i10) {
        return f16630j;
    }

    @Override
    public final b2.n1 m(int i10, b2.n1 n1Var, long j10) {
        n1Var.b(f16630j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f16631f, this.f16632g, this.h, 0L, this.f16633i, 0, 0, 0L);
        n1Var.f3877k = false;
        return n1Var;
    }

    @Override
    public final int o() {
        return 1;
    }
}
