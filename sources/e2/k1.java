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
    public static final Object f10469q = new Object();
    public static final l0 f10470r;
    public static final String f10471s;
    public static final String f10472t;
    public static final String f10473u;
    public static final String v;
    public static final String f10474w;
    public static final String f10475x;
    public static final String f10476y;
    public static final String f10477z;
    public Object f10479b;
    public Object d;
    public long f10481e;
    public long f10482f;
    public long f10483g;
    public boolean h;
    public boolean f10484i;
    public f0 f10485j;
    public boolean f10486k;
    public long f10487l;
    public long f10488m;
    public int f10489n;
    public int f10490o;
    public long f10491p;
    public Object f10478a = f10469q;
    public l0 f10480c = f10470r;

    static {
        boolean z10;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14074e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10349b != null && c0Var.f10348a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10348a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        f10470r = new l0("androidx.media3.common.Timeline", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
        f10471s = Integer.toString(1, 36);
        f10472t = Integer.toString(2, 36);
        f10473u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f10474w = Integer.toString(5, 36);
        f10475x = Integer.toString(6, 36);
        f10476y = Integer.toString(7, 36);
        f10477z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f10485j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, l0 l0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, f0 f0Var, long j12, long j13, int i7, int i10, long j14) {
        l0 l0Var2;
        this.f10478a = obj;
        if (l0Var != null) {
            l0Var2 = l0Var;
        } else {
            l0Var2 = f10470r;
        }
        this.f10480c = l0Var2;
        if (l0Var != null) {
            g0 g0Var = l0Var.f10504b;
        }
        this.f10479b = null;
        this.d = obj2;
        this.f10481e = j3;
        this.f10482f = j10;
        this.f10483g = j11;
        this.h = z10;
        this.f10484i = z11;
        this.f10485j = f0Var;
        this.f10487l = j12;
        this.f10488m = j13;
        this.f10489n = i7;
        this.f10490o = i10;
        this.f10491p = j14;
        this.f10486k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class.equals(obj.getClass())) {
                k1 k1Var = (k1) obj;
                if (Objects.equals(this.f10478a, k1Var.f10478a) && Objects.equals(this.f10480c, k1Var.f10480c) && Objects.equals(this.d, k1Var.d) && Objects.equals(this.f10485j, k1Var.f10485j) && this.f10481e == k1Var.f10481e && this.f10482f == k1Var.f10482f && this.f10483g == k1Var.f10483g && this.h == k1Var.h && this.f10484i == k1Var.f10484i && this.f10486k == k1Var.f10486k && this.f10487l == k1Var.f10487l && this.f10488m == k1Var.f10488m && this.f10489n == k1Var.f10489n && this.f10490o == k1Var.f10490o && this.f10491p == k1Var.f10491p) {
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
        int hashCode2 = (this.f10480c.hashCode() + ((this.f10478a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        f0 f0Var = this.f10485j;
        if (f0Var != null) {
            i7 = f0Var.hashCode();
        }
        long j3 = this.f10481e;
        long j10 = this.f10482f;
        long j11 = this.f10483g;
        long j12 = this.f10487l;
        long j13 = this.f10488m;
        long j14 = this.f10491p;
        return ((((((((((((((((((((((i10 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10484i ? 1 : 0)) * 31) + (this.f10486k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f10489n) * 31) + this.f10490o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
