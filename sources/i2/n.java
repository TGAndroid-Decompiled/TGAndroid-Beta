package i2;

import android.os.Bundle;
public final class n extends b2.u0 {
    public final u2.f0 E;
    public final boolean F;
    public final int f11792s;
    public final String v;
    public final int f11793w;
    public final b2.s f11794x;
    public final int f11795y;

    public n(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final n a(u2.f0 f0Var) {
        String message = getMessage();
        String str = e2.d0.f8531a;
        return new n(message, getCause(), this.f3668a, this.f11792s, this.v, this.f11793w, this.f11794x, this.f11795y, f0Var, this.f3669b, this.F);
    }

    public n(String str, Throwable th2, int i10, int i11, String str2, int i12, b2.s sVar, int i13, u2.f0 f0Var, long j3, boolean z10) {
        super(str, th2, i10, j3);
        Bundle bundle = Bundle.EMPTY;
        boolean z11 = false;
        e2.d.b(!z10 || i11 == 1);
        e2.d.b((th2 != null || i11 == 3) ? true : z11);
        this.f11792s = i11;
        this.v = str2;
        this.f11793w = i12;
        this.f11794x = sVar;
        this.f11795y = i13;
        this.E = f0Var;
        this.F = z10;
    }

    public n(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, b2.s r19, int r20, u2.f0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: i2.n.<init>(int, java.lang.Throwable, int, java.lang.String, int, b2.s, int, u2.f0, boolean):void");
    }
}
