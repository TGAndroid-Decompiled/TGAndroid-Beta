package j3;
public final class h2 {
    public static final h2 f8609c;
    public static final h2 d;
    public static final h2 e;
    public final long f8610a;
    public final long f8611b;

    static {
        h2 h2Var = new h2(0L, 0L);
        f8609c = h2Var;
        d = new h2(Long.MAX_VALUE, Long.MAX_VALUE);
        new h2(Long.MAX_VALUE, 0L);
        new h2(0L, Long.MAX_VALUE);
        e = h2Var;
    }

    public h2(long j10, long j11) {
        boolean z4;
        if (j10 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        h5.a.f(j11 >= 0);
        this.f8610a = j10;
        this.f8611b = j11;
    }

    public final long a(long r11, long r13, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: j3.h2.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h2.class == obj.getClass()) {
            h2 h2Var = (h2) obj;
            if (this.f8610a == h2Var.f8610a && this.f8611b == h2Var.f8611b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f8610a) * 31) + ((int) this.f8611b);
    }
}
