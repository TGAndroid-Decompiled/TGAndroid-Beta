package j4;

public final class k0 implements b1 {

    public final b1 f12599a;

    public final long f12600b;

    public k0(b1 b1Var, long j10) {
        this.f12599a = b1Var;
        this.f12600b = j10;
    }

    @Override
    public final void a() {
        this.f12599a.a();
    }

    @Override
    public final boolean e() {
        return this.f12599a.e();
    }

    @Override
    public final int f(long j10) {
        return this.f12599a.f(j10 - this.f12600b);
    }

    @Override
    public final int i(h3.u0 u0Var, k3.i iVar, int i10) {
        int i11 = this.f12599a.i(u0Var, iVar, i10);
        if (i11 == -4) {
            iVar.d = Math.max(0L, iVar.d + this.f12600b);
        }
        return i11;
    }
}
