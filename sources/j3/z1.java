package j3;

import java.util.Arrays;
import k7.b7;
public final class z1 implements g {
    public final Object f8882a;
    public final int f8883b;
    public final c1 f8884c;
    public final Object d;
    public final int e;
    public final long f8885f;
    public final long h;
    public final int f8886n;
    public final int f8887r;

    static {
        int i10 = h5.d0.f6924a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public z1(Object obj, int i10, c1 c1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f8882a = obj;
        this.f8883b = i10;
        this.f8884c = c1Var;
        this.d = obj2;
        this.e = i11;
        this.f8885f = j10;
        this.h = j11;
        this.f8886n = i12;
        this.f8887r = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z1.class == obj.getClass()) {
            z1 z1Var = (z1) obj;
            if (this.f8883b == z1Var.f8883b && this.e == z1Var.e && this.f8885f == z1Var.f8885f && this.h == z1Var.h && this.f8886n == z1Var.f8886n && this.f8887r == z1Var.f8887r && b7.a(this.f8882a, z1Var.f8882a) && b7.a(this.d, z1Var.d) && b7.a(this.f8884c, z1Var.f8884c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8882a, Integer.valueOf(this.f8883b), this.f8884c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f8885f), Long.valueOf(this.h), Integer.valueOf(this.f8886n), Integer.valueOf(this.f8887r)});
    }
}
