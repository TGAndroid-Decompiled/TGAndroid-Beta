package e2;

import a8.ma;
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
    public static final Object f10461q = new Object();
    public static final l0 f10462r;
    public static final String f10463s;
    public static final String f10464t;
    public static final String f10465u;
    public static final String v;
    public static final String f10466w;
    public static final String f10467x;
    public static final String f10468y;
    public static final String f10469z;
    public Object f10471b;
    public Object d;
    public long f10473e;
    public long f10474f;
    public long f10475g;
    public boolean h;
    public boolean f10476i;
    public f0 f10477j;
    public boolean f10478k;
    public long f10479l;
    public long f10480m;
    public int f10481n;
    public int f10482o;
    public long f10483p;
    public Object f10470a = f10461q;
    public l0 f10472c = f10462r;

    static {
        boolean z10;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14066e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10341b != null && c0Var.f10340a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.p(z10);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10340a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        f10462r = new l0("androidx.media3.common.Timeline", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
        f10463s = Integer.toString(1, 36);
        f10464t = Integer.toString(2, 36);
        f10465u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f10466w = Integer.toString(5, 36);
        f10467x = Integer.toString(6, 36);
        f10468y = Integer.toString(7, 36);
        f10469z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f10477j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, l0 l0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, f0 f0Var, long j12, long j13, int i7, int i10, long j14) {
        l0 l0Var2;
        this.f10470a = obj;
        if (l0Var != null) {
            l0Var2 = l0Var;
        } else {
            l0Var2 = f10462r;
        }
        this.f10472c = l0Var2;
        if (l0Var != null) {
            g0 g0Var = l0Var.f10496b;
        }
        this.f10471b = null;
        this.d = obj2;
        this.f10473e = j3;
        this.f10474f = j10;
        this.f10475g = j11;
        this.h = z10;
        this.f10476i = z11;
        this.f10477j = f0Var;
        this.f10479l = j12;
        this.f10480m = j13;
        this.f10481n = i7;
        this.f10482o = i10;
        this.f10483p = j14;
        this.f10478k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class.equals(obj.getClass())) {
                k1 k1Var = (k1) obj;
                if (Objects.equals(this.f10470a, k1Var.f10470a) && Objects.equals(this.f10472c, k1Var.f10472c) && Objects.equals(this.d, k1Var.d) && Objects.equals(this.f10477j, k1Var.f10477j) && this.f10473e == k1Var.f10473e && this.f10474f == k1Var.f10474f && this.f10475g == k1Var.f10475g && this.h == k1Var.h && this.f10476i == k1Var.f10476i && this.f10478k == k1Var.f10478k && this.f10479l == k1Var.f10479l && this.f10480m == k1Var.f10480m && this.f10481n == k1Var.f10481n && this.f10482o == k1Var.f10482o && this.f10483p == k1Var.f10483p) {
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
        int hashCode2 = (this.f10472c.hashCode() + ((this.f10470a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        f0 f0Var = this.f10477j;
        if (f0Var != null) {
            i7 = f0Var.hashCode();
        }
        long j3 = this.f10473e;
        long j10 = this.f10474f;
        long j11 = this.f10475g;
        long j12 = this.f10479l;
        long j13 = this.f10480m;
        long j14 = this.f10483p;
        return ((((((((((((((((((((((i10 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10476i ? 1 : 0)) * 31) + (this.f10478k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f10481n) * 31) + this.f10482o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
