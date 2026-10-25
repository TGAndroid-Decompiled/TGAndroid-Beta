package c3;
public final class e implements b0 {
    public final g f6047a;
    public final long f6048b;
    public final long f6049c;
    public final long d;
    public final long e;
    public final long f6050f;

    public e(g gVar, long j10, long j11, long j12, long j13, long j14) {
        this.f6047a = gVar;
        this.f6048b = j10;
        this.f6049c = j11;
        this.d = j12;
        this.e = j13;
        this.f6050f = j14;
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
        c0 c0Var = new c0(j10, f.a(this.f6047a.g(j10), 0L, this.f6049c, this.d, this.e, this.f6050f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f6048b;
    }
}
