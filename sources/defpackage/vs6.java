package defpackage;
public class vs6 {
    public static final vs6 i = new vs6(new us6());
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

    public vs6(us6 us6Var) {
        this.a = gcc.i0(us6Var.a);
        this.c = gcc.i0(us6Var.b);
        this.b = us6Var.a;
        this.d = us6Var.b;
        this.e = us6Var.c;
        this.f = us6Var.d;
        this.g = us6Var.e;
        this.h = us6Var.f;
    }

    public final us6 a() {
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
        if (!(obj instanceof vs6)) {
            return false;
        }
        vs6 vs6Var = (vs6) obj;
        if (this.b == vs6Var.b && this.d == vs6Var.d && this.e == vs6Var.e && this.f == vs6Var.f && this.g == vs6Var.g && this.h == vs6Var.h) {
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
