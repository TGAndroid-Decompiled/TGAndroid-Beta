package b2;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import v7.t6;
public final class n1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object f2128q = new Object();
    public static final p0 f2129r;
    public static final String f2130s;
    public static final String f2131t;
    public static final String f2132u;
    public static final String v;
    public static final String f2133w;
    public static final String f2134x;
    public static final String f2135y;
    public static final String f2136z;
    public Object f2138b;
    public Object d;
    public long e;
    public long f2140f;
    public long f2141g;
    public boolean h;
    public boolean f2142i;
    public j0 f2143j;
    public boolean f2144k;
    public long f2145l;
    public long f2146m;
    public int f2147n;
    public int f2148o;
    public long f2149p;
    public Object f2137a = f2128q;
    public p0 f2139c = f2129r;

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
        if (g0Var.f2042b != null && g0Var.f2041a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.p(z10);
        h0 h0Var = null;
        if (uri != null) {
            if (g0Var.f2041a != null) {
                h0Var = new h0(g0Var);
            }
            k0Var = new k0(uri, null, h0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        f2129r = new p0("androidx.media3.common.Timeline", new e0(d0Var), k0Var, new j0(i0Var), s0.L, l0Var);
        f2130s = Integer.toString(1, 36);
        f2131t = Integer.toString(2, 36);
        f2132u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f2133w = Integer.toString(5, 36);
        f2134x = Integer.toString(6, 36);
        f2135y = Integer.toString(7, 36);
        f2136z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f2143j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, p0 p0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, j0 j0Var, long j13, long j14, int i10, int i11, long j15) {
        p0 p0Var2;
        this.f2137a = obj;
        if (p0Var != null) {
            p0Var2 = p0Var;
        } else {
            p0Var2 = f2129r;
        }
        this.f2139c = p0Var2;
        if (p0Var != null) {
            k0 k0Var = p0Var.f2182b;
        }
        this.f2138b = null;
        this.d = obj2;
        this.e = j10;
        this.f2140f = j11;
        this.f2141g = j12;
        this.h = z10;
        this.f2142i = z11;
        this.f2143j = j0Var;
        this.f2145l = j13;
        this.f2146m = j14;
        this.f2147n = i10;
        this.f2148o = i11;
        this.f2149p = j15;
        this.f2144k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n1.class.equals(obj.getClass())) {
                n1 n1Var = (n1) obj;
                if (Objects.equals(this.f2137a, n1Var.f2137a) && Objects.equals(this.f2139c, n1Var.f2139c) && Objects.equals(this.d, n1Var.d) && Objects.equals(this.f2143j, n1Var.f2143j) && this.e == n1Var.e && this.f2140f == n1Var.f2140f && this.f2141g == n1Var.f2141g && this.h == n1Var.h && this.f2142i == n1Var.f2142i && this.f2144k == n1Var.f2144k && this.f2145l == n1Var.f2145l && this.f2146m == n1Var.f2146m && this.f2147n == n1Var.f2147n && this.f2148o == n1Var.f2148o && this.f2149p == n1Var.f2149p) {
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
        int hashCode2 = (this.f2139c.hashCode() + ((this.f2137a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        j0 j0Var = this.f2143j;
        if (j0Var != null) {
            i10 = j0Var.hashCode();
        }
        long j10 = this.e;
        long j11 = this.f2140f;
        long j12 = this.f2141g;
        long j13 = this.f2145l;
        long j14 = this.f2146m;
        long j15 = this.f2149p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f2142i ? 1 : 0)) * 31) + (this.f2144k ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f2147n) * 31) + this.f2148o) * 31) + ((int) (j15 ^ (j15 >>> 32)));
    }
}
