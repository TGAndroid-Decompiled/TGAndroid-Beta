package l2;

import a8.la;
import android.os.Bundle;
public final class l extends e2.v0 {
    public final int E;
    public final x2.g0 F;
    public final boolean G;
    public final int f19456s;
    public final String f19457w;
    public final int f19458x;
    public final e2.u f19459y;

    public l(int i7, Exception exc, int i10) {
        this(i7, exc, i10, null, -1, null, 4, null, false);
    }

    public final l a(x2.g0 g0Var) {
        String message = getMessage();
        String str = h2.l0.f13815a;
        return new l(message, getCause(), this.f10812a, this.f19456s, this.f19457w, this.f19458x, this.f19459y, this.E, g0Var, this.f10813b, this.G);
    }

    public l(String str, Throwable th2, int i7, int i10, String str2, int i11, e2.u uVar, int i12, x2.g0 g0Var, long j3, boolean z10) {
        super(str, th2, i7, j3);
        Bundle bundle = Bundle.EMPTY;
        boolean z11 = false;
        la.f(!z10 || i10 == 1);
        la.f((th2 != null || i10 == 3) ? true : z11);
        this.f19456s = i10;
        this.f19457w = str2;
        this.f19458x = i11;
        this.f19459y = uVar;
        this.E = i12;
        this.F = g0Var;
        this.G = z10;
    }

    public l(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, e2.u r19, int r20, x2.g0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.l.<init>(int, java.lang.Throwable, int, java.lang.String, int, e2.u, int, x2.g0, boolean):void");
    }
}
