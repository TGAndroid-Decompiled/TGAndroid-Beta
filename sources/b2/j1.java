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
    public static final Object f2124q = new Object();
    public static final k0 f2125r;
    public static final String f2126s;
    public static final String f2127t;
    public static final String f2128u;
    public static final String v;
    public static final String f2129w;
    public static final String f2130x;
    public static final String f2131y;
    public static final String f2132z;
    public Object f2134b;
    public Object d;
    public long f2136e;
    public long f2137f;
    public long f2138g;
    public boolean h;
    public boolean f2139i;
    public e0 f2140j;
    public boolean f2141k;
    public long f2142l;
    public long f2143m;
    public int f2144n;
    public int f2145o;
    public long f2146p;
    public Object f2133a = f2124q;
    public k0 f2135c = f2125r;

    static {
        boolean z10;
        f0 f0Var;
        y yVar = new y();
        b0 b0Var = new b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8948e;
        d0 d0Var = new d0();
        g0 g0Var = g0.d;
        Uri uri = Uri.EMPTY;
        if (b0Var.f1998b != null && b0Var.f1997a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        c0 c0Var = null;
        if (uri != null) {
            if (b0Var.f1997a != null) {
                c0Var = new c0(b0Var);
            }
            f0Var = new f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        f2125r = new k0("androidx.media3.common.Timeline", new z(yVar), f0Var, new e0(d0Var), n0.K, g0Var);
        f2126s = Integer.toString(1, 36);
        f2127t = Integer.toString(2, 36);
        f2128u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f2129w = Integer.toString(5, 36);
        f2130x = Integer.toString(6, 36);
        f2131y = Integer.toString(7, 36);
        f2132z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f2140j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, k0 k0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, e0 e0Var, long j12, long j13, int i10, int i11, long j14) {
        k0 k0Var2;
        this.f2133a = obj;
        if (k0Var != null) {
            k0Var2 = k0Var;
        } else {
            k0Var2 = f2125r;
        }
        this.f2135c = k0Var2;
        if (k0Var != null) {
            f0 f0Var = k0Var.f2154b;
        }
        this.f2134b = null;
        this.d = obj2;
        this.f2136e = j3;
        this.f2137f = j10;
        this.f2138g = j11;
        this.h = z10;
        this.f2139i = z11;
        this.f2140j = e0Var;
        this.f2142l = j12;
        this.f2143m = j13;
        this.f2144n = i10;
        this.f2145o = i11;
        this.f2146p = j14;
        this.f2141k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class.equals(obj.getClass())) {
            j1 j1Var = (j1) obj;
            if (Objects.equals(this.f2133a, j1Var.f2133a) && Objects.equals(this.f2135c, j1Var.f2135c) && Objects.equals(this.d, j1Var.d) && Objects.equals(this.f2140j, j1Var.f2140j) && this.f2136e == j1Var.f2136e && this.f2137f == j1Var.f2137f && this.f2138g == j1Var.f2138g && this.h == j1Var.h && this.f2139i == j1Var.f2139i && this.f2141k == j1Var.f2141k && this.f2142l == j1Var.f2142l && this.f2143m == j1Var.f2143m && this.f2144n == j1Var.f2144n && this.f2145o == j1Var.f2145o && this.f2146p == j1Var.f2146p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f2135c.hashCode() + ((this.f2133a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        e0 e0Var = this.f2140j;
        if (e0Var != null) {
            i10 = e0Var.hashCode();
        }
        long j3 = this.f2136e;
        long j10 = this.f2137f;
        long j11 = this.f2138g;
        long j12 = this.f2142l;
        long j13 = this.f2143m;
        long j14 = this.f2146p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f2139i ? 1 : 0)) * 31) + (this.f2141k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f2144n) * 31) + this.f2145o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
