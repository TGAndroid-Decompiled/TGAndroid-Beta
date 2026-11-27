package defpackage;
public final class az9 {
    public static final az9 c;
    public static final az9 d;
    public static final az9 e;
    public static final az9 f;
    public final long a;
    public final long b;

    static {
        az9 az9Var = new az9(0L, 0L);
        c = az9Var;
        d = new az9(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new az9(Long.MAX_VALUE, 0L);
        new az9(0L, Long.MAX_VALUE);
        f = az9Var;
    }

    public az9(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        yve.f(j2 >= 0);
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
        String str = gcc.a;
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
        long a = gcc.a(j, j6);
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
        if (obj != null && az9.class == obj.getClass()) {
            az9 az9Var = (az9) obj;
            if (this.a == az9Var.a && this.b == az9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
