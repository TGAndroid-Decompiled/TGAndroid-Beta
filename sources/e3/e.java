package e3;
public final class e implements b0 {
    public final g f9455a;
    public final long f9456b;
    public final long f9457c;
    public final long d;
    public final long f9458e;
    public final long f9459f;

    public e(g gVar, long j10, long j11, long j12, long j13, long j14) {
        this.f9455a = gVar;
        this.f9456b = j10;
        this.f9457c = j11;
        this.d = j12;
        this.f9458e = j13;
        this.f9459f = j14;
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
        c0 c0Var = new c0(j10, f.a(this.f9455a.k(j10), 0L, this.f9457c, this.d, this.f9458e, this.f9459f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f9456b;
    }
}
