package org.telegram.messenger;
public final class h00 implements jc, ic {
    public final x00 f22815a;
    public final zi f22816b;
    public final long f22817c;
    public final int d;

    public h00(x00 x00Var, zi ziVar, long j10, int i3) {
        this.f22815a = x00Var;
        this.f22816b = ziVar;
        this.f22817c = j10;
        this.d = i3;
    }

    @Override
    public void a(String str) {
        g0.h3(new e00(this.f22815a, str, this.f22816b, this.f22817c, this.d, 1));
    }

    @Override
    public void s(Exception exc) {
        g0.h3(new yj(this.d, 12, this.f22817c, this.f22815a, this.f22816b));
    }
}
