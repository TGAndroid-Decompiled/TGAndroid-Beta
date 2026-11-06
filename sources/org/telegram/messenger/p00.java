package org.telegram.messenger;
public final class p00 implements pc, oc {
    public final f10 f24462a;
    public final ij f24463b;
    public final long f24464c;
    public final int d;

    public p00(f10 f10Var, ij ijVar, long j3, int i7) {
        this.f24462a = f10Var;
        this.f24463b = ijVar;
        this.f24464c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.h3(new m00(this.f24462a, str, this.f24463b, this.f24464c, this.d, 1));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new ik(this.d, 12, this.f24464c, this.f24462a, this.f24463b));
    }
}
