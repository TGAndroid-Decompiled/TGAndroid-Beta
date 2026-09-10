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
    public static final Object f1742q = new Object();
    public static final k0 f1743r;
    public static final String f1744s;
    public static final String f1745t;
    public static final String f1746u;
    public static final String v;
    public static final String f1747w;
    public static final String f1748x;
    public static final String f1749y;
    public static final String f1750z;
    public Object f1752b;
    public Object d;
    public long e;
    public long f1754f;
    public long f1755g;
    public boolean h;
    public boolean f1756i;
    public e0 f1757j;
    public boolean f1758k;
    public long f1759l;
    public long f1760m;
    public int f1761n;
    public int f1762o;
    public long f1763p;
    public Object f1751a = f1742q;
    public k0 f1753c = f1743r;

    static {
        boolean z10;
        f0 f0Var;
        y yVar = new y();
        b0 b0Var = new b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        d0 d0Var = new d0();
        g0 g0Var = g0.d;
        Uri uri = Uri.EMPTY;
        if (b0Var.f1632b != null && b0Var.f1631a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        c0 c0Var = null;
        if (uri != null) {
            if (b0Var.f1631a != null) {
                c0Var = new c0(b0Var);
            }
            f0Var = new f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        f1743r = new k0("androidx.media3.common.Timeline", new z(yVar), f0Var, new e0(d0Var), n0.K, g0Var);
        f1744s = Integer.toString(1, 36);
        f1745t = Integer.toString(2, 36);
        f1746u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f1747w = Integer.toString(5, 36);
        f1748x = Integer.toString(6, 36);
        f1749y = Integer.toString(7, 36);
        f1750z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f1757j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, k0 k0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, e0 e0Var, long j12, long j13, int i10, int i11, long j14) {
        k0 k0Var2;
        this.f1751a = obj;
        if (k0Var != null) {
            k0Var2 = k0Var;
        } else {
            k0Var2 = f1743r;
        }
        this.f1753c = k0Var2;
        if (k0Var != null) {
            f0 f0Var = k0Var.f1771b;
        }
        this.f1752b = null;
        this.d = obj2;
        this.e = j3;
        this.f1754f = j10;
        this.f1755g = j11;
        this.h = z10;
        this.f1756i = z11;
        this.f1757j = e0Var;
        this.f1759l = j12;
        this.f1760m = j13;
        this.f1761n = i10;
        this.f1762o = i11;
        this.f1763p = j14;
        this.f1758k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class.equals(obj.getClass())) {
            j1 j1Var = (j1) obj;
            if (Objects.equals(this.f1751a, j1Var.f1751a) && Objects.equals(this.f1753c, j1Var.f1753c) && Objects.equals(this.d, j1Var.d) && Objects.equals(this.f1757j, j1Var.f1757j) && this.e == j1Var.e && this.f1754f == j1Var.f1754f && this.f1755g == j1Var.f1755g && this.h == j1Var.h && this.f1756i == j1Var.f1756i && this.f1758k == j1Var.f1758k && this.f1759l == j1Var.f1759l && this.f1760m == j1Var.f1760m && this.f1761n == j1Var.f1761n && this.f1762o == j1Var.f1762o && this.f1763p == j1Var.f1763p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f1753c.hashCode() + ((this.f1751a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        e0 e0Var = this.f1757j;
        if (e0Var != null) {
            i10 = e0Var.hashCode();
        }
        long j3 = this.e;
        long j10 = this.f1754f;
        long j11 = this.f1755g;
        long j12 = this.f1759l;
        long j13 = this.f1760m;
        long j14 = this.f1763p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f1756i ? 1 : 0)) * 31) + (this.f1758k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f1761n) * 31) + this.f1762o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
