package c3;
public final class e implements c0 {
    public final g f4610a;
    public final long f4611b;
    public final long f4612c;
    public final long d;
    public final long e;
    public final long f4613f;

    public e(g gVar, long j10, long j11, long j12, long j13, long j14) {
        this.f4610a = gVar;
        this.f4611b = j10;
        this.f4612c = j11;
        this.d = j12;
        this.e = j13;
        this.f4613f = j14;
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
    public final b0 f(long j10) {
        d0 d0Var = new d0(j10, f.a(this.f4610a.k(j10), 0L, this.f4612c, this.d, this.e, this.f4613f));
        return new b0(d0Var, d0Var);
    }

    @Override
    public final long h() {
        return this.f4611b;
    }
}
