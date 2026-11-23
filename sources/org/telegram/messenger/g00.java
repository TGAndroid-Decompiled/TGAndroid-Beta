package org.telegram.messenger;
public final class g00 implements oc, nc {
    public final a10 f24055a;
    public final gj f24056b;
    public final f3.s f24057c;
    public final di.p9 d;

    public g00(a10 a10Var, gj gjVar, f3.s sVar, di.p9 p9Var) {
        this.f24055a = a10Var;
        this.f24056b = gjVar;
        this.f24057c = sVar;
        this.d = p9Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new gn(this.f24055a, this.f24056b, str, this.f24057c, this.d, 18));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new ul(this.f24055a, this.f24056b, this.f24057c, this.d, 27));
    }
}
