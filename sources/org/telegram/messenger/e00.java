package org.telegram.messenger;
public final class e00 implements nc, mc {
    public final y00 f23748a;
    public final fj f23749b;
    public final f3.s f23750c;
    public final di.p9 d;

    public e00(y00 y00Var, fj fjVar, f3.s sVar, di.p9 p9Var) {
        this.f23748a = y00Var;
        this.f23749b = fjVar;
        this.f23750c = sVar;
        this.d = p9Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new fn(this.f23748a, this.f23749b, str, this.f23750c, this.d, 18));
    }

    @Override
    public void s(Exception exc) {
        g0.g3(new tl(this.f23748a, this.f23749b, this.f23750c, this.d, 27));
    }
}
