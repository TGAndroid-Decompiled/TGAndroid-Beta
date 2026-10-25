package b2;

import a8.yb;
import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
public final class o1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object f3316q = new Object();
    public static final p0 f3317r;
    public static final String f3318s;
    public static final String f3319t;
    public static final String f3320u;
    public static final String v;
    public static final String f3321w;
    public static final String f3322x;
    public static final String f3323y;
    public static final String f3324z;
    public Object f3326b;
    public Object d;
    public long e;
    public long f3328f;
    public long f3329g;
    public boolean h;
    public boolean f3330i;
    public j0 f3331j;
    public boolean f3332k;
    public long f3333l;
    public long f3334m;
    public int f3335n;
    public int f3336o;
    public long f3337p;
    public Object f3325a = f3316q;
    public p0 f3327c = f3317r;

    static {
        boolean z10;
        k0 k0Var;
        d0 d0Var = new d0();
        g0 g0Var = new g0();
        List list = Collections.EMPTY_LIST;
        f9.s1 s1Var = f9.s1.e;
        i0 i0Var = new i0();
        l0 l0Var = l0.d;
        Uri uri = Uri.EMPTY;
        if (g0Var.f3208b != null && g0Var.f3207a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yb.p(z10);
        h0 h0Var = null;
        if (uri != null) {
            if (g0Var.f3207a != null) {
                h0Var = new h0(g0Var);
            }
            k0Var = new k0(uri, null, h0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            k0Var = null;
        }
        f3317r = new p0("androidx.media3.common.Timeline", new e0(d0Var), k0Var, new j0(i0Var), s0.L, l0Var);
        f3318s = Integer.toString(1, 36);
        f3319t = Integer.toString(2, 36);
        f3320u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f3321w = Integer.toString(5, 36);
        f3322x = Integer.toString(6, 36);
        f3323y = Integer.toString(7, 36);
        f3324z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f3331j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, p0 p0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, j0 j0Var, long j13, long j14, int i10, int i11, long j15) {
        p0 p0Var2;
        this.f3325a = obj;
        if (p0Var != null) {
            p0Var2 = p0Var;
        } else {
            p0Var2 = f3317r;
        }
        this.f3327c = p0Var2;
        if (p0Var != null) {
            k0 k0Var = p0Var.f3345b;
        }
        this.f3326b = null;
        this.d = obj2;
        this.e = j10;
        this.f3328f = j11;
        this.f3329g = j12;
        this.h = z10;
        this.f3330i = z11;
        this.f3331j = j0Var;
        this.f3333l = j13;
        this.f3334m = j14;
        this.f3335n = i10;
        this.f3336o = i11;
        this.f3337p = j15;
        this.f3332k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o1.class.equals(obj.getClass())) {
                o1 o1Var = (o1) obj;
                if (Objects.equals(this.f3325a, o1Var.f3325a) && Objects.equals(this.f3327c, o1Var.f3327c) && Objects.equals(this.d, o1Var.d) && Objects.equals(this.f3331j, o1Var.f3331j) && this.e == o1Var.e && this.f3328f == o1Var.f3328f && this.f3329g == o1Var.f3329g && this.h == o1Var.h && this.f3330i == o1Var.f3330i && this.f3332k == o1Var.f3332k && this.f3333l == o1Var.f3333l && this.f3334m == o1Var.f3334m && this.f3335n == o1Var.f3335n && this.f3336o == o1Var.f3336o && this.f3337p == o1Var.f3337p) {
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
        int hashCode2 = (this.f3327c.hashCode() + ((this.f3325a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        j0 j0Var = this.f3331j;
        if (j0Var != null) {
            i10 = j0Var.hashCode();
        }
        long j10 = this.e;
        long j11 = this.f3328f;
        long j12 = this.f3329g;
        long j13 = this.f3333l;
        long j14 = this.f3334m;
        long j15 = this.f3337p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f3330i ? 1 : 0)) * 31) + (this.f3332k ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f3335n) * 31) + this.f3336o) * 31) + ((int) (j15 ^ (j15 >>> 32)));
    }
}
