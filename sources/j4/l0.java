package j4;
public final class l0 implements b1 {
    public final b1 f13502a;
    public final long f13503b;

    public l0(b1 b1Var, long j10) {
        this.f13502a = b1Var;
        this.f13503b = j10;
    }

    @Override
    public final void a() {
        this.f13502a.a();
    }

    @Override
    public final boolean f() {
        return this.f13502a.f();
    }

    @Override
    public final int j(long j10) {
        return this.f13502a.j(j10 - this.f13503b);
    }

    @Override
    public final int l(h3.u0 u0Var, k3.i iVar, int i9) {
        int l10 = this.f13502a.l(u0Var, iVar, i9);
        if (l10 == -4) {
            iVar.d = Math.max(0L, iVar.d + this.f13503b);
        }
        return l10;
    }
}
