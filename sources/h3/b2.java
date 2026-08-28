package h3;

import java.util.Arrays;
public final class b2 implements g {
    public final Object f9351a;
    public final int f9352b;
    public final f1 f9353c;
    public final Object d;
    public final int f9354e;
    public final long f9355f;
    public final long h;
    public final int f9356n;
    public final int f9357r;

    static {
        int i9 = d5.f0.f4349a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public b2(Object obj, int i9, f1 f1Var, Object obj2, int i10, long j10, long j11, int i11, int i12) {
        this.f9351a = obj;
        this.f9352b = i9;
        this.f9353c = f1Var;
        this.d = obj2;
        this.f9354e = i10;
        this.f9355f = j10;
        this.h = j11;
        this.f9356n = i11;
        this.f9357r = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b2.class == obj.getClass()) {
            b2 b2Var = (b2) obj;
            if (this.f9352b == b2Var.f9352b && this.f9354e == b2Var.f9354e && this.f9355f == b2Var.f9355f && this.h == b2Var.h && this.f9356n == b2Var.f9356n && this.f9357r == b2Var.f9357r && g7.c0.a(this.f9351a, b2Var.f9351a) && g7.c0.a(this.d, b2Var.d) && g7.c0.a(this.f9353c, b2Var.f9353c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9351a, Integer.valueOf(this.f9352b), this.f9353c, this.d, Integer.valueOf(this.f9354e), Long.valueOf(this.f9355f), Long.valueOf(this.h), Integer.valueOf(this.f9356n), Integer.valueOf(this.f9357r)});
    }
}
