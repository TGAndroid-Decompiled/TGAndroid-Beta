package c3;
public final class e implements b0 {
    public final g f4102a;
    public final long f4103b;
    public final long f4104c;
    public final long d;
    public final long f4105e;
    public final long f4106f;

    public e(g gVar, long j3, long j10, long j11, long j12, long j13) {
        this.f4102a = gVar;
        this.f4103b = j3;
        this.f4104c = j10;
        this.d = j11;
        this.f4105e = j12;
        this.f4106f = j13;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a0 j(long j3) {
        c0 c0Var = new c0(j3, f.a(this.f4102a.c(j3), 0L, this.f4104c, this.d, this.f4105e, this.f4106f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long l() {
        return this.f4103b;
    }
}
