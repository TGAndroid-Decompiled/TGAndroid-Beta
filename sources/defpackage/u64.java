package defpackage;

import android.os.Bundle;
public final class u64 extends Exception {
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String w;
    public static final String x;
    public static final String y;
    public final int a;
    public final long b;
    public final Bundle c;
    public final byte d;
    public final String e;
    public final int f;
    public final go4 h;
    public final int n;
    public final rz6 r;
    public final boolean s;

    static {
        String str = hac.a;
        w = "0";
        x = "1";
        y = "2";
        E = "3";
        F = "4";
        G = "5";
    }

    public u64(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.go4 r19, int r20, defpackage.rz6 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u64.<init>(int, java.lang.Throwable, int, java.lang.String, int, go4, int, rz6, boolean):void");
    }

    public final u64 a(rz6 rz6Var) {
        String message = getMessage();
        String str = hac.a;
        return new u64(message, getCause(), this.a, this.d, this.e, this.f, this.h, this.n, rz6Var, this.b, this.s);
    }

    public u64(String str, Throwable th, int i, int i2, String str2, int i3, go4 go4Var, int i4, rz6 rz6Var, long j, boolean z) {
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = Bundle.EMPTY;
        this.a = i;
        this.c = bundle2;
        this.b = j;
        boolean z2 = false;
        jte.f(!z || i2 == 1);
        jte.f((th != null || i2 == 3) ? true : z2);
        this.d = i2;
        this.e = str2;
        this.f = i3;
        this.h = go4Var;
        this.n = i4;
        this.r = rz6Var;
        this.s = z;
    }

    public u64(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
