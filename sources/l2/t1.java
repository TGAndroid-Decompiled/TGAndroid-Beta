package l2;

import a8.ia;
public final class t1 {
    public static final t1 f18052c;
    public static final t1 d;
    public static final t1 f18053e;
    public static final t1 f18054f;
    public final long f18055a;
    public final long f18056b;

    static {
        t1 t1Var = new t1(0L, 0L);
        f18052c = t1Var;
        d = new t1(Long.MAX_VALUE, Long.MAX_VALUE);
        f18053e = new t1(Long.MAX_VALUE, 0L);
        new t1(0L, Long.MAX_VALUE);
        f18054f = t1Var;
    }

    public t1(long j3, long j10) {
        boolean z9;
        if (j3 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        ia.f(j10 >= 0);
        this.f18055a = j3;
        this.f18056b = j10;
    }

    public final long a(long r17, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: l2.t1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t1.class == obj.getClass()) {
            t1 t1Var = (t1) obj;
            if (this.f18055a == t1Var.f18055a && this.f18056b == t1Var.f18056b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18055a) * 31) + ((int) this.f18056b);
    }
}
