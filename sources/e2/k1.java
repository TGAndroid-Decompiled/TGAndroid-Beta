package e2;

import a8.la;
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
    public static final Object f10495q = new Object();
    public static final l0 f10496r;
    public static final String f10497s;
    public static final String f10498t;
    public static final String f10499u;
    public static final String v;
    public static final String f10500w;
    public static final String f10501x;
    public static final String f10502y;
    public static final String f10503z;
    public Object f10505b;
    public Object d;
    public long f10507e;
    public long f10508f;
    public long f10509g;
    public boolean h;
    public boolean f10510i;
    public f0 f10511j;
    public boolean f10512k;
    public long f10513l;
    public long f10514m;
    public int f10515n;
    public int f10516o;
    public long f10517p;
    public Object f10504a = f10495q;
    public l0 f10506c = f10496r;

    static {
        boolean z10;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14100e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10375b != null && c0Var.f10374a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10374a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        f10496r = new l0("androidx.media3.common.Timeline", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
        f10497s = Integer.toString(1, 36);
        f10498t = Integer.toString(2, 36);
        f10499u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f10500w = Integer.toString(5, 36);
        f10501x = Integer.toString(6, 36);
        f10502y = Integer.toString(7, 36);
        f10503z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f10511j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, l0 l0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, f0 f0Var, long j12, long j13, int i7, int i10, long j14) {
        l0 l0Var2;
        this.f10504a = obj;
        if (l0Var != null) {
            l0Var2 = l0Var;
        } else {
            l0Var2 = f10496r;
        }
        this.f10506c = l0Var2;
        if (l0Var != null) {
            g0 g0Var = l0Var.f10530b;
        }
        this.f10505b = null;
        this.d = obj2;
        this.f10507e = j3;
        this.f10508f = j10;
        this.f10509g = j11;
        this.h = z10;
        this.f10510i = z11;
        this.f10511j = f0Var;
        this.f10513l = j12;
        this.f10514m = j13;
        this.f10515n = i7;
        this.f10516o = i10;
        this.f10517p = j14;
        this.f10512k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class.equals(obj.getClass())) {
                k1 k1Var = (k1) obj;
                if (Objects.equals(this.f10504a, k1Var.f10504a) && Objects.equals(this.f10506c, k1Var.f10506c) && Objects.equals(this.d, k1Var.d) && Objects.equals(this.f10511j, k1Var.f10511j) && this.f10507e == k1Var.f10507e && this.f10508f == k1Var.f10508f && this.f10509g == k1Var.f10509g && this.h == k1Var.h && this.f10510i == k1Var.f10510i && this.f10512k == k1Var.f10512k && this.f10513l == k1Var.f10513l && this.f10514m == k1Var.f10514m && this.f10515n == k1Var.f10515n && this.f10516o == k1Var.f10516o && this.f10517p == k1Var.f10517p) {
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
        int hashCode2 = (this.f10506c.hashCode() + ((this.f10504a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        f0 f0Var = this.f10511j;
        if (f0Var != null) {
            i7 = f0Var.hashCode();
        }
        long j3 = this.f10507e;
        long j10 = this.f10508f;
        long j11 = this.f10509g;
        long j12 = this.f10513l;
        long j13 = this.f10514m;
        long j14 = this.f10517p;
        return ((((((((((((((((((((((i10 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10510i ? 1 : 0)) * 31) + (this.f10512k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f10515n) * 31) + this.f10516o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
