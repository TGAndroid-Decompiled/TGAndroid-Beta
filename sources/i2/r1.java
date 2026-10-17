package i2;

import v7.u6;
public final class r1 {
    public static final r1 f12580c;
    public static final r1 d;
    public static final r1 e;
    public static final r1 f12581f;
    public final long f12582a;
    public final long f12583b;

    static {
        r1 r1Var = new r1(0L, 0L);
        f12580c = r1Var;
        d = new r1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new r1(Long.MAX_VALUE, 0L);
        new r1(0L, Long.MAX_VALUE);
        f12581f = r1Var;
    }

    public r1(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        u6.g(j11 >= 0);
        this.f12582a = j10;
        this.f12583b = j11;
    }

    public final long a(long r17, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f12582a == r1Var.f12582a && this.f12583b == r1Var.f12583b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12582a) * 31) + ((int) this.f12583b);
    }
}
