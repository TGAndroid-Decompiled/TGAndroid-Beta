package org.telegram.messenger;
public final class l00 implements pc, oc {
    public final f10 f23819a;
    public final ij f23820b;
    public final f3.s f23821c;
    public final bi.ya d;

    public l00(f10 f10Var, ij ijVar, f3.s sVar, bi.ya yaVar) {
        this.f23819a = f10Var;
        this.f23820b = ijVar;
        this.f23821c = sVar;
        this.d = yaVar;
    }

    @Override
    public void a(String str) {
        g0.h3(new mn(this.f23819a, this.f23820b, str, this.f23821c, this.d, 18));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new em(this.f23819a, this.f23820b, this.f23821c, this.d, 27));
    }
}
