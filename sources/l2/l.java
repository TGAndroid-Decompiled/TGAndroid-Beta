package l2;

import a8.ia;
import android.os.Bundle;
public final class l extends e2.v0 {
    public final int D;
    public final x2.f0 E;
    public final boolean F;
    public final int f17933s;
    public final String f17934w;
    public final int f17935x;
    public final e2.u f17936y;

    public l(int i7, Exception exc, int i10) {
        this(i7, exc, i10, null, -1, null, 4, null, false);
    }

    public final l a(x2.f0 f0Var) {
        String message = getMessage();
        String str = h2.m0.f14114a;
        return new l(message, getCause(), this.f10634a, this.f17933s, this.f17934w, this.f17935x, this.f17936y, this.D, f0Var, this.f10635b, this.F);
    }

    public l(String str, Throwable th2, int i7, int i10, String str2, int i11, e2.u uVar, int i12, x2.f0 f0Var, long j3, boolean z9) {
        super(str, th2, i7, j3);
        Bundle bundle = Bundle.EMPTY;
        boolean z10 = false;
        ia.f(!z9 || i10 == 1);
        ia.f((th2 != null || i10 == 3) ? true : z10);
        this.f17933s = i10;
        this.f17934w = str2;
        this.f17935x = i11;
        this.f17936y = uVar;
        this.D = i12;
        this.E = f0Var;
        this.F = z9;
    }

    public l(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, e2.u r19, int r20, x2.f0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.l.<init>(int, java.lang.Throwable, int, java.lang.String, int, e2.u, int, x2.f0, boolean):void");
    }
}
