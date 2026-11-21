package org.telegram.messenger;
public final class f00 implements nc, mc {
    public final z00 f23838a;
    public final fj f23839b;
    public final f3.s f23840c;
    public final di.p9 d;

    public f00(z00 z00Var, fj fjVar, f3.s sVar, di.p9 p9Var) {
        this.f23838a = z00Var;
        this.f23839b = fjVar;
        this.f23840c = sVar;
        this.d = p9Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new fn(this.f23838a, this.f23839b, str, this.f23840c, this.d, 18));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new tl(this.f23838a, this.f23839b, this.f23840c, this.d, 27));
    }
}
