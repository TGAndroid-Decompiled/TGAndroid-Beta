package l2;

import a8.ia;
import android.os.Bundle;
public final class l extends e2.v0 {
    public final int D;
    public final x2.g0 E;
    public final boolean F;
    public final int f17930s;
    public final String f17931w;
    public final int f17932x;
    public final e2.u f17933y;

    public l(int i7, Exception exc, int i10) {
        this(i7, exc, i10, null, -1, null, 4, null, false);
    }

    public final l a(x2.g0 g0Var) {
        String message = getMessage();
        String str = h2.m0.f14112a;
        return new l(message, getCause(), this.f10629a, this.f17930s, this.f17931w, this.f17932x, this.f17933y, this.D, g0Var, this.f10630b, this.F);
    }

    public l(String str, Throwable th2, int i7, int i10, String str2, int i11, e2.u uVar, int i12, x2.g0 g0Var, long j3, boolean z9) {
        super(str, th2, i7, j3);
        Bundle bundle = Bundle.EMPTY;
        boolean z10 = false;
        ia.f(!z9 || i10 == 1);
        ia.f((th2 != null || i10 == 3) ? true : z10);
        this.f17930s = i10;
        this.f17931w = str2;
        this.f17932x = i11;
        this.f17933y = uVar;
        this.D = i12;
        this.E = g0Var;
        this.F = z9;
    }

    public l(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, e2.u r19, int r20, x2.g0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.l.<init>(int, java.lang.Throwable, int, java.lang.String, int, e2.u, int, x2.g0, boolean):void");
    }
}
