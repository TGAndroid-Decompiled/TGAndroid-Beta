package org.telegram.messenger;
public final class l00 implements pc, oc {
    public final f10 f23823a;
    public final ij f23824b;
    public final f3.s f23825c;
    public final bi.ya d;

    public l00(f10 f10Var, ij ijVar, f3.s sVar, bi.ya yaVar) {
        this.f23823a = f10Var;
        this.f23824b = ijVar;
        this.f23825c = sVar;
        this.d = yaVar;
    }

    @Override
    public void a(String str) {
        g0.h3(new mn(this.f23823a, this.f23824b, str, this.f23825c, this.d, 18));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new em(this.f23823a, this.f23824b, this.f23825c, this.d, 27));
    }
}
