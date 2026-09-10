package i2;
public final class o1 {
    public static final o1 f10318c;
    public static final o1 d;
    public static final o1 e;
    public final long f10319a;
    public final long f10320b;

    static {
        o1 o1Var = new o1(0L, 0L);
        f10318c = o1Var;
        d = new o1(Long.MAX_VALUE, Long.MAX_VALUE);
        new o1(Long.MAX_VALUE, 0L);
        new o1(0L, Long.MAX_VALUE);
        e = o1Var;
    }

    public o1(long j3, long j10) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        e2.d.b(j10 >= 0);
        this.f10319a = j3;
        this.f10320b = j10;
    }

    public final long a(long r11, long r13, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: i2.o1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o1.class == obj.getClass()) {
            o1 o1Var = (o1) obj;
            if (this.f10319a == o1Var.f10319a && this.f10320b == o1Var.f10320b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f10319a) * 31) + ((int) this.f10320b);
    }
}
