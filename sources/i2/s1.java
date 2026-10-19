package i2;

import v7.u6;
public final class s1 {
    public static final s1 f12581c;
    public static final s1 d;
    public static final s1 e;
    public static final s1 f12582f;
    public final long f12583a;
    public final long f12584b;

    static {
        s1 s1Var = new s1(0L, 0L);
        f12581c = s1Var;
        d = new s1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new s1(Long.MAX_VALUE, 0L);
        new s1(0L, Long.MAX_VALUE);
        f12582f = s1Var;
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
        this.f12583a = j10;
        this.f12584b = j11;
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
            if (this.f12583a == s1Var.f12583a && this.f12584b == s1Var.f12584b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f12583a) * 31) + ((int) this.f12584b);
    }
}
