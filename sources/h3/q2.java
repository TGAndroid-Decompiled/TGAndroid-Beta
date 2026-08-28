package h3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class q2 implements g {
    public static final Object D = new Object();
    public static final Object E = new Object();
    public static final f1 F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public int A;
    public int B;
    public long C;
    public Object f9659b;
    public Object d;
    public long f9661e;
    public long f9662f;
    public long h;
    public boolean f9663n;
    public boolean f9664r;
    public boolean f9665s;
    public b1 v;
    public boolean f9666w;
    public long f9667x;
    public long f9668y;
    public Object f9658a = D;
    public f1 f9660c = F;

    static {
        c1 c1Var;
        x0 x0Var = new x0();
        o8.x xVar = o8.z.f19105b;
        o8.l0 l0Var = o8.l0.f19056e;
        List list = Collections.EMPTY_LIST;
        o8.l0 l0Var2 = o8.l0.f19056e;
        d1 d1Var = d1.f9375c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            c1Var = new c1(uri, null, null, list, null, l0Var2, null);
        } else {
            c1Var = null;
        }
        F = new f1("com.google.android.exoplayer2.Timeline", new y0(x0Var), c1Var, new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h1.U, d1Var);
        int i9 = d5.f0.f4349a;
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f9665s;
        if (this.v != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        d5.a.i(z11);
        if (this.v == null) {
            return false;
        }
        return true;
    }

    public final void b(Object obj, f1 f1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, b1 b1Var, long j13, long j14, int i9, int i10, long j15) {
        f1 f1Var2;
        Object obj3;
        boolean z12;
        c1 c1Var;
        this.f9658a = obj;
        if (f1Var != null) {
            f1Var2 = f1Var;
        } else {
            f1Var2 = F;
        }
        this.f9660c = f1Var2;
        if (f1Var != null && (c1Var = f1Var.f9399b) != null) {
            obj3 = c1Var.f9366f;
        } else {
            obj3 = null;
        }
        this.f9659b = obj3;
        this.d = obj2;
        this.f9661e = j10;
        this.f9662f = j11;
        this.h = j12;
        this.f9663n = z10;
        this.f9664r = z11;
        if (b1Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f9665s = z12;
        this.v = b1Var;
        this.f9667x = j13;
        this.f9668y = j14;
        this.A = i9;
        this.B = i10;
        this.C = j15;
        this.f9666w = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q2.class.equals(obj.getClass())) {
            q2 q2Var = (q2) obj;
            if (d5.f0.a(this.f9658a, q2Var.f9658a) && d5.f0.a(this.f9660c, q2Var.f9660c) && d5.f0.a(this.d, q2Var.d) && d5.f0.a(this.v, q2Var.v) && this.f9661e == q2Var.f9661e && this.f9662f == q2Var.f9662f && this.h == q2Var.h && this.f9663n == q2Var.f9663n && this.f9664r == q2Var.f9664r && this.f9666w == q2Var.f9666w && this.f9667x == q2Var.f9667x && this.f9668y == q2Var.f9668y && this.A == q2Var.A && this.B == q2Var.B && this.C == q2Var.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f9660c.hashCode() + ((this.f9658a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i9 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        b1 b1Var = this.v;
        if (b1Var != null) {
            i9 = b1Var.hashCode();
        }
        long j10 = this.f9661e;
        long j11 = this.f9662f;
        long j12 = this.h;
        long j13 = this.f9667x;
        long j14 = this.f9668y;
        long j15 = this.C;
        return ((((((((((((((((((((((i10 + i9) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f9663n ? 1 : 0)) * 31) + (this.f9664r ? 1 : 0)) * 31) + (this.f9666w ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.A) * 31) + this.B) * 31) + ((int) (j15 ^ (j15 >>> 32)));
    }
}
