package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import v7.u6;
public final class o1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object f2253q = new Object();
    public static final p0 f2254r;
    public static final String f2255s;
    public static final String f2256t;
    public static final String f2257u;
    public static final String v;
    public static final String f2258w;
    public static final String f2259x;
    public static final String f2260y;
    public static final String f2261z;
    public Object f2263b;
    public Object d;
    public long e;
    public long f2265f;
    public long f2266g;
    public boolean h;
    public boolean f2267i;
    public j0 f2268j;
    public boolean f2269k;
    public long f2270l;
    public long f2271m;
    public int f2272n;
    public int f2273o;
    public long f2274p;
    public Object f2262a = f2253q;
    public p0 f2264c = f2254r;

    static {
        boolean z10;
        k0 k0Var;
        d0 d0Var = new d0();
        g0 g0Var = new g0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        i0 i0Var = new i0();
        l0 l0Var = l0.d;
        Uri uri = Uri.EMPTY;
        if (g0Var.f2145b != null && g0Var.f2144a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        h0 h0Var = null;
        if (uri != null) {
            if (g0Var.f2144a != null) {
                h0Var = new h0(g0Var);
            }
            k0Var = new k0(uri, null, h0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        f2254r = new p0("androidx.media3.common.Timeline", new e0(d0Var), k0Var, new j0(i0Var), s0.L, l0Var);
        f2255s = Integer.toString(1, 36);
        f2256t = Integer.toString(2, 36);
        f2257u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f2258w = Integer.toString(5, 36);
        f2259x = Integer.toString(6, 36);
        f2260y = Integer.toString(7, 36);
        f2261z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f2268j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, p0 p0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, j0 j0Var, long j13, long j14, int i10, int i11, long j15) {
        p0 p0Var2;
        this.f2262a = obj;
        if (p0Var != null) {
            p0Var2 = p0Var;
        } else {
            p0Var2 = f2254r;
        }
        this.f2264c = p0Var2;
        if (p0Var != null) {
            k0 k0Var = p0Var.f2282b;
        }
        this.f2263b = null;
        this.d = obj2;
        this.e = j10;
        this.f2265f = j11;
        this.f2266g = j12;
        this.h = z10;
        this.f2267i = z11;
        this.f2268j = j0Var;
        this.f2270l = j13;
        this.f2271m = j14;
        this.f2272n = i10;
        this.f2273o = i11;
        this.f2274p = j15;
        this.f2269k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o1.class.equals(obj.getClass())) {
                o1 o1Var = (o1) obj;
                if (Objects.equals(this.f2262a, o1Var.f2262a) && Objects.equals(this.f2264c, o1Var.f2264c) && Objects.equals(this.d, o1Var.d) && Objects.equals(this.f2268j, o1Var.f2268j) && this.e == o1Var.e && this.f2265f == o1Var.f2265f && this.f2266g == o1Var.f2266g && this.h == o1Var.h && this.f2267i == o1Var.f2267i && this.f2269k == o1Var.f2269k && this.f2270l == o1Var.f2270l && this.f2271m == o1Var.f2271m && this.f2272n == o1Var.f2272n && this.f2273o == o1Var.f2273o && this.f2274p == o1Var.f2274p) {
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
        int hashCode2 = (this.f2264c.hashCode() + ((this.f2262a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        j0 j0Var = this.f2268j;
        if (j0Var != null) {
            i10 = j0Var.hashCode();
        }
        long j10 = this.e;
        long j11 = this.f2265f;
        long j12 = this.f2266g;
        long j13 = this.f2270l;
        long j14 = this.f2271m;
        long j15 = this.f2274p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f2267i ? 1 : 0)) * 31) + (this.f2269k ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f2272n) * 31) + this.f2273o) * 31) + ((int) (j15 ^ (j15 >>> 32)));
    }
}
