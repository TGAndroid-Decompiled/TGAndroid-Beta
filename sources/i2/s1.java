package i2;

import v7.u6;
public final class s1 {
    public static final s1 f12583c;
    public static final s1 d;
    public static final s1 e;
    public static final s1 f12584f;
    public final long f12585a;
    public final long f12586b;

    static {
        s1 s1Var = new s1(0L, 0L);
        f12583c = s1Var;
        d = new s1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new s1(Long.MAX_VALUE, 0L);
        new s1(0L, Long.MAX_VALUE);
        f12584f = s1Var;
    }

    public s1(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        u6.g(j11 >= 0);
        this.f12585a = j10;
        this.f12586b = j11;
    }

    public final long a(long r17, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.f12585a == s1Var.f12585a && this.f12586b == s1Var.f12586b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12585a) * 31) + ((int) this.f12586b);
    }
}
