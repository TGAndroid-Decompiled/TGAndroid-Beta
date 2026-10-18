package i2;

import android.os.Bundle;
import v7.u6;
public final class m extends b2.y0 {
    public final u2.g0 E;
    public final boolean F;
    public final int f12479s;
    public final String v;
    public final int f12480w;
    public final b2.w f12481x;
    public final int f12482y;

    public m(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final m a(u2.g0 g0Var) {
        String message = getMessage();
        String str = e2.m0.f8253a;
        return new m(message, getCause(), this.f4151a, this.f12479s, this.v, this.f12480w, this.f12481x, this.f12482y, g0Var, this.f4152b, this.F);
    }

    public m(String str, Throwable th2, int i10, int i11, String str2, int i12, b2.w wVar, int i13, u2.g0 g0Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        Bundle bundle = Bundle.EMPTY;
        boolean z11 = false;
        u6.g(!z10 || i11 == 1);
        u6.g((th2 != null || i11 == 3) ? true : z11);
        this.f12479s = i11;
        this.v = str2;
        this.f12480w = i12;
        this.f12481x = wVar;
        this.f12482y = i13;
        this.E = g0Var;
        this.F = z10;
    }

    public m(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, b2.w r19, int r20, u2.g0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: i2.m.<init>(int, java.lang.Throwable, int, java.lang.String, int, b2.w, int, u2.g0, boolean):void");
    }
}
