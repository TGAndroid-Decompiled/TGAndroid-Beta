package j3;

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
    public Object f10696b;
    public Object d;
    public long f10698e;
    public long f10699f;
    public long h;
    public boolean f10700n;
    public boolean f10701r;
    public boolean f10702s;
    public b1 v;
    public boolean f10703w;
    public long f10704x;
    public long f10705y;
    public Object f10695a = D;
    public f1 f10697c = F;

    static {
        c1 c1Var;
        x0 x0Var = new x0();
        q8.x xVar = q8.z.f46511b;
        q8.l0 l0Var = q8.l0.f46462e;
        List list = Collections.EMPTY_LIST;
        q8.l0 l0Var2 = q8.l0.f46462e;
        d1 d1Var = d1.f10413c;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            c1Var = new c1(uri, null, null, list, null, l0Var2, null);
        } else {
            c1Var = null;
        }
        F = new f1("com.google.android.exoplayer2.Timeline", new y0(x0Var), c1Var, new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h1.U, d1Var);
        int i10 = f5.d0.f6579a;
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
        boolean z12 = this.f10702s;
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
        f5.a.i(z11);
        if (this.v == null) {
            return false;
        }
        return true;
    }

    public final void b(Object obj, f1 f1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, b1 b1Var, long j13, long j14, int i10, int i11, long j15) {
        f1 f1Var2;
        Object obj3;
        boolean z12;
        c1 c1Var;
        this.f10695a = obj;
        if (f1Var != null) {
            f1Var2 = f1Var;
        } else {
            f1Var2 = F;
        }
        this.f10697c = f1Var2;
        if (f1Var != null && (c1Var = f1Var.f10437b) != null) {
            obj3 = c1Var.f10405f;
        } else {
            obj3 = null;
        }
        this.f10696b = obj3;
        this.d = obj2;
        this.f10698e = j10;
        this.f10699f = j11;
        this.h = j12;
        this.f10700n = z10;
        this.f10701r = z11;
        if (b1Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f10702s = z12;
        this.v = b1Var;
        this.f10704x = j13;
        this.f10705y = j14;
        this.A = i10;
        this.B = i11;
        this.C = j15;
        this.f10703w = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q2.class.equals(obj.getClass())) {
            q2 q2Var = (q2) obj;
            if (f5.d0.a(this.f10695a, q2Var.f10695a) && f5.d0.a(this.f10697c, q2Var.f10697c) && f5.d0.a(this.d, q2Var.d) && f5.d0.a(this.v, q2Var.v) && this.f10698e == q2Var.f10698e && this.f10699f == q2Var.f10699f && this.h == q2Var.h && this.f10700n == q2Var.f10700n && this.f10701r == q2Var.f10701r && this.f10703w == q2Var.f10703w && this.f10704x == q2Var.f10704x && this.f10705y == q2Var.f10705y && this.A == q2Var.A && this.B == q2Var.B && this.C == q2Var.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f10697c.hashCode() + ((this.f10695a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        b1 b1Var = this.v;
        if (b1Var != null) {
            i10 = b1Var.hashCode();
        }
        long j10 = this.f10698e;
        long j11 = this.f10699f;
        long j12 = this.h;
        long j13 = this.f10704x;
        long j14 = this.f10705y;
        long j15 = this.C;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f10700n ? 1 : 0)) * 31) + (this.f10701r ? 1 : 0)) * 31) + (this.f10703w ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.A) * 31) + this.B) * 31) + ((int) (j15 ^ (j15 >>> 32)));
    }
}
