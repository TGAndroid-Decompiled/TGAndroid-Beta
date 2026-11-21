package l2;

import a8.la;
public final class p1 {
    public static final p1 f19552c;
    public static final p1 d;
    public static final p1 f19553e;
    public static final p1 f19554f;
    public final long f19555a;
    public final long f19556b;

    static {
        p1 p1Var = new p1(0L, 0L);
        f19552c = p1Var;
        d = new p1(Long.MAX_VALUE, Long.MAX_VALUE);
        f19553e = new p1(Long.MAX_VALUE, 0L);
        new p1(0L, Long.MAX_VALUE);
        f19554f = p1Var;
    }

    public p1(long j3, long j10) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        la.f(j10 >= 0);
        this.f19555a = j3;
        this.f19556b = j10;
    }

    public final long a(long r17, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: l2.p1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.f19555a == p1Var.f19555a && this.f19556b == p1Var.f19556b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f19555a) * 31) + ((int) this.f19556b);
    }
}
