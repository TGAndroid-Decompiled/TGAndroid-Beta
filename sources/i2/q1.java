package i2;
public final class q1 {
    public static final q1 f10865c;
    public static final q1 d;
    public static final q1 e;
    public final long f10866a;
    public final long f10867b;

    static {
        q1 q1Var = new q1(0L, 0L);
        f10865c = q1Var;
        d = new q1(Long.MAX_VALUE, Long.MAX_VALUE);
        new q1(Long.MAX_VALUE, 0L);
        new q1(0L, Long.MAX_VALUE);
        e = q1Var;
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
        this.f10866a = j3;
        this.f10867b = j10;
    }

    public final long a(long r11, long r13, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.q1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f10866a == q1Var.f10866a && this.f10867b == q1Var.f10867b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f10866a) * 31) + ((int) this.f10867b);
    }
}
