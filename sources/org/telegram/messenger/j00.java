package org.telegram.messenger;
public final class j00 implements nc, mc {
    public final z00 f24793a;
    public final fj f24794b;
    public final long f24795c;
    public final int d;

    public j00(z00 z00Var, fj fjVar, long j3, int i7) {
        this.f24793a = z00Var;
        this.f24794b = fjVar;
        this.f24795c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.g3(new g00(this.f24793a, str, this.f24794b, this.f24795c, this.d, 1));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new ek(this.d, 12, this.f24795c, this.f24793a, this.f24794b));
    }
}
