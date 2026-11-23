package org.telegram.messenger;
public final class k00 implements oc, nc {
    public final a10 f24927a;
    public final gj f24928b;
    public final long f24929c;
    public final int d;

    public k00(a10 a10Var, gj gjVar, long j3, int i7) {
        this.f24927a = a10Var;
        this.f24928b = gjVar;
        this.f24929c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.g3(new h00(this.f24927a, str, this.f24928b, this.f24929c, this.d, 1));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new fk(this.d, 12, this.f24929c, this.f24927a, this.f24928b));
    }
}
