package org.telegram.messenger;
public final class l00 implements pc, oc {
    public final f10 f23814a;
    public final ij f23815b;
    public final f3.s f23816c;
    public final bi.ya d;

    public l00(f10 f10Var, ij ijVar, f3.s sVar, bi.ya yaVar) {
        this.f23814a = f10Var;
        this.f23815b = ijVar;
        this.f23816c = sVar;
        this.d = yaVar;
    }

    @Override
    public void a(String str) {
        g0.h3(new mn(this.f23814a, this.f23815b, str, this.f23816c, this.d, 18));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new em(this.f23814a, this.f23815b, this.f23816c, this.d, 27));
    }
}
