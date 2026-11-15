package org.telegram.messenger;
public final class m00 implements oc, nc {
    public final c10 f24933a;
    public final gj f24934b;
    public final long f24935c;
    public final int d;

    public m00(c10 c10Var, gj gjVar, long j3, int i7) {
        this.f24933a = c10Var;
        this.f24934b = gjVar;
        this.f24935c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.h3(new j00(this.f24933a, str, this.f24934b, this.f24935c, this.d, 1));
    }

    @Override
    public void r(Exception exc) {
        g0.h3(new fk(this.d, 12, this.f24935c, this.f24933a, this.f24934b));
    }
}
