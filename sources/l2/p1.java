package l2;

import a8.ma;
public final class p1 {
    public static final p1 f19521c;
    public static final p1 d;
    public static final p1 f19522e;
    public static final p1 f19523f;
    public final long f19524a;
    public final long f19525b;

    static {
        p1 p1Var = new p1(0L, 0L);
        f19521c = p1Var;
        d = new p1(Long.MAX_VALUE, Long.MAX_VALUE);
        f19522e = new p1(Long.MAX_VALUE, 0L);
        new p1(0L, Long.MAX_VALUE);
        f19523f = p1Var;
    }

    public p1(long j3, long j10) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        ma.f(j10 >= 0);
        this.f19524a = j3;
        this.f19525b = j10;
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
            if (this.f19524a == p1Var.f19524a && this.f19525b == p1Var.f19525b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f19524a) * 31) + ((int) this.f19525b);
    }
}
