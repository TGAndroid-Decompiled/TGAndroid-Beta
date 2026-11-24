package defpackage;
public class rq6 {
    public static final rq6 i = new rq6(new qq6());
    public static final String j = "0";
    public static final String k = "1";
    public static final String l = "2";
    public static final String m = "3";
    public static final String n = "4";
    public static final String o = "5";
    public static final String p = "6";
    public static final String q = "7";
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public rq6(qq6 qq6Var) {
        this.a = g8c.i0(qq6Var.a);
        this.c = g8c.i0(qq6Var.b);
        this.b = qq6Var.a;
        this.d = qq6Var.b;
        this.e = qq6Var.c;
        this.f = qq6Var.d;
        this.g = qq6Var.e;
        this.h = qq6Var.f;
    }

    public final qq6 a() {
        ?? obj = new Object();
        obj.a = this.b;
        obj.b = this.d;
        obj.c = this.e;
        obj.d = this.f;
        obj.e = this.g;
        obj.f = this.h;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq6)) {
            return false;
        }
        rq6 rq6Var = (rq6) obj;
        if (this.b == rq6Var.b && this.d == rq6Var.d && this.e == rq6Var.e && this.f == rq6Var.f && this.g == rq6Var.g && this.h == rq6Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.b;
        long j3 = this.d;
        return (((((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
