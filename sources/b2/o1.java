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
    public static final Object f2249q = new Object();
    public static final p0 f2250r;
    public static final String f2251s;
    public static final String f2252t;
    public static final String f2253u;
    public static final String v;
    public static final String f2254w;
    public static final String f2255x;
    public static final String f2256y;
    public static final String f2257z;
    public Object f2259b;
    public Object d;
    public long e;
    public long f2261f;
    public long f2262g;
    public boolean h;
    public boolean f2263i;
    public j0 f2264j;
    public boolean f2265k;
    public long f2266l;
    public long f2267m;
    public int f2268n;
    public int f2269o;
    public long f2270p;
    public Object f2258a = f2249q;
    public p0 f2260c = f2250r;

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
        if (g0Var.f2141b != null && g0Var.f2140a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.p(z10);
        h0 h0Var = null;
        if (uri != null) {
            if (g0Var.f2140a != null) {
                h0Var = new h0(g0Var);
            }
            k0Var = new k0(uri, null, h0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        f2250r = new p0("androidx.media3.common.Timeline", new e0(d0Var), k0Var, new j0(i0Var), s0.L, l0Var);
        f2251s = Integer.toString(1, 36);
        f2252t = Integer.toString(2, 36);
        f2253u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f2254w = Integer.toString(5, 36);
        f2255x = Integer.toString(6, 36);
        f2256y = Integer.toString(7, 36);
        f2257z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f2264j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, p0 p0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, j0 j0Var, long j13, long j14, int i10, int i11, long j15) {
        p0 p0Var2;
        this.f2258a = obj;
        if (p0Var != null) {
            p0Var2 = p0Var;
        } else {
            p0Var2 = f2250r;
        }
        this.f2260c = p0Var2;
        if (p0Var != null) {
            k0 k0Var = p0Var.f2278b;
        }
        this.f2259b = null;
        this.d = obj2;
        this.e = j10;
        this.f2261f = j11;
        this.f2262g = j12;
        this.h = z10;
        this.f2263i = z11;
        this.f2264j = j0Var;
        this.f2266l = j13;
        this.f2267m = j14;
        this.f2268n = i10;
        this.f2269o = i11;
        this.f2270p = j15;
        this.f2265k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o1.class.equals(obj.getClass())) {
                o1 o1Var = (o1) obj;
                if (Objects.equals(this.f2258a, o1Var.f2258a) && Objects.equals(this.f2260c, o1Var.f2260c) && Objects.equals(this.d, o1Var.d) && Objects.equals(this.f2264j, o1Var.f2264j) && this.e == o1Var.e && this.f2261f == o1Var.f2261f && this.f2262g == o1Var.f2262g && this.h == o1Var.h && this.f2263i == o1Var.f2263i && this.f2265k == o1Var.f2265k && this.f2266l == o1Var.f2266l && this.f2267m == o1Var.f2267m && this.f2268n == o1Var.f2268n && this.f2269o == o1Var.f2269o && this.f2270p == o1Var.f2270p) {
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
        int hashCode2 = (this.f2260c.hashCode() + ((this.f2258a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        j0 j0Var = this.f2264j;
        if (j0Var != null) {
            i10 = j0Var.hashCode();
        }
        long j10 = this.e;
        long j11 = this.f2261f;
        long j12 = this.f2262g;
        long j13 = this.f2266l;
        long j14 = this.f2267m;
        long j15 = this.f2270p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f2263i ? 1 : 0)) * 31) + (this.f2265k ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f2268n) * 31) + this.f2269o) * 31) + ((int) (j15 ^ (j15 >>> 32)));
    }
}
