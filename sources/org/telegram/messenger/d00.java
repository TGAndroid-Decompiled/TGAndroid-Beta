package org.telegram.messenger;
public final class d00 implements jc, ic {
    public final x00 f22115a;
    public final zi f22116b;
    public final e3.s f22117c;
    public final ci.w9 d;

    public d00(x00 x00Var, zi ziVar, e3.s sVar, ci.w9 w9Var) {
        this.f22115a = x00Var;
        this.f22116b = ziVar;
        this.f22117c = sVar;
        this.d = w9Var;
    }

    @Override
    public void a(String str) {
        g0.h3(new cn(this.f22115a, this.f22116b, str, this.f22117c, this.d, 18));
    }

    @Override
    public void s(Exception exc) {
        g0.h3(new ul(this.f22115a, this.f22116b, this.f22117c, this.d, 27));
    }
}
