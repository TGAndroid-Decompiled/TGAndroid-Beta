package i2;

import v7.t6;
public final class v1 {
    public static final v1 f8102c;
    public static final v1 d;
    public static final v1 e;
    public static final v1 f8103f;
    public final long f8104a;
    public final long f8105b;

    static {
        v1 v1Var = new v1(0L, 0L);
        f8102c = v1Var;
        d = new v1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new v1(Long.MAX_VALUE, 0L);
        new v1(0L, Long.MAX_VALUE);
        f8103f = v1Var;
    }

    public v1(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        t6.f(j11 >= 0);
        this.f8104a = j10;
        this.f8105b = j11;
    }

    public final long a(long r17, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: i2.v1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.f8104a == v1Var.f8104a && this.f8105b == v1Var.f8105b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f8104a) * 31) + ((int) this.f8105b);
    }
}
