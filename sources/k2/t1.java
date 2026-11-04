package k2;

import b8.zb;
public final class t1 {
    public static final t1 f16736c;
    public static final t1 d;
    public static final t1 f16737e;
    public static final t1 f16738f;
    public final long f16739a;
    public final long f16740b;

    static {
        t1 t1Var = new t1(0L, 0L);
        f16736c = t1Var;
        d = new t1(Long.MAX_VALUE, Long.MAX_VALUE);
        f16737e = new t1(Long.MAX_VALUE, 0L);
        new t1(0L, Long.MAX_VALUE);
        f16738f = t1Var;
    }

    public t1(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        zb.f(j11 >= 0);
        this.f16739a = j10;
        this.f16740b = j11;
    }

    public final long a(long r17, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: k2.t1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t1.class == obj.getClass()) {
            t1 t1Var = (t1) obj;
            if (this.f16739a == t1Var.f16739a && this.f16740b == t1Var.f16740b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16739a) * 31) + ((int) this.f16740b);
    }
}
