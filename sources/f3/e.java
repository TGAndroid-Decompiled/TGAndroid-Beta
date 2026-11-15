package f3;
public final class e implements b0 {
    public final g f10826a;
    public final long f10827b;
    public final long f10828c;
    public final long d;
    public final long f10829e;
    public final long f10830f;

    public e(g gVar, long j3, long j10, long j11, long j12, long j13) {
        this.f10826a = gVar;
        this.f10827b = j3;
        this.f10828c = j10;
        this.d = j11;
        this.f10829e = j12;
        this.f10830f = j13;
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
        c0 c0Var = new c0(j3, f.a(this.f10826a.l(j3), 0L, this.f10828c, this.d, this.f10829e, this.f10830f));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        return this.f10827b;
    }
}
