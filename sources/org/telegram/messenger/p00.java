package org.telegram.messenger;
public final class p00 implements pc, oc {
    public final f10 f24454a;
    public final ij f24455b;
    public final long f24456c;
    public final int d;

    public p00(f10 f10Var, ij ijVar, long j3, int i7) {
        this.f24454a = f10Var;
        this.f24455b = ijVar;
        this.f24456c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.h3(new m00(this.f24454a, str, this.f24455b, this.f24456c, this.d, 1));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new ik(this.d, 12, this.f24456c, this.f24454a, this.f24455b));
    }
}
