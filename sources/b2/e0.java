package b2;
public class e0 {
    public static final e0 f2000i = new e0(new d0());
    public static final String f2001j = Integer.toString(0, 36);
    public static final String f2002k = Integer.toString(1, 36);
    public static final String f2003l = Integer.toString(2, 36);
    public static final String f2004m = Integer.toString(3, 36);
    public static final String f2005n = Integer.toString(4, 36);
    public static final String f2006o = Integer.toString(5, 36);
    public static final String f2007p = Integer.toString(6, 36);
    public static final String f2008q = Integer.toString(7, 36);
    public final long f2009a;
    public final long f2010b;
    public final long f2011c;
    public final long d;
    public final boolean e;
    public final boolean f2012f;
    public final boolean f2013g;
    public final boolean h;

    public e0(d0 d0Var) {
        this.f2009a = e2.l0.h0(d0Var.f1996a);
        this.f2011c = e2.l0.h0(d0Var.f1997b);
        this.f2010b = d0Var.f1996a;
        this.d = d0Var.f1997b;
        this.e = d0Var.f1998c;
        this.f2012f = d0Var.d;
        this.f2013g = d0Var.e;
        this.h = d0Var.f1999f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f2010b == e0Var.f2010b && this.d == e0Var.d && this.e == e0Var.e && this.f2012f == e0Var.f2012f && this.f2013g == e0Var.f2013g && this.h == e0Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f2010b;
        long j11 = this.d;
        return (((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f2012f ? 1 : 0)) * 31) + (this.f2013g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
