package e2;

import a8.ia;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
public final class k1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object f10320q = new Object();
    public static final l0 f10321r;
    public static final String f10322s;
    public static final String f10323t;
    public static final String f10324u;
    public static final String v;
    public static final String f10325w;
    public static final String f10326x;
    public static final String f10327y;
    public static final String f10328z;
    public Object f10330b;
    public Object d;
    public long f10332e;
    public long f10333f;
    public long f10334g;
    public boolean h;
    public boolean f10335i;
    public f0 f10336j;
    public boolean f10337k;
    public long f10338l;
    public long f10339m;
    public int f10340n;
    public int f10341o;
    public long f10342p;
    public Object f10329a = f10320q;
    public l0 f10331c = f10321r;

    static {
        boolean z9;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14399e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10200b != null && c0Var.f10199a == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.p(z9);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10199a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        f10321r = new l0("androidx.media3.common.Timeline", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
        f10322s = Integer.toString(1, 36);
        f10323t = Integer.toString(2, 36);
        f10324u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f10325w = Integer.toString(5, 36);
        f10326x = Integer.toString(6, 36);
        f10327y = Integer.toString(7, 36);
        f10328z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f10336j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, l0 l0Var, Object obj2, long j3, long j10, long j11, boolean z9, boolean z10, f0 f0Var, long j12, long j13, int i7, int i10, long j14) {
        l0 l0Var2;
        this.f10329a = obj;
        if (l0Var != null) {
            l0Var2 = l0Var;
        } else {
            l0Var2 = f10321r;
        }
        this.f10331c = l0Var2;
        if (l0Var != null) {
            g0 g0Var = l0Var.f10355b;
        }
        this.f10330b = null;
        this.d = obj2;
        this.f10332e = j3;
        this.f10333f = j10;
        this.f10334g = j11;
        this.h = z9;
        this.f10335i = z10;
        this.f10336j = f0Var;
        this.f10338l = j12;
        this.f10339m = j13;
        this.f10340n = i7;
        this.f10341o = i10;
        this.f10342p = j14;
        this.f10337k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class.equals(obj.getClass())) {
                k1 k1Var = (k1) obj;
                if (Objects.equals(this.f10329a, k1Var.f10329a) && Objects.equals(this.f10331c, k1Var.f10331c) && Objects.equals(this.d, k1Var.d) && Objects.equals(this.f10336j, k1Var.f10336j) && this.f10332e == k1Var.f10332e && this.f10333f == k1Var.f10333f && this.f10334g == k1Var.f10334g && this.h == k1Var.h && this.f10335i == k1Var.f10335i && this.f10337k == k1Var.f10337k && this.f10338l == k1Var.f10338l && this.f10339m == k1Var.f10339m && this.f10340n == k1Var.f10340n && this.f10341o == k1Var.f10341o && this.f10342p == k1Var.f10342p) {
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
        int hashCode2 = (this.f10331c.hashCode() + ((this.f10329a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        f0 f0Var = this.f10336j;
        if (f0Var != null) {
            i7 = f0Var.hashCode();
        }
        long j3 = this.f10332e;
        long j10 = this.f10333f;
        long j11 = this.f10334g;
        long j12 = this.f10338l;
        long j13 = this.f10339m;
        long j14 = this.f10342p;
        return ((((((((((((((((((((((i10 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10335i ? 1 : 0)) * 31) + (this.f10337k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f10340n) * 31) + this.f10341o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
