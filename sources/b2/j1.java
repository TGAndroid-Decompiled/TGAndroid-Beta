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
    public static final Object f3043q = new Object();
    public static final k0 f3044r;
    public static final String f3045s;
    public static final String f3046t;
    public static final String f3047u;
    public static final String v;
    public static final String f3048w;
    public static final String f3049x;
    public static final String f3050y;
    public static final String f3051z;
    public Object f3053b;
    public Object d;
    public long e;
    public long f3055f;
    public long f3056g;
    public boolean h;
    public boolean f3057i;
    public e0 f3058j;
    public boolean f3059k;
    public long f3060l;
    public long f3061m;
    public int f3062n;
    public int f3063o;
    public long f3064p;
    public Object f3052a = f3043q;
    public k0 f3054c = f3044r;

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
        if (b0Var.f2933b != null && b0Var.f2932a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        c0 c0Var = null;
        if (uri != null) {
            if (b0Var.f2932a != null) {
                c0Var = new c0(b0Var);
            }
            f0Var = new f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        f3044r = new k0("androidx.media3.common.Timeline", new z(yVar), f0Var, new e0(d0Var), n0.K, g0Var);
        f3045s = Integer.toString(1, 36);
        f3046t = Integer.toString(2, 36);
        f3047u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f3048w = Integer.toString(5, 36);
        f3049x = Integer.toString(6, 36);
        f3050y = Integer.toString(7, 36);
        f3051z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f3058j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, k0 k0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, e0 e0Var, long j12, long j13, int i10, int i11, long j14) {
        k0 k0Var2;
        this.f3052a = obj;
        if (k0Var != null) {
            k0Var2 = k0Var;
        } else {
            k0Var2 = f3044r;
        }
        this.f3054c = k0Var2;
        if (k0Var != null) {
            f0 f0Var = k0Var.f3072b;
        }
        this.f3053b = null;
        this.d = obj2;
        this.e = j3;
        this.f3055f = j10;
        this.f3056g = j11;
        this.h = z10;
        this.f3057i = z11;
        this.f3058j = e0Var;
        this.f3060l = j12;
        this.f3061m = j13;
        this.f3062n = i10;
        this.f3063o = i11;
        this.f3064p = j14;
        this.f3059k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class.equals(obj.getClass())) {
            j1 j1Var = (j1) obj;
            if (Objects.equals(this.f3052a, j1Var.f3052a) && Objects.equals(this.f3054c, j1Var.f3054c) && Objects.equals(this.d, j1Var.d) && Objects.equals(this.f3058j, j1Var.f3058j) && this.e == j1Var.e && this.f3055f == j1Var.f3055f && this.f3056g == j1Var.f3056g && this.h == j1Var.h && this.f3057i == j1Var.f3057i && this.f3059k == j1Var.f3059k && this.f3060l == j1Var.f3060l && this.f3061m == j1Var.f3061m && this.f3062n == j1Var.f3062n && this.f3063o == j1Var.f3063o && this.f3064p == j1Var.f3064p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3054c.hashCode() + ((this.f3052a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        e0 e0Var = this.f3058j;
        if (e0Var != null) {
            i10 = e0Var.hashCode();
        }
        long j3 = this.e;
        long j10 = this.f3055f;
        long j11 = this.f3056g;
        long j12 = this.f3060l;
        long j13 = this.f3061m;
        long j14 = this.f3064p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f3057i ? 1 : 0)) * 31) + (this.f3059k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f3062n) * 31) + this.f3063o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
