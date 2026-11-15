package e2;

import a8.ja;
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
    public static final Object f10151q = new Object();
    public static final l0 f10152r;
    public static final String f10153s;
    public static final String f10154t;
    public static final String f10155u;
    public static final String v;
    public static final String f10156w;
    public static final String f10157x;
    public static final String f10158y;
    public static final String f10159z;
    public Object f10161b;
    public Object d;
    public long f10163e;
    public long f10164f;
    public long f10165g;
    public boolean h;
    public boolean f10166i;
    public f0 f10167j;
    public boolean f10168k;
    public long f10169l;
    public long f10170m;
    public int f10171n;
    public int f10172o;
    public long f10173p;
    public Object f10160a = f10151q;
    public l0 f10162c = f10152r;

    static {
        boolean z10;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.s1 s1Var = h9.s1.f13749e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        Uri uri = Uri.EMPTY;
        if (c0Var.f10031b != null && c0Var.f10030a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ja.p(z10);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10030a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        f10152r = new l0("androidx.media3.common.Timeline", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
        f10153s = Integer.toString(1, 36);
        f10154t = Integer.toString(2, 36);
        f10155u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f10156w = Integer.toString(5, 36);
        f10157x = Integer.toString(6, 36);
        f10158y = Integer.toString(7, 36);
        f10159z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f10167j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, l0 l0Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, f0 f0Var, long j12, long j13, int i7, int i10, long j14) {
        l0 l0Var2;
        this.f10160a = obj;
        if (l0Var != null) {
            l0Var2 = l0Var;
        } else {
            l0Var2 = f10152r;
        }
        this.f10162c = l0Var2;
        if (l0Var != null) {
            g0 g0Var = l0Var.f10186b;
        }
        this.f10161b = null;
        this.d = obj2;
        this.f10163e = j3;
        this.f10164f = j10;
        this.f10165g = j11;
        this.h = z10;
        this.f10166i = z11;
        this.f10167j = f0Var;
        this.f10169l = j12;
        this.f10170m = j13;
        this.f10171n = i7;
        this.f10172o = i10;
        this.f10173p = j14;
        this.f10168k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class.equals(obj.getClass())) {
                k1 k1Var = (k1) obj;
                if (Objects.equals(this.f10160a, k1Var.f10160a) && Objects.equals(this.f10162c, k1Var.f10162c) && Objects.equals(this.d, k1Var.d) && Objects.equals(this.f10167j, k1Var.f10167j) && this.f10163e == k1Var.f10163e && this.f10164f == k1Var.f10164f && this.f10165g == k1Var.f10165g && this.h == k1Var.h && this.f10166i == k1Var.f10166i && this.f10168k == k1Var.f10168k && this.f10169l == k1Var.f10169l && this.f10170m == k1Var.f10170m && this.f10171n == k1Var.f10171n && this.f10172o == k1Var.f10172o && this.f10173p == k1Var.f10173p) {
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
        int hashCode2 = (this.f10162c.hashCode() + ((this.f10160a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        f0 f0Var = this.f10167j;
        if (f0Var != null) {
            i7 = f0Var.hashCode();
        }
        long j3 = this.f10163e;
        long j10 = this.f10164f;
        long j11 = this.f10165g;
        long j12 = this.f10169l;
        long j13 = this.f10170m;
        long j14 = this.f10173p;
        return ((((((((((((((((((((((i10 + i7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f10166i ? 1 : 0)) * 31) + (this.f10168k ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f10171n) * 31) + this.f10172o) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
