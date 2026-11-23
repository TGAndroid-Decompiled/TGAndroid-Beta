package f3;
public final class e implements b0 {
    public final g f11140a;
    public final long f11141b;
    public final long f11142c;
    public final long d;
    public final long f11143e;
    public final long f11144f;

    public e(g gVar, long j3, long j10, long j11, long j12, long j13) {
        this.f11140a = gVar;
        this.f11141b = j3;
        this.f11142c = j10;
        this.d = j11;
        this.f11143e = j12;
        this.f11144f = j13;
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
    public final a0 f(long j3) {
        c0 c0Var = new c0(j3, f.a(this.f11140a.k(j3), 0L, this.f11142c, this.d, this.f11143e, this.f11144f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f11141b;
    }
}
