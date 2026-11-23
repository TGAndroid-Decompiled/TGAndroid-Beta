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
    public static final Object f10459q = new Object();
    public static final l0 f10460r;
    public static final String f10461s;
    public static final String f10462t;
    public static final String f10463u;
    public static final String v;
    public static final String f10464w;
    public static final String f10465x;
    public static final String f10466y;
    public static final String f10467z;
    public Object f10469b;
    public Object d;
    public long f10471e;
    public long f10472f;
    public long f10473g;
    public boolean h;
    public boolean f10474i;
    public f0 f10475j;
    public boolean f10476k;
    public long f10477l;
    public long f10478m;
    public int f10479n;
    public int f10480o;
    public long f10481p;
    public Object f10468a = f10459q;
    public l0 f10470c = f10460r;

    static {
        boolean z10;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.s1 s1Var = h9.s1.f14058e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10339b != null && c0Var.f10338a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.p(z10);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10338a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        f10460r = new l0("androidx.media3.common.Timeline", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
        f10461s = Integer.toString(1, 36);
        f10462t = Integer.toString(2, 36);
        f10463u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f10464w = Integer.toString(5, 36);
        f10465x = Integer.toString(6, 36);
        f10466y = Integer.toString(7, 36);
        f10467z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f10475j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, l0 l0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, f0 f0Var, long j12, long j13, int i7, int i10, long j14) {
        l0 l0Var2;
        this.f10468a = obj;
        if (l0Var != null) {
            l0Var2 = l0Var;
        } else {
            l0Var2 = f10460r;
        }
        this.f10470c = l0Var2;
        if (l0Var != null) {
            g0 g0Var = l0Var.f10494b;
        }
        this.f10469b = null;
        this.d = obj2;
        this.f10471e = j3;
        this.f10472f = j10;
        this.f10473g = j11;
        this.h = z10;
        this.f10474i = z11;
        this.f10475j = f0Var;
        this.f10477l = j12;
        this.f10478m = j13;
        this.f10479n = i7;
        this.f10480o = i10;
        this.f10481p = j14;
        this.f10476k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class.equals(obj.getClass())) {
                k1 k1Var = (k1) obj;
                if (Objects.equals(this.f10468a, k1Var.f10468a) && Objects.equals(this.f10470c, k1Var.f10470c) && Objects.equals(this.d, k1Var.d) && Objects.equals(this.f10475j, k1Var.f10475j) && this.f10471e == k1Var.f10471e && this.f10472f == k1Var.f10472f && this.f10473g == k1Var.f10473g && this.h == k1Var.h && this.f10474i == k1Var.f10474i && this.f10476k == k1Var.f10476k && this.f10477l == k1Var.f10477l && this.f10478m == k1Var.f10478m && this.f10479n == k1Var.f10479n && this.f10480o == k1Var.f10480o && this.f10481p == k1Var.f10481p) {
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
        int hashCode2 = (this.f10470c.hashCode() + ((this.f10468a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        f0 f0Var = this.f10475j;
        if (f0Var != null) {
            i7 = f0Var.hashCode();
        }
        long j3 = this.f10471e;
        long j10 = this.f10472f;
        long j11 = this.f10473g;
        long j12 = this.f10477l;
        long j13 = this.f10478m;
        long j14 = this.f10481p;
        return ((((((((((((((((((((((i10 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10474i ? 1 : 0)) * 31) + (this.f10476k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f10479n) * 31) + this.f10480o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
