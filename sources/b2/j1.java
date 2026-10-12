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
    public static final Object f3368q = new Object();
    public static final k0 f3369r;
    public static final String f3370s;
    public static final String f3371t;
    public static final String f3372u;
    public static final String v;
    public static final String f3373w;
    public static final String f3374x;
    public static final String f3375y;
    public static final String f3376z;
    public Object f3378b;
    public Object d;
    public long f3380e;
    public long f3381f;
    public long f3382g;
    public boolean h;
    public boolean f3383i;
    public e0 f3384j;
    public boolean f3385k;
    public long f3386l;
    public long f3387m;
    public int f3388n;
    public int f3389o;
    public long f3390p;
    public Object f3377a = f3368q;
    public k0 f3379c = f3369r;

    static {
        boolean z10;
        f0 f0Var;
        y yVar = new y();
        b0 b0Var = new b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8712e;
        d0 d0Var = new d0();
        g0 g0Var = g0.d;
        Uri uri = Uri.EMPTY;
        if (b0Var.f3242b != null && b0Var.f3241a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        c0 c0Var = null;
        if (uri != null) {
            if (b0Var.f3241a != null) {
                c0Var = new c0(b0Var);
            }
            f0Var = new f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            f0Var = null;
        }
        f3369r = new k0("androidx.media3.common.Timeline", new z(yVar), f0Var, new e0(d0Var), n0.K, g0Var);
        f3370s = Integer.toString(1, 36);
        f3371t = Integer.toString(2, 36);
        f3372u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f3373w = Integer.toString(5, 36);
        f3374x = Integer.toString(6, 36);
        f3375y = Integer.toString(7, 36);
        f3376z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f3384j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, k0 k0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, e0 e0Var, long j12, long j13, int i10, int i11, long j14) {
        k0 k0Var2;
        this.f3377a = obj;
        if (k0Var != null) {
            k0Var2 = k0Var;
        } else {
            k0Var2 = f3369r;
        }
        this.f3379c = k0Var2;
        if (k0Var != null) {
            f0 f0Var = k0Var.f3398b;
        }
        this.f3378b = null;
        this.d = obj2;
        this.f3380e = j3;
        this.f3381f = j10;
        this.f3382g = j11;
        this.h = z10;
        this.f3383i = z11;
        this.f3384j = e0Var;
        this.f3386l = j12;
        this.f3387m = j13;
        this.f3388n = i10;
        this.f3389o = i11;
        this.f3390p = j14;
        this.f3385k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class.equals(obj.getClass())) {
            j1 j1Var = (j1) obj;
            if (Objects.equals(this.f3377a, j1Var.f3377a) && Objects.equals(this.f3379c, j1Var.f3379c) && Objects.equals(this.d, j1Var.d) && Objects.equals(this.f3384j, j1Var.f3384j) && this.f3380e == j1Var.f3380e && this.f3381f == j1Var.f3381f && this.f3382g == j1Var.f3382g && this.h == j1Var.h && this.f3383i == j1Var.f3383i && this.f3385k == j1Var.f3385k && this.f3386l == j1Var.f3386l && this.f3387m == j1Var.f3387m && this.f3388n == j1Var.f3388n && this.f3389o == j1Var.f3389o && this.f3390p == j1Var.f3390p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3379c.hashCode() + ((this.f3377a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        e0 e0Var = this.f3384j;
        if (e0Var != null) {
            i10 = e0Var.hashCode();
        }
        long j3 = this.f3380e;
        long j10 = this.f3381f;
        long j11 = this.f3382g;
        long j12 = this.f3386l;
        long j13 = this.f3387m;
        long j14 = this.f3390p;
        return ((((((((((((((((((((((i11 + i10) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f3383i ? 1 : 0)) * 31) + (this.f3385k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f3388n) * 31) + this.f3389o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
