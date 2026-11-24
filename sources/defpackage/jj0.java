package defpackage;
public final class jj0 implements ix9 {
    public final lj0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public jj0(lj0 lj0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = lj0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final hx9 f(long j) {
        kx9 kx9Var = new kx9(j, kj0.a(this.a.c(j), 0L, this.c, this.d, this.e, this.f));
        return new hx9(kx9Var, kx9Var);
    }

    @Override
    public final long h() {
        return this.b;
    }
}
