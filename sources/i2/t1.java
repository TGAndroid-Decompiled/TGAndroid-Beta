package i2;

import a8.yb;
public final class t1 {
    public static final t1 f13765c;
    public static final t1 d;
    public static final t1 e;
    public static final t1 f13766f;
    public final long f13767a;
    public final long f13768b;

    static {
        t1 t1Var = new t1(0L, 0L);
        f13765c = t1Var;
        d = new t1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new t1(Long.MAX_VALUE, 0L);
        new t1(0L, Long.MAX_VALUE);
        f13766f = t1Var;
    }

    public t1(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        yb.g(j11 >= 0);
        this.f13767a = j10;
        this.f13768b = j11;
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
            if (this.f13767a == t1Var.f13767a && this.f13768b == t1Var.f13768b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f13767a) * 31) + ((int) this.f13768b);
    }
}
