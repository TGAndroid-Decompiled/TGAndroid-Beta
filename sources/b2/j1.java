package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
public final class j1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object f2097q = new Object();
    public static final k0 f2098r;
    public static final String f2099s;
    public static final String f2100t;
    public static final String f2101u;
    public static final String v;
    public static final String f2102w;
    public static final String f2103x;
    public static final String f2104y;
    public static final String f2105z;
    public Object f2107b;
    public Object d;
    public long f2109e;
    public long f2110f;
    public long f2111g;
    public boolean h;
    public boolean f2112i;
    public e0 f2113j;
    public boolean f2114k;
    public long f2115l;
    public long f2116m;
    public int f2117n;
    public int f2118o;
    public long f2119p;
    public Object f2106a = f2097q;
    public k0 f2108c = f2098r;

    static {
        boolean z10;
        f0 f0Var;
        y yVar = new y();
        b0 b0Var = new b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8920e;
        d0 d0Var = new d0();
        g0 g0Var = g0.d;
        Uri uri = Uri.EMPTY;
        if (b0Var.f1971b != null && b0Var.f1970a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        c0 c0Var = null;
        if (uri != null) {
            if (b0Var.f1970a != null) {
                c0Var = new c0(b0Var);
            }
            f0Var = new f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        f2098r = new k0("androidx.media3.common.Timeline", new z(yVar), f0Var, new e0(d0Var), n0.K, g0Var);
        f2099s = Integer.toString(1, 36);
        f2100t = Integer.toString(2, 36);
        f2101u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f2102w = Integer.toString(5, 36);
        f2103x = Integer.toString(6, 36);
        f2104y = Integer.toString(7, 36);
        f2105z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f2113j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, k0 k0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, e0 e0Var, long j12, long j13, int i10, int i11, long j14) {
        k0 k0Var2;
        this.f2106a = obj;
        if (k0Var != null) {
            k0Var2 = k0Var;
        } else {
            k0Var2 = f2098r;
        }
        this.f2108c = k0Var2;
        if (k0Var != null) {
            f0 f0Var = k0Var.f2127b;
        }
        this.f2107b = null;
        this.d = obj2;
        this.f2109e = j3;
        this.f2110f = j10;
        this.f2111g = j11;
        this.h = z10;
        this.f2112i = z11;
        this.f2113j = e0Var;
        this.f2115l = j12;
        this.f2116m = j13;
        this.f2117n = i10;
        this.f2118o = i11;
        this.f2119p = j14;
        this.f2114k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class.equals(obj.getClass())) {
            j1 j1Var = (j1) obj;
            if (Objects.equals(this.f2106a, j1Var.f2106a) && Objects.equals(this.f2108c, j1Var.f2108c) && Objects.equals(this.d, j1Var.d) && Objects.equals(this.f2113j, j1Var.f2113j) && this.f2109e == j1Var.f2109e && this.f2110f == j1Var.f2110f && this.f2111g == j1Var.f2111g && this.h == j1Var.h && this.f2112i == j1Var.f2112i && this.f2114k == j1Var.f2114k && this.f2115l == j1Var.f2115l && this.f2116m == j1Var.f2116m && this.f2117n == j1Var.f2117n && this.f2118o == j1Var.f2118o && this.f2119p == j1Var.f2119p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f2108c.hashCode() + ((this.f2106a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        e0 e0Var = this.f2113j;
        if (e0Var != null) {
            i10 = e0Var.hashCode();
        }
        long j3 = this.f2109e;
        long j10 = this.f2110f;
        long j11 = this.f2111g;
        long j12 = this.f2115l;
        long j13 = this.f2116m;
        long j14 = this.f2119p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f2112i ? 1 : 0)) * 31) + (this.f2114k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f2117n) * 31) + this.f2118o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
