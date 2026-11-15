package l2;

import a8.ja;
public final class p1 {
    public static final p1 f19160c;
    public static final p1 d;
    public static final p1 f19161e;
    public static final p1 f19162f;
    public final long f19163a;
    public final long f19164b;

    static {
        p1 p1Var = new p1(0L, 0L);
        f19160c = p1Var;
        d = new p1(Long.MAX_VALUE, Long.MAX_VALUE);
        f19161e = new p1(Long.MAX_VALUE, 0L);
        new p1(0L, Long.MAX_VALUE);
        f19162f = p1Var;
    }

    public p1(long j3, long j10) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        ja.f(j10 >= 0);
        this.f19163a = j3;
        this.f19164b = j10;
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
            if (this.f19163a == p1Var.f19163a && this.f19164b == p1Var.f19164b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f19163a) * 31) + ((int) this.f19164b);
    }
}
