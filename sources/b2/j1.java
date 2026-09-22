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
    public static final Object f3046q = new Object();
    public static final k0 f3047r;
    public static final String f3048s;
    public static final String f3049t;
    public static final String f3050u;
    public static final String v;
    public static final String f3051w;
    public static final String f3052x;
    public static final String f3053y;
    public static final String f3054z;
    public Object f3056b;
    public Object d;
    public long e;
    public long f3058f;
    public long f3059g;
    public boolean h;
    public boolean f3060i;
    public e0 f3061j;
    public boolean f3062k;
    public long f3063l;
    public long f3064m;
    public int f3065n;
    public int f3066o;
    public long f3067p;
    public Object f3055a = f3046q;
    public k0 f3057c = f3047r;

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
        if (b0Var.f2936b != null && b0Var.f2935a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        c0 c0Var = null;
        if (uri != null) {
            if (b0Var.f2935a != null) {
                c0Var = new c0(b0Var);
            }
            f0Var = new f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        f3047r = new k0("androidx.media3.common.Timeline", new z(yVar), f0Var, new e0(d0Var), n0.K, g0Var);
        f3048s = Integer.toString(1, 36);
        f3049t = Integer.toString(2, 36);
        f3050u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f3051w = Integer.toString(5, 36);
        f3052x = Integer.toString(6, 36);
        f3053y = Integer.toString(7, 36);
        f3054z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f3061j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, k0 k0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, e0 e0Var, long j12, long j13, int i10, int i11, long j14) {
        k0 k0Var2;
        this.f3055a = obj;
        if (k0Var != null) {
            k0Var2 = k0Var;
        } else {
            k0Var2 = f3047r;
        }
        this.f3057c = k0Var2;
        if (k0Var != null) {
            f0 f0Var = k0Var.f3075b;
        }
        this.f3056b = null;
        this.d = obj2;
        this.e = j3;
        this.f3058f = j10;
        this.f3059g = j11;
        this.h = z10;
        this.f3060i = z11;
        this.f3061j = e0Var;
        this.f3063l = j12;
        this.f3064m = j13;
        this.f3065n = i10;
        this.f3066o = i11;
        this.f3067p = j14;
        this.f3062k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class.equals(obj.getClass())) {
            j1 j1Var = (j1) obj;
            if (Objects.equals(this.f3055a, j1Var.f3055a) && Objects.equals(this.f3057c, j1Var.f3057c) && Objects.equals(this.d, j1Var.d) && Objects.equals(this.f3061j, j1Var.f3061j) && this.e == j1Var.e && this.f3058f == j1Var.f3058f && this.f3059g == j1Var.f3059g && this.h == j1Var.h && this.f3060i == j1Var.f3060i && this.f3062k == j1Var.f3062k && this.f3063l == j1Var.f3063l && this.f3064m == j1Var.f3064m && this.f3065n == j1Var.f3065n && this.f3066o == j1Var.f3066o && this.f3067p == j1Var.f3067p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3057c.hashCode() + ((this.f3055a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        e0 e0Var = this.f3061j;
        if (e0Var != null) {
            i10 = e0Var.hashCode();
        }
        long j3 = this.e;
        long j10 = this.f3058f;
        long j11 = this.f3059g;
        long j12 = this.f3063l;
        long j13 = this.f3064m;
        long j14 = this.f3067p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f3060i ? 1 : 0)) * 31) + (this.f3062k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f3065n) * 31) + this.f3066o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
