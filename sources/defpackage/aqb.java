package defpackage;

import android.net.Uri;
import j$.util.Objects;
public final class aqb {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final Object p = new Object();
    public static final bt6 q;
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
    public bt6 b = q;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public ws6 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        ps6 ps6Var = new ps6();
        ps6Var.a = "androidx.media3.common.Timeline";
        ps6Var.b = Uri.EMPTY;
        q = ps6Var.a();
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

    public final void b(Object obj, bt6 bt6Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, ws6 ws6Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        if (bt6Var == null) {
            bt6Var = q;
        }
        this.b = bt6Var;
        this.c = obj2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z2;
        this.h = z3;
        this.i = ws6Var;
        this.k = j4;
        this.l = j5;
        this.m = i;
        this.n = i2;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && aqb.class.equals(obj.getClass())) {
                aqb aqbVar = (aqb) obj;
                if (Objects.equals(this.a, aqbVar.a) && Objects.equals(this.b, aqbVar.b) && Objects.equals(this.c, aqbVar.c) && Objects.equals(this.i, aqbVar.i) && this.d == aqbVar.d && this.e == aqbVar.e && this.f == aqbVar.f && this.g == aqbVar.g && this.h == aqbVar.h && this.j == aqbVar.j && this.k == aqbVar.k && this.l == aqbVar.l && this.m == aqbVar.m && this.n == aqbVar.n && this.o == aqbVar.o) {
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
        ws6 ws6Var = this.i;
        if (ws6Var != null) {
            i = ws6Var.hashCode();
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
