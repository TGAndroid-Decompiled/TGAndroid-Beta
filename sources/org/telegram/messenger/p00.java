package org.telegram.messenger;
public final class p00 implements pc, oc {
    public final f10 f24470a;
    public final ij f24471b;
    public final long f24472c;
    public final int d;

    public p00(f10 f10Var, ij ijVar, long j3, int i7) {
        this.f24470a = f10Var;
        this.f24471b = ijVar;
        this.f24472c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.h3(new m00(this.f24470a, str, this.f24471b, this.f24472c, this.d, 1));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new hk(this.d, 12, this.f24472c, this.f24470a, this.f24471b));
    }
}
