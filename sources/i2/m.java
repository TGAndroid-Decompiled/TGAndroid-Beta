package i2;

import a8.yb;
import android.os.Bundle;
public final class m extends b2.z0 {
    public final u2.g0 E;
    public final boolean F;
    public final int f13655s;
    public final String v;
    public final int f13656w;
    public final b2.x f13657x;
    public final int f13658y;

    public m(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final m a(u2.g0 g0Var) {
        String message = getMessage();
        String str = e2.n0.f9691a;
        return new m(message, getCause(), this.f3605a, this.f13655s, this.v, this.f13656w, this.f13657x, this.f13658y, g0Var, this.f3606b, this.F);
    }

    public m(String str, Throwable th2, int i10, int i11, String str2, int i12, b2.x xVar, int i13, u2.g0 g0Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        Bundle bundle = Bundle.EMPTY;
        boolean z11 = false;
        yb.g(!z10 || i11 == 1);
        yb.g((th2 != null || i11 == 3) ? true : z11);
        this.f13655s = i11;
        this.v = str2;
        this.f13656w = i12;
        this.f13657x = xVar;
        this.f13658y = i13;
        this.E = g0Var;
        this.F = z10;
    }

    public m(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, b2.x r19, int r20, u2.g0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: i2.m.<init>(int, java.lang.Throwable, int, java.lang.String, int, b2.x, int, u2.g0, boolean):void");
    }
}
