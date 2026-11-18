package org.telegram.messenger;
public final class j00 implements nc, mc {
    public final z00 f24765a;
    public final fj f24766b;
    public final long f24767c;
    public final int d;

    public j00(z00 z00Var, fj fjVar, long j3, int i7) {
        this.f24765a = z00Var;
        this.f24766b = fjVar;
        this.f24767c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.g3(new g00(this.f24765a, str, this.f24766b, this.f24767c, this.d, 1));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new ek(this.d, 12, this.f24767c, this.f24765a, this.f24766b));
    }
}
