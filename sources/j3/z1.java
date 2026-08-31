package j3;

import java.util.Arrays;
import k7.b7;
public final class z1 implements g {
    public final Object f9500a;
    public final int f9501b;
    public final c1 f9502c;
    public final Object d;
    public final int f9503e;
    public final long f9504f;
    public final long h;
    public final int f9505n;
    public final int f9506r;

    static {
        int i10 = h5.d0.f7237a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public z1(Object obj, int i10, c1 c1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f9500a = obj;
        this.f9501b = i10;
        this.f9502c = c1Var;
        this.d = obj2;
        this.f9503e = i11;
        this.f9504f = j10;
        this.h = j11;
        this.f9505n = i12;
        this.f9506r = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z1.class == obj.getClass()) {
            z1 z1Var = (z1) obj;
            if (this.f9501b == z1Var.f9501b && this.f9503e == z1Var.f9503e && this.f9504f == z1Var.f9504f && this.h == z1Var.h && this.f9505n == z1Var.f9505n && this.f9506r == z1Var.f9506r && b7.a(this.f9500a, z1Var.f9500a) && b7.a(this.d, z1Var.d) && b7.a(this.f9502c, z1Var.f9502c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9500a, Integer.valueOf(this.f9501b), this.f9502c, this.d, Integer.valueOf(this.f9503e), Long.valueOf(this.f9504f), Long.valueOf(this.h), Integer.valueOf(this.f9505n), Integer.valueOf(this.f9506r)});
    }
}
