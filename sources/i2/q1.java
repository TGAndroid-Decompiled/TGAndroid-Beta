package i2;
public final class q1 {
    public static final q1 f11872c;
    public static final q1 d;
    public static final q1 f11873e;
    public final long f11874a;
    public final long f11875b;

    static {
        q1 q1Var = new q1(0L, 0L);
        f11872c = q1Var;
        d = new q1(Long.MAX_VALUE, Long.MAX_VALUE);
        new q1(Long.MAX_VALUE, 0L);
        new q1(0L, Long.MAX_VALUE);
        f11873e = q1Var;
    }

    public q1(long j3, long j10) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        e2.d.b(j10 >= 0);
        this.f11874a = j3;
        this.f11875b = j10;
    }

    public final long a(long r12, long r14, long r16) {
        throw new UnsupportedOperationException("Method not decompiled: i2.q1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f11874a == q1Var.f11874a && this.f11875b == q1Var.f11875b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11874a) * 31) + ((int) this.f11875b);
    }
}
