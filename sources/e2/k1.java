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
    public static final Object f10466q = new Object();
    public static final l0 f10467r;
    public static final String f10468s;
    public static final String f10469t;
    public static final String f10470u;
    public static final String v;
    public static final String f10471w;
    public static final String f10472x;
    public static final String f10473y;
    public static final String f10474z;
    public Object f10476b;
    public Object d;
    public long f10478e;
    public long f10479f;
    public long f10480g;
    public boolean h;
    public boolean f10481i;
    public f0 f10482j;
    public boolean f10483k;
    public long f10484l;
    public long f10485m;
    public int f10486n;
    public int f10487o;
    public long f10488p;
    public Object f10475a = f10466q;
    public l0 f10477c = f10467r;

    static {
        boolean z10;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14071e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10346b != null && c0Var.f10345a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10345a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        f10467r = new l0("androidx.media3.common.Timeline", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
        f10468s = Integer.toString(1, 36);
        f10469t = Integer.toString(2, 36);
        f10470u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f10471w = Integer.toString(5, 36);
        f10472x = Integer.toString(6, 36);
        f10473y = Integer.toString(7, 36);
        f10474z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f10482j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, l0 l0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, f0 f0Var, long j12, long j13, int i7, int i10, long j14) {
        l0 l0Var2;
        this.f10475a = obj;
        if (l0Var != null) {
            l0Var2 = l0Var;
        } else {
            l0Var2 = f10467r;
        }
        this.f10477c = l0Var2;
        if (l0Var != null) {
            g0 g0Var = l0Var.f10501b;
        }
        this.f10476b = null;
        this.d = obj2;
        this.f10478e = j3;
        this.f10479f = j10;
        this.f10480g = j11;
        this.h = z10;
        this.f10481i = z11;
        this.f10482j = f0Var;
        this.f10484l = j12;
        this.f10485m = j13;
        this.f10486n = i7;
        this.f10487o = i10;
        this.f10488p = j14;
        this.f10483k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class.equals(obj.getClass())) {
                k1 k1Var = (k1) obj;
                if (Objects.equals(this.f10475a, k1Var.f10475a) && Objects.equals(this.f10477c, k1Var.f10477c) && Objects.equals(this.d, k1Var.d) && Objects.equals(this.f10482j, k1Var.f10482j) && this.f10478e == k1Var.f10478e && this.f10479f == k1Var.f10479f && this.f10480g == k1Var.f10480g && this.h == k1Var.h && this.f10481i == k1Var.f10481i && this.f10483k == k1Var.f10483k && this.f10484l == k1Var.f10484l && this.f10485m == k1Var.f10485m && this.f10486n == k1Var.f10486n && this.f10487o == k1Var.f10487o && this.f10488p == k1Var.f10488p) {
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
        int hashCode2 = (this.f10477c.hashCode() + ((this.f10475a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        f0 f0Var = this.f10482j;
        if (f0Var != null) {
            i7 = f0Var.hashCode();
        }
        long j3 = this.f10478e;
        long j10 = this.f10479f;
        long j11 = this.f10480g;
        long j12 = this.f10484l;
        long j13 = this.f10485m;
        long j14 = this.f10488p;
        return ((((((((((((((((((((((i10 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10481i ? 1 : 0)) * 31) + (this.f10483k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f10486n) * 31) + this.f10487o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
