package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import v7.u6;
public final class n1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object f3860q = new Object();
    public static final o0 f3861r;
    public static final String f3862s;
    public static final String f3863t;
    public static final String f3864u;
    public static final String v;
    public static final String f3865w;
    public static final String f3866x;
    public static final String f3867y;
    public static final String f3868z;
    public Object f3870b;
    public Object d;
    public long e;
    public long f3872f;
    public long f3873g;
    public boolean h;
    public boolean f3874i;
    public i0 f3875j;
    public boolean f3876k;
    public long f3877l;
    public long f3878m;
    public int f3879n;
    public int f3880o;
    public long f3881p;
    public Object f3869a = f3860q;
    public o0 f3871c = f3861r;

    static {
        boolean z10;
        j0 j0Var;
        c0 c0Var = new c0();
        f0 f0Var = new f0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        h0 h0Var = new h0();
        k0 k0Var = k0.d;
        Uri uri = Uri.EMPTY;
        if (f0Var.f3753b != null && f0Var.f3752a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        g0 g0Var = null;
        if (uri != null) {
            if (f0Var.f3752a != null) {
                g0Var = new g0(f0Var);
            }
            j0Var = new j0(uri, null, g0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            j0Var = null;
        }
        f3861r = new o0("androidx.media3.common.Timeline", new d0(c0Var), j0Var, new i0(h0Var), r0.L, k0Var);
        f3862s = Integer.toString(1, 36);
        f3863t = Integer.toString(2, 36);
        f3864u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f3865w = Integer.toString(5, 36);
        f3866x = Integer.toString(6, 36);
        f3867y = Integer.toString(7, 36);
        f3868z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f3875j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, o0 o0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, i0 i0Var, long j13, long j14, int i10, int i11, long j15) {
        o0 o0Var2;
        this.f3869a = obj;
        if (o0Var != null) {
            o0Var2 = o0Var;
        } else {
            o0Var2 = f3861r;
        }
        this.f3871c = o0Var2;
        if (o0Var != null) {
            j0 j0Var = o0Var.f3889b;
        }
        this.f3870b = null;
        this.d = obj2;
        this.e = j10;
        this.f3872f = j11;
        this.f3873g = j12;
        this.h = z10;
        this.f3874i = z11;
        this.f3875j = i0Var;
        this.f3877l = j13;
        this.f3878m = j14;
        this.f3879n = i10;
        this.f3880o = i11;
        this.f3881p = j15;
        this.f3876k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n1.class.equals(obj.getClass())) {
                n1 n1Var = (n1) obj;
                if (Objects.equals(this.f3869a, n1Var.f3869a) && Objects.equals(this.f3871c, n1Var.f3871c) && Objects.equals(this.d, n1Var.d) && Objects.equals(this.f3875j, n1Var.f3875j) && this.e == n1Var.e && this.f3872f == n1Var.f3872f && this.f3873g == n1Var.f3873g && this.h == n1Var.h && this.f3874i == n1Var.f3874i && this.f3876k == n1Var.f3876k && this.f3877l == n1Var.f3877l && this.f3878m == n1Var.f3878m && this.f3879n == n1Var.f3879n && this.f3880o == n1Var.f3880o && this.f3881p == n1Var.f3881p) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3871c.hashCode() + ((this.f3869a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        i0 i0Var = this.f3875j;
        if (i0Var != null) {
            i10 = i0Var.hashCode();
        }
        long j10 = this.e;
        long j11 = this.f3872f;
        long j12 = this.f3873g;
        long j13 = this.f3877l;
        long j14 = this.f3878m;
        long j15 = this.f3881p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f3874i ? 1 : 0)) * 31) + (this.f3876k ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f3879n) * 31) + this.f3880o) * 31) + ((int) (j15 ^ (j15 >>> 32)));
    }
}
