package k2;

import android.os.Bundle;
import b8.zb;
public final class l extends d2.x0 {
    public final int E;
    public final w2.g0 F;
    public final boolean G;
    public final int f16616s;
    public final String f16617w;
    public final int f16618x;
    public final d2.v f16619y;

    public l(int i3, Exception exc, int i10) {
        this(i3, exc, i10, null, -1, null, 4, null, false);
    }

    public final l a(w2.g0 g0Var) {
        String message = getMessage();
        String str = g2.n0.f11873a;
        return new l(message, getCause(), this.f8512a, this.f16616s, this.f16617w, this.f16618x, this.f16619y, this.E, g0Var, this.f8513b, this.G);
    }

    public l(String str, Throwable th2, int i3, int i10, String str2, int i11, d2.v vVar, int i12, w2.g0 g0Var, long j10, boolean z10) {
        super(str, th2, i3, j10);
        Bundle bundle = Bundle.EMPTY;
        boolean z11 = false;
        zb.f(!z10 || i10 == 1);
        zb.f((th2 != null || i10 == 3) ? true : z11);
        this.f16616s = i10;
        this.f16617w = str2;
        this.f16618x = i11;
        this.f16619y = vVar;
        this.E = i12;
        this.F = g0Var;
        this.G = z10;
    }

    public l(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, d2.v r19, int r20, w2.g0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: k2.l.<init>(int, java.lang.Throwable, int, java.lang.String, int, d2.v, int, w2.g0, boolean):void");
    }
}
