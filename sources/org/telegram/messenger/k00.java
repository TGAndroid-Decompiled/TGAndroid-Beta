package org.telegram.messenger;
public final class k00 implements oc, nc {
    public final a10 f24963a;
    public final gj f24964b;
    public final long f24965c;
    public final int d;

    public k00(a10 a10Var, gj gjVar, long j3, int i7) {
        this.f24963a = a10Var;
        this.f24964b = gjVar;
        this.f24965c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.g3(new h00(this.f24963a, str, this.f24964b, this.f24965c, this.d, 1));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new fk(this.d, 12, this.f24965c, this.f24963a, this.f24964b));
    }
}
