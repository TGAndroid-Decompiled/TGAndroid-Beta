package org.telegram.messenger;
public final class m00 implements oc, nc {
    public final c10 f24927a;
    public final gj f24928b;
    public final long f24929c;
    public final int d;

    public m00(c10 c10Var, gj gjVar, long j3, int i7) {
        this.f24927a = c10Var;
        this.f24928b = gjVar;
        this.f24929c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.h3(new j00(this.f24927a, str, this.f24928b, this.f24929c, this.d, 1));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new fk(this.d, 12, this.f24929c, this.f24927a, this.f24928b));
    }
}
