package c3;
public final class e implements b0 {
    public final g f4101a;
    public final long f4102b;
    public final long f4103c;
    public final long d;
    public final long f4104e;
    public final long f4105f;

    public e(g gVar, long j3, long j10, long j11, long j12, long j13) {
        this.f4101a = gVar;
        this.f4102b = j3;
        this.f4103c = j10;
        this.d = j11;
        this.f4104e = j12;
        this.f4105f = j13;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        c0 c0Var = new c0(j3, f.a(this.f4101a.h(j3), 0L, this.f4103c, this.d, this.f4104e, this.f4105f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f4102b;
    }
}
