package org.telegram.messenger;
public final class i00 implements nc, mc {
    public final y00 f24631a;
    public final fj f24632b;
    public final long f24633c;
    public final int d;

    public i00(y00 y00Var, fj fjVar, long j3, int i7) {
        this.f24631a = y00Var;
        this.f24632b = fjVar;
        this.f24633c = j3;
        this.d = i7;
    }

    @Override
    public void a(String str) {
        g0.g3(new f00(this.f24631a, str, this.f24632b, this.f24633c, this.d, 1));
    }

    @Override
    public void s(Exception exc) {
        g0.g3(new ek(this.d, 12, this.f24633c, this.f24631a, this.f24632b));
    }
}
