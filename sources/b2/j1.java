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
    public static final Object f3044q = new Object();
    public static final k0 f3045r;
    public static final String f3046s;
    public static final String f3047t;
    public static final String f3048u;
    public static final String v;
    public static final String f3049w;
    public static final String f3050x;
    public static final String f3051y;
    public static final String f3052z;
    public Object f3054b;
    public Object d;
    public long e;
    public long f3056f;
    public long f3057g;
    public boolean h;
    public boolean f3058i;
    public e0 f3059j;
    public boolean f3060k;
    public long f3061l;
    public long f3062m;
    public int f3063n;
    public int f3064o;
    public long f3065p;
    public Object f3053a = f3044q;
    public k0 f3055c = f3045r;

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
        if (b0Var.f2934b != null && b0Var.f2933a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        c0 c0Var = null;
        if (uri != null) {
            if (b0Var.f2933a != null) {
                c0Var = new c0(b0Var);
            }
            f0Var = new f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        f3045r = new k0("androidx.media3.common.Timeline", new z(yVar), f0Var, new e0(d0Var), n0.K, g0Var);
        f3046s = Integer.toString(1, 36);
        f3047t = Integer.toString(2, 36);
        f3048u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f3049w = Integer.toString(5, 36);
        f3050x = Integer.toString(6, 36);
        f3051y = Integer.toString(7, 36);
        f3052z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f3059j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, k0 k0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, e0 e0Var, long j12, long j13, int i10, int i11, long j14) {
        k0 k0Var2;
        this.f3053a = obj;
        if (k0Var != null) {
            k0Var2 = k0Var;
        } else {
            k0Var2 = f3045r;
        }
        this.f3055c = k0Var2;
        if (k0Var != null) {
            f0 f0Var = k0Var.f3073b;
        }
        this.f3054b = null;
        this.d = obj2;
        this.e = j3;
        this.f3056f = j10;
        this.f3057g = j11;
        this.h = z10;
        this.f3058i = z11;
        this.f3059j = e0Var;
        this.f3061l = j12;
        this.f3062m = j13;
        this.f3063n = i10;
        this.f3064o = i11;
        this.f3065p = j14;
        this.f3060k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class.equals(obj.getClass())) {
            j1 j1Var = (j1) obj;
            if (Objects.equals(this.f3053a, j1Var.f3053a) && Objects.equals(this.f3055c, j1Var.f3055c) && Objects.equals(this.d, j1Var.d) && Objects.equals(this.f3059j, j1Var.f3059j) && this.e == j1Var.e && this.f3056f == j1Var.f3056f && this.f3057g == j1Var.f3057g && this.h == j1Var.h && this.f3058i == j1Var.f3058i && this.f3060k == j1Var.f3060k && this.f3061l == j1Var.f3061l && this.f3062m == j1Var.f3062m && this.f3063n == j1Var.f3063n && this.f3064o == j1Var.f3064o && this.f3065p == j1Var.f3065p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3055c.hashCode() + ((this.f3053a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        e0 e0Var = this.f3059j;
        if (e0Var != null) {
            i10 = e0Var.hashCode();
        }
        long j3 = this.e;
        long j10 = this.f3056f;
        long j11 = this.f3057g;
        long j12 = this.f3061l;
        long j13 = this.f3062m;
        long j14 = this.f3065p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f3058i ? 1 : 0)) * 31) + (this.f3060k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f3063n) * 31) + this.f3064o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
