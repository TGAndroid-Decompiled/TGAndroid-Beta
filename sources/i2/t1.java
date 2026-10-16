package i2;

import v7.u6;
public final class t1 {
    public static final t1 f11196c;
    public static final t1 d;
    public static final t1 e;
    public static final t1 f11197f;
    public final long f11198a;
    public final long f11199b;

    static {
        t1 t1Var = new t1(0L, 0L);
        f11196c = t1Var;
        d = new t1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new t1(Long.MAX_VALUE, 0L);
        new t1(0L, Long.MAX_VALUE);
        f11197f = t1Var;
    }

    public t1(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        u6.g(j11 >= 0);
        this.f11198a = j10;
        this.f11199b = j11;
    }

    public final long a(long r17, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: i2.t1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t1.class == obj.getClass()) {
            t1 t1Var = (t1) obj;
            if (this.f11198a == t1Var.f11198a && this.f11199b == t1Var.f11199b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11198a) * 31) + ((int) this.f11199b);
    }
}
