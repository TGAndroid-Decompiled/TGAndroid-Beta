package h3;
public final class j2 {
    public static final j2 f9522c;
    public static final j2 d;
    public static final j2 f9523e;
    public final long f9524a;
    public final long f9525b;

    static {
        j2 j2Var = new j2(0L, 0L);
        f9522c = j2Var;
        d = new j2(Long.MAX_VALUE, Long.MAX_VALUE);
        new j2(Long.MAX_VALUE, 0L);
        new j2(0L, Long.MAX_VALUE);
        f9523e = j2Var;
    }

    public j2(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        d5.a.f(j11 >= 0);
        this.f9524a = j10;
        this.f9525b = j11;
    }

    public final long a(long r11, long r13, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: h3.j2.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j2.class == obj.getClass()) {
            j2 j2Var = (j2) obj;
            if (this.f9524a == j2Var.f9524a && this.f9525b == j2Var.f9525b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9524a) * 31) + ((int) this.f9525b);
    }
}
