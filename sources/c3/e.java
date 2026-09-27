package c3;
public final class e implements b0 {
    public final g f3750a;
    public final long f3751b;
    public final long f3752c;
    public final long d;
    public final long e;
    public final long f3753f;

    public e(g gVar, long j3, long j10, long j11, long j12, long j13) {
        this.f3750a = gVar;
        this.f3751b = j3;
        this.f3752c = j10;
        this.d = j11;
        this.e = j12;
        this.f3753f = j13;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        c0 c0Var = new c0(j3, f.a(this.f3750a.m(j3), 0L, this.f3752c, this.d, this.e, this.f3753f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f3751b;
    }
}
