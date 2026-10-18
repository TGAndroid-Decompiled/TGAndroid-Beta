package i2;

import v7.u6;
public final class r1 {
    public static final r1 f12578c;
    public static final r1 d;
    public static final r1 e;
    public static final r1 f12579f;
    public final long f12580a;
    public final long f12581b;

    static {
        r1 r1Var = new r1(0L, 0L);
        f12578c = r1Var;
        d = new r1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new r1(Long.MAX_VALUE, 0L);
        new r1(0L, Long.MAX_VALUE);
        f12579f = r1Var;
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
        this.f12580a = j10;
        this.f12581b = j11;
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
            if (this.f12580a == r1Var.f12580a && this.f12581b == r1Var.f12581b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12580a) * 31) + ((int) this.f12581b);
    }
}
