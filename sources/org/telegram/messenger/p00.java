package org.telegram.messenger;
public final class p00 implements pc, oc {
    public final f10 f24466a;
    public final ij f24467b;
    public final long f24468c;
    public final int d;

    public p00(f10 f10Var, ij ijVar, long j3, int i7) {
        this.f24466a = f10Var;
        this.f24467b = ijVar;
        this.f24468c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.h3(new m00(this.f24466a, str, this.f24467b, this.f24468c, this.d, 1));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new hk(this.d, 12, this.f24468c, this.f24466a, this.f24467b));
    }
}
