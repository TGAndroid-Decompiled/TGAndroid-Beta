package org.telegram.messenger;
public final class c10 implements qc, pc {
    public final t10 f14890a;
    public final jj f14891b;
    public final long f14892c;
    public final int d;

    public c10(t10 t10Var, jj jjVar, long j10, int i10) {
        this.f14890a = t10Var;
        this.f14891b = jjVar;
        this.f14892c = j10;
        this.d = i10;
    }

    @Override
    public void a(String str) {
        i0.g3(new z00(this.f14890a, str, this.f14891b, this.f14892c, this.d, 1));
    }

    @Override
    public void q(Exception exc) {
        i0.g3(new rk(this.d, 12, this.f14892c, this.f14890a, this.f14891b));
    }
}
