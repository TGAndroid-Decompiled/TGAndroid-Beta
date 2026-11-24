package defpackage;

import android.os.Bundle;
public final class j54 extends Exception {
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
    public final fm4 h;
    public final int n;
    public final rx6 r;
    public final boolean s;

    static {
        String str = g8c.a;
        w = "0";
        x = "1";
        y = "2";
        E = "3";
        F = "4";
        G = "5";
    }

    public j54(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.fm4 r19, int r20, defpackage.rx6 r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j54.<init>(int, java.lang.Throwable, int, java.lang.String, int, fm4, int, rx6, boolean):void");
    }

    public final j54 a(rx6 rx6Var) {
        String message = getMessage();
        String str = g8c.a;
        return new j54(message, getCause(), this.a, this.d, this.e, this.f, this.h, this.n, rx6Var, this.b, this.s);
    }

    public j54(String str, Throwable th, int i, int i2, String str2, int i3, fm4 fm4Var, int i4, rx6 rx6Var, long j, boolean z) {
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = Bundle.EMPTY;
        this.a = i;
        this.c = bundle2;
        this.b = j;
        boolean z2 = false;
        gre.f(!z || i2 == 1);
        gre.f((th != null || i2 == 3) ? true : z2);
        this.d = i2;
        this.e = str2;
        this.f = i3;
        this.h = fm4Var;
        this.n = i4;
        this.r = rx6Var;
        this.s = z;
    }

    public j54(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
