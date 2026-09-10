package c3;
public final class e implements b0 {
    public final g f4170a;
    public final long f4171b;
    public final long f4172c;
    public final long d;
    public final long e;
    public final long f4173f;

    public e(g gVar, long j3, long j10, long j11, long j12, long j13) {
        this.f4170a = gVar;
        this.f4171b = j3;
        this.f4172c = j10;
        this.d = j11;
        this.e = j12;
        this.f4173f = j13;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        c0 c0Var = new c0(j3, f.a(this.f4170a.b(j3), 0L, this.f4172c, this.d, this.e, this.f4173f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f4171b;
    }
}
