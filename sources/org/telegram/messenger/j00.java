package org.telegram.messenger;
public final class j00 implements nc, mc {
    public final z00 f24768a;
    public final fj f24769b;
    public final long f24770c;
    public final int d;

    public j00(z00 z00Var, fj fjVar, long j3, int i7) {
        this.f24768a = z00Var;
        this.f24769b = fjVar;
        this.f24770c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.g3(new g00(this.f24768a, str, this.f24769b, this.f24770c, this.d, 1));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new ek(this.d, 12, this.f24770c, this.f24768a, this.f24769b));
    }
}
