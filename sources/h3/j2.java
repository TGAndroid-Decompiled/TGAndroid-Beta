package h3;

public final class j2 {

    public static final j2 f7952c;
    public static final j2 d;

    public static final j2 f7953e;

    public final long f7954a;

    public final long f7955b;

    static {
        j2 j2Var = new j2(0L, 0L);
        f7952c = j2Var;
        d = new j2(Long.MAX_VALUE, Long.MAX_VALUE);
        new j2(Long.MAX_VALUE, 0L);
        new j2(0L, Long.MAX_VALUE);
        f7953e = j2Var;
    }

    public j2(long j10, long j11) {
        d5.a.f(j10 >= 0);
        d5.a.f(j11 >= 0);
        this.f7954a = j10;
        this.f7955b = j11;
    }

    public final long a(long j10, long j11, long j12) {
        long j13 = this.f7955b;
        long j14 = this.f7954a;
        if (j14 == 0 && j13 == 0) {
            return j10;
        }
        int i10 = d5.g0.f4795a;
        long j15 = j10 - j14;
        if (((j14 ^ j10) & (j10 ^ j15)) < 0) {
            j15 = Long.MIN_VALUE;
        }
        long j16 = j10 + j13;
        if (((j13 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z10 = false;
        boolean z11 = j15 <= j11 && j11 <= j16;
        if (j15 <= j12 && j12 <= j16) {
            z10 = true;
        }
        if (z11 && z10) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
            return j12;
        }
        if (!z11) {
            if (z10) {
                return j12;
            }
            return j15;
        }
        return j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j2.class == obj.getClass()) {
            j2 j2Var = (j2) obj;
            if (this.f7954a == j2Var.f7954a && this.f7955b == j2Var.f7955b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7954a) * 31) + ((int) this.f7955b);
    }
}
