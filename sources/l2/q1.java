package l2;

import a8.ma;
public final class q1 {
    public static final q1 f19625c;
    public static final q1 d;
    public static final q1 f19626e;
    public static final q1 f19627f;
    public final long f19628a;
    public final long f19629b;

    static {
        q1 q1Var = new q1(0L, 0L);
        f19625c = q1Var;
        d = new q1(Long.MAX_VALUE, Long.MAX_VALUE);
        f19626e = new q1(Long.MAX_VALUE, 0L);
        new q1(0L, Long.MAX_VALUE);
        f19627f = q1Var;
    }

    public q1(long j3, long j10) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        ma.f(j10 >= 0);
        this.f19628a = j3;
        this.f19629b = j10;
    }

    public final long a(long r17, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: l2.q1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f19628a == q1Var.f19628a && this.f19629b == q1Var.f19629b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f19628a) * 31) + ((int) this.f19629b);
    }
}
