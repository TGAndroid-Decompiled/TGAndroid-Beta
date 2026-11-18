package org.telegram.messenger;
public final class f00 implements nc, mc {
    public final z00 f23813a;
    public final fj f23814b;
    public final f3.s f23815c;
    public final di.o9 d;

    public f00(z00 z00Var, fj fjVar, f3.s sVar, di.o9 o9Var) {
        this.f23813a = z00Var;
        this.f23814b = fjVar;
        this.f23815c = sVar;
        this.d = o9Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new fn(this.f23813a, this.f23814b, str, this.f23815c, this.d, 18));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new tl(this.f23813a, this.f23814b, this.f23815c, this.d, 27));
    }
}
