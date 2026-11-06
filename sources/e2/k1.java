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
    public static final Object f10315q = new Object();
    public static final l0 f10316r;
    public static final String f10317s;
    public static final String f10318t;
    public static final String f10319u;
    public static final String v;
    public static final String f10320w;
    public static final String f10321x;
    public static final String f10322y;
    public static final String f10323z;
    public Object f10325b;
    public Object d;
    public long f10327e;
    public long f10328f;
    public long f10329g;
    public boolean h;
    public boolean f10330i;
    public f0 f10331j;
    public boolean f10332k;
    public long f10333l;
    public long f10334m;
    public int f10335n;
    public int f10336o;
    public long f10337p;
    public Object f10324a = f10315q;
    public l0 f10326c = f10316r;

    static {
        boolean z9;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14397e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10195b != null && c0Var.f10194a == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.p(z9);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10194a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        f10316r = new l0("androidx.media3.common.Timeline", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
        f10317s = Integer.toString(1, 36);
        f10318t = Integer.toString(2, 36);
        f10319u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f10320w = Integer.toString(5, 36);
        f10321x = Integer.toString(6, 36);
        f10322y = Integer.toString(7, 36);
        f10323z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f10331j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, l0 l0Var, Object obj2, long j3, long j10, long j11, boolean z9, boolean z10, f0 f0Var, long j12, long j13, int i7, int i10, long j14) {
        l0 l0Var2;
        this.f10324a = obj;
        if (l0Var != null) {
            l0Var2 = l0Var;
        } else {
            l0Var2 = f10316r;
        }
        this.f10326c = l0Var2;
        if (l0Var != null) {
            g0 g0Var = l0Var.f10350b;
        }
        this.f10325b = null;
        this.d = obj2;
        this.f10327e = j3;
        this.f10328f = j10;
        this.f10329g = j11;
        this.h = z9;
        this.f10330i = z10;
        this.f10331j = f0Var;
        this.f10333l = j12;
        this.f10334m = j13;
        this.f10335n = i7;
        this.f10336o = i10;
        this.f10337p = j14;
        this.f10332k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class.equals(obj.getClass())) {
                k1 k1Var = (k1) obj;
                if (Objects.equals(this.f10324a, k1Var.f10324a) && Objects.equals(this.f10326c, k1Var.f10326c) && Objects.equals(this.d, k1Var.d) && Objects.equals(this.f10331j, k1Var.f10331j) && this.f10327e == k1Var.f10327e && this.f10328f == k1Var.f10328f && this.f10329g == k1Var.f10329g && this.h == k1Var.h && this.f10330i == k1Var.f10330i && this.f10332k == k1Var.f10332k && this.f10333l == k1Var.f10333l && this.f10334m == k1Var.f10334m && this.f10335n == k1Var.f10335n && this.f10336o == k1Var.f10336o && this.f10337p == k1Var.f10337p) {
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
        int hashCode2 = (this.f10326c.hashCode() + ((this.f10324a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        f0 f0Var = this.f10331j;
        if (f0Var != null) {
            i7 = f0Var.hashCode();
        }
        long j3 = this.f10327e;
        long j10 = this.f10328f;
        long j11 = this.f10329g;
        long j12 = this.f10333l;
        long j13 = this.f10334m;
        long j14 = this.f10337p;
        return ((((((((((((((((((((((i10 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10330i ? 1 : 0)) * 31) + (this.f10332k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f10335n) * 31) + this.f10336o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
