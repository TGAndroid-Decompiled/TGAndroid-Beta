package j3;

import java.util.Arrays;
import k7.a7;
public final class z1 implements g {
    public final Object f8900a;
    public final int f8901b;
    public final c1 f8902c;
    public final Object d;
    public final int e;
    public final long f8903f;
    public final long h;
    public final int f8904n;
    public final int f8905r;

    static {
        int i10 = h5.d0.f6937a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public z1(Object obj, int i10, c1 c1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f8900a = obj;
        this.f8901b = i10;
        this.f8902c = c1Var;
        this.d = obj2;
        this.e = i11;
        this.f8903f = j10;
        this.h = j11;
        this.f8904n = i12;
        this.f8905r = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z1.class == obj.getClass()) {
            z1 z1Var = (z1) obj;
            if (this.f8901b == z1Var.f8901b && this.e == z1Var.e && this.f8903f == z1Var.f8903f && this.h == z1Var.h && this.f8904n == z1Var.f8904n && this.f8905r == z1Var.f8905r && a7.a(this.f8900a, z1Var.f8900a) && a7.a(this.d, z1Var.d) && a7.a(this.f8902c, z1Var.f8902c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8900a, Integer.valueOf(this.f8901b), this.f8902c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f8903f), Long.valueOf(this.h), Integer.valueOf(this.f8904n), Integer.valueOf(this.f8905r)});
    }
}
