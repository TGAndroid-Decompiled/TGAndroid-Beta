package c3;
public final class e implements b0 {
    public final g f4235a;
    public final long f4236b;
    public final long f4237c;
    public final long d;
    public final long e;
    public final long f4238f;

    public e(g gVar, long j10, long j11, long j12, long j13, long j14) {
        this.f4235a = gVar;
        this.f4236b = j10;
        this.f4237c = j11;
        this.d = j12;
        this.e = j13;
        this.f4238f = j14;
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
        c0 c0Var = new c0(j10, f.a(this.f4235a.k(j10), 0L, this.f4237c, this.d, this.e, this.f4238f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f4236b;
    }
}
