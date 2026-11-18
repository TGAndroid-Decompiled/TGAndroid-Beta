package org.telegram.messenger;
public final class f00 implements nc, mc {
    public final z00 f23810a;
    public final fj f23811b;
    public final f3.s f23812c;
    public final di.o9 d;

    public f00(z00 z00Var, fj fjVar, f3.s sVar, di.o9 o9Var) {
        this.f23810a = z00Var;
        this.f23811b = fjVar;
        this.f23812c = sVar;
        this.d = o9Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new fn(this.f23810a, this.f23811b, str, this.f23812c, this.d, 18));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new tl(this.f23810a, this.f23811b, this.f23812c, this.d, 27));
    }
}
