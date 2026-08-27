package h3;

import java.util.Arrays;

public final class b2 implements g {

    public final Object f7786a;

    public final int f7787b;

    public final f1 f7788c;
    public final Object d;

    public final int f7789e;

    public final long f7790f;
    public final long h;

    public final int f7791n;

    public final int f7792r;

    static {
        int i10 = d5.g0.f4795a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public b2(Object obj, int i10, f1 f1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f7786a = obj;
        this.f7787b = i10;
        this.f7788c = f1Var;
        this.d = obj2;
        this.f7789e = i11;
        this.f7790f = j10;
        this.h = j11;
        this.f7791n = i12;
        this.f7792r = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b2.class == obj.getClass()) {
            b2 b2Var = (b2) obj;
            if (this.f7787b == b2Var.f7787b && this.f7789e == b2Var.f7789e && this.f7790f == b2Var.f7790f && this.h == b2Var.h && this.f7791n == b2Var.f7791n && this.f7792r == b2Var.f7792r && h7.e0.a(this.f7786a, b2Var.f7786a) && h7.e0.a(this.d, b2Var.d) && h7.e0.a(this.f7788c, b2Var.f7788c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7786a, Integer.valueOf(this.f7787b), this.f7788c, this.d, Integer.valueOf(this.f7789e), Long.valueOf(this.f7790f), Long.valueOf(this.h), Integer.valueOf(this.f7791n), Integer.valueOf(this.f7792r)});
    }
}
