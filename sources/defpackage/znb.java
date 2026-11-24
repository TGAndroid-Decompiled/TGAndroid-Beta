package defpackage;

import android.net.Uri;
import j$.util.Objects;
public final class znb {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object p = new Object();
    public static final br6 q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object a = p;
    public br6 b = q;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public wq6 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        pq6 pq6Var = new pq6();
        pq6Var.a = "androidx.media3.common.Timeline";
        pq6Var.b = Uri.EMPTY;
        q = pq6Var.a();
        r = "1";
        s = "2";
        t = "3";
        u = "4";
        v = "5";
        w = "6";
        x = "7";
        y = "8";
        z = "9";
        A = "a";
        B = "b";
        C = "c";
        D = "d";
        E = "e";
    }

    public final boolean a() {
        if (this.i != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, br6 br6Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, wq6 wq6Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        if (br6Var == null) {
            br6Var = q;
        }
        this.b = br6Var;
        this.c = obj2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z2;
        this.h = z3;
        this.i = wq6Var;
        this.k = j4;
        this.l = j5;
        this.m = i;
        this.n = i2;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && znb.class.equals(obj.getClass())) {
                znb znbVar = (znb) obj;
                if (Objects.equals(this.a, znbVar.a) && Objects.equals(this.b, znbVar.b) && Objects.equals(this.c, znbVar.c) && Objects.equals(this.i, znbVar.i) && this.d == znbVar.d && this.e == znbVar.e && this.f == znbVar.f && this.g == znbVar.g && this.h == znbVar.h && this.j == znbVar.j && this.k == znbVar.k && this.l == znbVar.l && this.m == znbVar.m && this.n == znbVar.n && this.o == znbVar.o) {
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
        int hashCode2 = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.c;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        wq6 wq6Var = this.i;
        if (wq6Var != null) {
            i = wq6Var.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.k;
        long j5 = this.l;
        long j6 = this.o;
        return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }
}
