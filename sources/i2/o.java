package i2;

import android.os.Bundle;
public final class o extends b2.u0 {
    public final u2.f0 E;
    public final boolean F;
    public final int f11653s;
    public final String v;
    public final int f11654w;
    public final b2.s f11655x;
    public final int f11656y;

    public o(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final o a(u2.f0 f0Var) {
        String message = getMessage();
        String str = e2.d0.f8737a;
        return new o(message, getCause(), this.f2395a, this.f11653s, this.v, this.f11654w, this.f11655x, this.f11656y, f0Var, this.f2396b, this.F);
    }

    public o(String str, Throwable th2, int i10, int i11, String str2, int i12, b2.s sVar, int i13, u2.f0 f0Var, long j3, boolean z10) {
        super(str, th2, i10, j3);
        Bundle bundle = Bundle.EMPTY;
        boolean z11 = false;
        e2.d.b(!z10 || i11 == 1);
        e2.d.b((th2 != null || i11 == 3) ? true : true);
        this.f11653s = i11;
        this.v = str2;
        this.f11654w = i12;
        this.f11655x = sVar;
        this.f11656y = i13;
        this.E = f0Var;
        this.F = z10;
    }

    public o(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, b2.s r19, int r20, u2.f0 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: i2.o.<init>(int, java.lang.Throwable, int, java.lang.String, int, b2.s, int, u2.f0, boolean):void");
    }
}
