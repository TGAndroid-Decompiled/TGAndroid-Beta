package c3;
public final class e implements b0 {
    public final g f3640a;
    public final long f3641b;
    public final long f3642c;
    public final long d;
    public final long e;
    public final long f3643f;

    public e(g gVar, long j10, long j11, long j12, long j13, long j14) {
        this.f3640a = gVar;
        this.f3641b = j10;
        this.f3642c = j11;
        this.d = j12;
        this.e = j13;
        this.f3643f = j14;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final a0 f(long j10) {
        c0 c0Var = new c0(j10, f.a(this.f3640a.g(j10), 0L, this.f3642c, this.d, this.e, this.f3643f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f3641b;
    }
}
