package org.telegram.messenger;
public final class i00 implements oc, nc {
    public final c10 f24258a;
    public final gj f24259b;
    public final f3.s f24260c;
    public final di.m9 d;

    public i00(c10 c10Var, gj gjVar, f3.s sVar, di.m9 m9Var) {
        this.f24258a = c10Var;
        this.f24259b = gjVar;
        this.f24260c = sVar;
        this.d = m9Var;
    }

    @Override
    public void a(String str) {
        g0.h3(new jn(this.f24258a, this.f24259b, str, this.f24260c, this.d, 18));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new bm(this.f24258a, this.f24259b, this.f24260c, this.d, 27));
    }
}
