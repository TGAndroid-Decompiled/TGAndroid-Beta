package f3;
public final class e implements b0 {
    public final g f11177a;
    public final long f11178b;
    public final long f11179c;
    public final long d;
    public final long f11180e;
    public final long f11181f;

    public e(g gVar, long j3, long j10, long j11, long j12, long j13) {
        this.f11177a = gVar;
        this.f11178b = j3;
        this.f11179c = j10;
        this.d = j11;
        this.f11180e = j12;
        this.f11181f = j13;
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
        c0 c0Var = new c0(j3, f.a(this.f11177a.k(j3), 0L, this.f11179c, this.d, this.f11180e, this.f11181f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f11178b;
    }
}
