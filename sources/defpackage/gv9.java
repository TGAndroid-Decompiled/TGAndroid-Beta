package defpackage;
public final class gv9 {
    public static final gv9 c;
    public static final gv9 d;
    public static final gv9 e;
    public static final gv9 f;
    public final long a;
    public final long b;

    static {
        gv9 gv9Var = new gv9(0L, 0L);
        c = gv9Var;
        d = new gv9(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new gv9(Long.MAX_VALUE, 0L);
        new gv9(0L, Long.MAX_VALUE);
        f = gv9Var;
    }

    public gv9(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        gre.f(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final long a(long j, long j2, long j3) {
        boolean z;
        boolean z2;
        long j4;
        boolean z3;
        long j5 = this.a;
        int i = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
        long j6 = this.b;
        if (i == 0 && j6 == 0) {
            return j;
        }
        String str = g8c.a;
        long j7 = j - j5;
        int i2 = ((j5 ^ j) > 0L ? 1 : ((j5 ^ j) == 0L ? 0 : -1));
        boolean z4 = true;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j7) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            j4 = j7;
        } else {
            j4 = ((j7 >>> 63) ^ 1) + Long.MAX_VALUE;
        }
        if ((j4 == Long.MIN_VALUE && j7 != Long.MIN_VALUE) || (j4 == Long.MAX_VALUE && j7 != Long.MAX_VALUE)) {
            j4 = Long.MIN_VALUE;
        }
        long a = g8c.a(j, j6);
        if (j4 <= j2 && j2 <= a) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (j4 > j3 || j3 > a) {
            z4 = false;
        }
        if (z3) {
            if (!z4 || Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
        } else if (!z4) {
            return j4;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gv9.class == obj.getClass()) {
            gv9 gv9Var = (gv9) obj;
            if (this.a == gv9Var.a && this.b == gv9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
