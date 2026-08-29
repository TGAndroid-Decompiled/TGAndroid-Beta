package l4;
public final class k0 implements c1 {
    public final c1 f14354a;
    public final long f14355b;

    public k0(c1 c1Var, long j10) {
        this.f14354a = c1Var;
        this.f14355b = j10;
    }

    @Override
    public final void a() {
        this.f14354a.a();
    }

    @Override
    public final int d(j3.u0 u0Var, m3.i iVar, int i10) {
        int d = this.f14354a.d(u0Var, iVar, i10);
        if (d == -4) {
            iVar.d = Math.max(0L, iVar.d + this.f14355b);
        }
        return d;
    }

    @Override
    public final boolean e() {
        return this.f14354a.e();
    }

    @Override
    public final int i(long j10) {
        return this.f14354a.i(j10 - this.f14355b);
    }
}
