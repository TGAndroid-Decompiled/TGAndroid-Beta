package j3;
public final class j2 {
    public static final j2 f10559c;
    public static final j2 d;
    public static final j2 f10560e;
    public final long f10561a;
    public final long f10562b;

    static {
        j2 j2Var = new j2(0L, 0L);
        f10559c = j2Var;
        d = new j2(Long.MAX_VALUE, Long.MAX_VALUE);
        new j2(Long.MAX_VALUE, 0L);
        new j2(0L, Long.MAX_VALUE);
        f10560e = j2Var;
    }

    public j2(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        f5.a.f(j11 >= 0);
        this.f10561a = j10;
        this.f10562b = j11;
    }

    public final long a(long r11, long r13, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: j3.j2.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j2.class == obj.getClass()) {
            j2 j2Var = (j2) obj;
            if (this.f10561a == j2Var.f10561a && this.f10562b == j2Var.f10562b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f10561a) * 31) + ((int) this.f10562b);
    }
}
