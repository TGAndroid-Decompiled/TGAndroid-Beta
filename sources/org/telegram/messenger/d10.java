package org.telegram.messenger;
public final class d10 implements rc, qc {
    public final u10 f15281a;
    public final kj f15282b;
    public final long f15283c;
    public final int d;

    public d10(u10 u10Var, kj kjVar, long j10, int i10) {
        this.f15281a = u10Var;
        this.f15282b = kjVar;
        this.f15283c = j10;
        this.d = i10;
    }

    @Override
    public void a(String str) {
        i0.g3(new a10(this.f15281a, str, this.f15282b, this.f15283c, this.d, 1));
    }

    @Override
    public void p(Exception exc) {
        i0.g3(new sk(this.d, 12, this.f15283c, this.f15281a, this.f15282b));
    }
}
