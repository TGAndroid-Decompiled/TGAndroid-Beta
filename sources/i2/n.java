package i2;

import android.os.Bundle;
public final class n extends b2.u0 {
    public final u2.f0 E;
    public final boolean F;
    public final int f10791s;
    public final String v;
    public final int f10792w;
    public final b2.s f10793x;
    public final int f10794y;

    public n(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final n a(u2.f0 f0Var) {
        String message = getMessage();
        String str = e2.d0.f7885a;
        return new n(message, getCause(), this.f3329a, this.f10791s, this.v, this.f10792w, this.f10793x, this.f10794y, f0Var, this.f3330b, this.F);
    }

    public n(String str, Throwable th2, int i10, int i11, String str2, int i12, b2.s sVar, int i13, u2.f0 f0Var, long j3, boolean z10) {
        super(str, th2, i10, j3);
        Bundle bundle = Bundle.EMPTY;
        boolean z11 = false;
        e2.d.b(!z10 || i11 == 1);
        e2.d.b((th2 != null || i11 == 3) ? true : true);
        this.f10791s = i11;
        this.v = str2;
        this.f10792w = i12;
        this.f10793x = sVar;
        this.f10794y = i13;
        this.E = f0Var;
        this.F = z10;
    }

    public n(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, b2.s r19, int r20, u2.f0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: i2.n.<init>(int, java.lang.Throwable, int, java.lang.String, int, b2.s, int, u2.f0, boolean):void");
    }
}
