package org.telegram.messenger;
public final class l00 implements pc, oc {
    public final f10 f23807a;
    public final ij f23808b;
    public final f3.s f23809c;
    public final bi.ya d;

    public l00(f10 f10Var, ij ijVar, f3.s sVar, bi.ya yaVar) {
        this.f23807a = f10Var;
        this.f23808b = ijVar;
        this.f23809c = sVar;
        this.d = yaVar;
    }

    @Override
    public void a(String str) {
        g0.h3(new mn(this.f23807a, this.f23808b, str, this.f23809c, this.d, 18));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new em(this.f23807a, this.f23808b, this.f23809c, this.d, 27));
    }
}
