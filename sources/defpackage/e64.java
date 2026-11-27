package defpackage;

import android.os.Bundle;
public final class e64 extends Exception {
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
    public final ko4 h;
    public final int n;
    public final vz6 r;
    public final boolean s;

    static {
        String str = gcc.a;
        w = "0";
        x = "1";
        y = "2";
        E = "3";
        F = "4";
        G = "5";
    }

    public e64(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.ko4 r19, int r20, defpackage.vz6 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e64.<init>(int, java.lang.Throwable, int, java.lang.String, int, ko4, int, vz6, boolean):void");
    }

    public final e64 a(vz6 vz6Var) {
        String message = getMessage();
        String str = gcc.a;
        return new e64(message, getCause(), this.a, this.d, this.e, this.f, this.h, this.n, vz6Var, this.b, this.s);
    }

    public e64(String str, Throwable th, int i, int i2, String str2, int i3, ko4 ko4Var, int i4, vz6 vz6Var, long j, boolean z) {
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = Bundle.EMPTY;
        this.a = i;
        this.c = bundle2;
        this.b = j;
        boolean z2 = false;
        yve.f(!z || i2 == 1);
        yve.f((th != null || i2 == 3) ? true : z2);
        this.d = i2;
        this.e = str2;
        this.f = i3;
        this.h = ko4Var;
        this.n = i4;
        this.r = vz6Var;
        this.s = z;
    }

    public e64(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
