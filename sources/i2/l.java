package i2;

import android.os.Bundle;
import v7.t6;
public final class l extends b2.y0 {
    public final int D;
    public final u2.g0 E;
    public final boolean F;
    public final int f7952s;
    public final String f7953w;
    public final int f7954x;
    public final b2.x f7955y;

    public l(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final l a(u2.g0 g0Var) {
        String message = getMessage();
        String str = e2.l0.f6165a;
        return new l(message, getCause(), this.f2437a, this.f7952s, this.f7953w, this.f7954x, this.f7955y, this.D, g0Var, this.f2438b, this.F);
    }

    public l(String str, Throwable th2, int i10, int i11, String str2, int i12, b2.x xVar, int i13, u2.g0 g0Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        Bundle bundle = Bundle.EMPTY;
        boolean z11 = false;
        t6.f(!z10 || i11 == 1);
        t6.f((th2 != null || i11 == 3) ? true : z11);
        this.f7952s = i11;
        this.f7953w = str2;
        this.f7954x = i12;
        this.f7955y = xVar;
        this.D = i13;
        this.E = g0Var;
        this.F = z10;
    }

    public l(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, b2.x r19, int r20, u2.g0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: i2.l.<init>(int, java.lang.Throwable, int, java.lang.String, int, b2.x, int, u2.g0, boolean):void");
    }
}
