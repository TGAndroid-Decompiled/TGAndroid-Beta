package i2;
public final class p1 {
    public static final p1 f11721c;
    public static final p1 d;
    public static final p1 f11722e;
    public final long f11723a;
    public final long f11724b;

    static {
        p1 p1Var = new p1(0L, 0L);
        f11721c = p1Var;
        d = new p1(Long.MAX_VALUE, Long.MAX_VALUE);
        new p1(Long.MAX_VALUE, 0L);
        new p1(0L, Long.MAX_VALUE);
        f11722e = p1Var;
    }

    public p1(long j3, long j10) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        e2.d.b(j10 >= 0);
        this.f11723a = j3;
        this.f11724b = j10;
    }

    public final long a(long r11, long r13, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.f11723a == p1Var.f11723a && this.f11724b == p1Var.f11724b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11723a) * 31) + ((int) this.f11724b);
    }
}
