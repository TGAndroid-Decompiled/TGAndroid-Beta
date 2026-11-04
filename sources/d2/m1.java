package d2;

import android.net.Uri;
import b8.zb;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
public final class m1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object f8199q = new Object();
    public static final n0 f8200r;
    public static final String f8201s;
    public static final String f8202t;
    public static final String f8203u;
    public static final String v;
    public static final String f8204w;
    public static final String f8205x;
    public static final String f8206y;
    public static final String f8207z;
    public Object f8209b;
    public Object d;
    public long f8211e;
    public long f8212f;
    public long f8213g;
    public boolean h;
    public boolean f8214i;
    public h0 f8215j;
    public boolean f8216k;
    public long f8217l;
    public long f8218m;
    public int f8219n;
    public int f8220o;
    public long f8221p;
    public Object f8208a = f8199q;
    public n0 f8210c = f8200r;

    static {
        boolean z10;
        i0 i0Var;
        b0 b0Var = new b0();
        e0 e0Var = new e0();
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var = g9.s1.f12146e;
        g0 g0Var = new g0();
        j0 j0Var = j0.d;
        Uri uri = Uri.EMPTY;
        if (e0Var.f8074b != null && e0Var.f8073a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.p(z10);
        f0 f0Var = null;
        if (uri != null) {
            if (e0Var.f8073a != null) {
                f0Var = new f0(e0Var);
            }
            i0Var = new i0(uri, null, f0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            i0Var = null;
        }
        f8200r = new n0("androidx.media3.common.Timeline", new c0(b0Var), i0Var, new h0(g0Var), q0.L, j0Var);
        f8201s = Integer.toString(1, 36);
        f8202t = Integer.toString(2, 36);
        f8203u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        f8204w = Integer.toString(5, 36);
        f8205x = Integer.toString(6, 36);
        f8206y = Integer.toString(7, 36);
        f8207z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
    }

    public final boolean a() {
        if (this.f8215j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, n0 n0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, h0 h0Var, long j13, long j14, int i3, int i10, long j15) {
        n0 n0Var2;
        this.f8208a = obj;
        if (n0Var != null) {
            n0Var2 = n0Var;
        } else {
            n0Var2 = f8200r;
        }
        this.f8210c = n0Var2;
        if (n0Var != null) {
            i0 i0Var = n0Var.f8241b;
        }
        this.f8209b = null;
        this.d = obj2;
        this.f8211e = j10;
        this.f8212f = j11;
        this.f8213g = j12;
        this.h = z10;
        this.f8214i = z11;
        this.f8215j = h0Var;
        this.f8217l = j13;
        this.f8218m = j14;
        this.f8219n = i3;
        this.f8220o = i10;
        this.f8221p = j15;
        this.f8216k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m1.class.equals(obj.getClass())) {
                m1 m1Var = (m1) obj;
                if (Objects.equals(this.f8208a, m1Var.f8208a) && Objects.equals(this.f8210c, m1Var.f8210c) && Objects.equals(this.d, m1Var.d) && Objects.equals(this.f8215j, m1Var.f8215j) && this.f8211e == m1Var.f8211e && this.f8212f == m1Var.f8212f && this.f8213g == m1Var.f8213g && this.h == m1Var.h && this.f8214i == m1Var.f8214i && this.f8216k == m1Var.f8216k && this.f8217l == m1Var.f8217l && this.f8218m == m1Var.f8218m && this.f8219n == m1Var.f8219n && this.f8220o == m1Var.f8220o && this.f8221p == m1Var.f8221p) {
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
        int hashCode2 = (this.f8210c.hashCode() + ((this.f8208a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i3 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        h0 h0Var = this.f8215j;
        if (h0Var != null) {
            i3 = h0Var.hashCode();
        }
        long j10 = this.f8211e;
        long j11 = this.f8212f;
        long j12 = this.f8213g;
        long j13 = this.f8217l;
        long j14 = this.f8218m;
        long j15 = this.f8221p;
        return ((((((((((((((((((((((i10 + i3) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.f8214i ? 1 : 0)) * 31) + (this.f8216k ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f8219n) * 31) + this.f8220o) * 31) + ((int) (j15 ^ (j15 >>> 32)));
    }
}
