package h3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public final class r2 implements g {
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

    public Object f8113b;
    public Object d;

    public long f8115e;

    public long f8116f;
    public long h;

    public boolean f8117n;

    public boolean f8118r;

    public boolean f8119s;
    public b1 v;

    public boolean f8120w;

    public long f8121x;

    public long f8122y;

    public Object f8112a = D;

    public f1 f8114c = F;

    static {
        x0 x0Var = new x0();
        p8.x xVar = p8.z.f45604b;
        p8.l0 l0Var = p8.l0.f45555e;
        List list = Collections.EMPTY_LIST;
        p8.l0 l0Var2 = p8.l0.f45555e;
        d1 d1Var = d1.f7806c;
        Uri uri = Uri.EMPTY;
        F = new f1("com.google.android.exoplayer2.Timeline", new z0(x0Var), uri != null ? new c1(uri, null, list, l0Var2) : null, new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h1.U, d1Var);
        int i10 = d5.g0.f4795a;
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
        d5.a.i(this.f8119s == (this.v != null));
        return this.v != null;
    }

    public final void b(Object obj, f1 f1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, b1 b1Var, long j13, long j14, int i10, int i11, long j15) {
        this.f8112a = obj;
        this.f8114c = f1Var != null ? f1Var : F;
        if (f1Var != null) {
            c1 c1Var = f1Var.f7830b;
        }
        this.f8113b = null;
        this.d = obj2;
        this.f8115e = j10;
        this.f8116f = j11;
        this.h = j12;
        this.f8117n = z10;
        this.f8118r = z11;
        this.f8119s = b1Var != null;
        this.v = b1Var;
        this.f8121x = j13;
        this.f8122y = j14;
        this.A = i10;
        this.B = i11;
        this.C = j15;
        this.f8120w = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r2.class.equals(obj.getClass())) {
            r2 r2Var = (r2) obj;
            if (d5.g0.a(this.f8112a, r2Var.f8112a) && d5.g0.a(this.f8114c, r2Var.f8114c) && d5.g0.a(this.d, r2Var.d) && d5.g0.a(this.v, r2Var.v) && this.f8115e == r2Var.f8115e && this.f8116f == r2Var.f8116f && this.h == r2Var.h && this.f8117n == r2Var.f8117n && this.f8118r == r2Var.f8118r && this.f8120w == r2Var.f8120w && this.f8121x == r2Var.f8121x && this.f8122y == r2Var.f8122y && this.A == r2Var.A && this.B == r2Var.B && this.C == r2Var.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8114c.hashCode() + ((this.f8112a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        b1 b1Var = this.v;
        int iHashCode3 = (iHashCode2 + (b1Var != null ? b1Var.hashCode() : 0)) * 31;
        long j10 = this.f8115e;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f8116f;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.h;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f8117n ? 1 : 0)) * 31) + (this.f8118r ? 1 : 0)) * 31) + (this.f8120w ? 1 : 0)) * 31;
        long j13 = this.f8121x;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f8122y;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.A) * 31) + this.B) * 31;
        long j15 = this.C;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }
}
