package i2;

import android.os.Bundle;
import v7.u6;
public final class m extends b2.z0 {
    public final u2.g0 E;
    public final boolean F;
    public final int f11087s;
    public final String v;
    public final int f11088w;
    public final b2.x f11089x;
    public final int f11090y;

    public m(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final m a(u2.g0 g0Var) {
        String message = getMessage();
        String str = e2.m0.f8375a;
        return new m(message, getCause(), this.f2542a, this.f11087s, this.v, this.f11088w, this.f11089x, this.f11090y, g0Var, this.f2543b, this.F);
    }

    public m(String str, Throwable th2, int i10, int i11, String str2, int i12, b2.x xVar, int i13, u2.g0 g0Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        Bundle bundle = Bundle.EMPTY;
        boolean z11 = false;
        u6.g(!z10 || i11 == 1);
        u6.g((th2 != null || i11 == 3) ? true : z11);
        this.f11087s = i11;
        this.v = str2;
        this.f11088w = i12;
        this.f11089x = xVar;
        this.f11090y = i13;
        this.E = g0Var;
        this.F = z10;
    }

    public m(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, b2.x r19, int r20, u2.g0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: i2.m.<init>(int, java.lang.Throwable, int, java.lang.String, int, b2.x, int, u2.g0, boolean):void");
    }
}
