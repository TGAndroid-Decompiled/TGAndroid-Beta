package j3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
public final class n2 implements g {
    public static final Object E = new Object();
    public static final Object F = new Object();
    public static final c1 G;
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
    public static final String T;
    public int B;
    public int C;
    public long D;
    public Object f8732b;
    public Object d;
    public long e;
    public long f8734f;
    public long h;
    public boolean f8735n;
    public boolean f8736r;
    public boolean f8737s;
    public x0 v;
    public boolean f8738w;
    public long f8739x;
    public long f8740y;
    public Object f8731a = E;
    public c1 f8733c = G;

    static {
        boolean z4;
        y0 y0Var;
        s0 s0Var = new s0();
        v0 v0Var = new v0();
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var = s8.i0.e;
        z0 z0Var = z0.f8878c;
        Uri uri = Uri.EMPTY;
        if (v0Var.f8834b != null && v0Var.f8833a == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.i(z4);
        w0 w0Var = null;
        if (uri != null) {
            if (v0Var.f8833a != null) {
                w0Var = new w0(v0Var);
            }
            y0Var = new y0(uri, null, w0Var, null, list, null, i0Var, null);
        } else {
            y0Var = null;
        }
        G = new c1("com.google.android.exoplayer2.Timeline", new t0(s0Var), y0Var, new x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), e1.V, z0Var);
        int i10 = h5.d0.f6924a;
        H = Integer.toString(1, 36);
        I = Integer.toString(2, 36);
        J = Integer.toString(3, 36);
        K = Integer.toString(4, 36);
        L = Integer.toString(5, 36);
        M = Integer.toString(6, 36);
        N = Integer.toString(7, 36);
        O = Integer.toString(8, 36);
        P = Integer.toString(9, 36);
        Q = Integer.toString(10, 36);
        R = Integer.toString(11, 36);
        S = Integer.toString(12, 36);
        T = Integer.toString(13, 36);
    }

    public final boolean a() {
        boolean z4;
        boolean z10;
        boolean z11 = this.f8737s;
        if (this.v != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z11 == z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.i(z10);
        if (this.v == null) {
            return false;
        }
        return true;
    }

    public final void b(Object obj, c1 c1Var, Object obj2, long j10, long j11, long j12, boolean z4, boolean z10, x0 x0Var, long j13, long j14, int i10, int i11, long j15) {
        c1 c1Var2;
        Object obj3;
        boolean z11;
        y0 y0Var;
        this.f8731a = obj;
        if (c1Var != null) {
            c1Var2 = c1Var;
        } else {
            c1Var2 = G;
        }
        this.f8733c = c1Var2;
        if (c1Var != null && (y0Var = c1Var.f8431b) != null) {
            obj3 = y0Var.f8875n;
        } else {
            obj3 = null;
        }
        this.f8732b = obj3;
        this.d = obj2;
        this.e = j10;
        this.f8734f = j11;
        this.h = j12;
        this.f8735n = z4;
        this.f8736r = z10;
        if (x0Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f8737s = z11;
        this.v = x0Var;
        this.f8739x = j13;
        this.f8740y = j14;
        this.B = i10;
        this.C = i11;
        this.D = j15;
        this.f8738w = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n2.class.equals(obj.getClass())) {
            n2 n2Var = (n2) obj;
            if (h5.d0.a(this.f8731a, n2Var.f8731a) && h5.d0.a(this.f8733c, n2Var.f8733c) && h5.d0.a(this.d, n2Var.d) && h5.d0.a(this.v, n2Var.v) && this.e == n2Var.e && this.f8734f == n2Var.f8734f && this.h == n2Var.h && this.f8735n == n2Var.f8735n && this.f8736r == n2Var.f8736r && this.f8738w == n2Var.f8738w && this.f8739x == n2Var.f8739x && this.f8740y == n2Var.f8740y && this.B == n2Var.B && this.C == n2Var.C && this.D == n2Var.D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f8733c.hashCode() + ((this.f8731a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        x0 x0Var = this.v;
        if (x0Var != null) {
            i10 = x0Var.hashCode();
        }
        long j10 = this.e;
        long j11 = this.f8734f;
        long j12 = this.h;
        long j13 = this.f8739x;
        long j14 = this.f8740y;
        long j15 = this.D;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f8735n ? 1 : 0)) * 31) + (this.f8736r ? 1 : 0)) * 31) + (this.f8738w ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.B) * 31) + this.C) * 31) + ((int) (j15 ^ (j15 >>> 32)));
    }
}
