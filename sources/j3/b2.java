package j3;

import i7.o6;
import java.util.Arrays;
public final class b2 implements g {
    public final Object f10390a;
    public final int f10391b;
    public final f1 f10392c;
    public final Object d;
    public final int f10393e;
    public final long f10394f;
    public final long h;
    public final int f10395n;
    public final int f10396r;

    static {
        int i10 = f5.d0.f6579a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public b2(Object obj, int i10, f1 f1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f10390a = obj;
        this.f10391b = i10;
        this.f10392c = f1Var;
        this.d = obj2;
        this.f10393e = i11;
        this.f10394f = j10;
        this.h = j11;
        this.f10395n = i12;
        this.f10396r = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b2.class == obj.getClass()) {
            b2 b2Var = (b2) obj;
            if (this.f10391b == b2Var.f10391b && this.f10393e == b2Var.f10393e && this.f10394f == b2Var.f10394f && this.h == b2Var.h && this.f10395n == b2Var.f10395n && this.f10396r == b2Var.f10396r && o6.a(this.f10390a, b2Var.f10390a) && o6.a(this.d, b2Var.d) && o6.a(this.f10392c, b2Var.f10392c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10390a, Integer.valueOf(this.f10391b), this.f10392c, this.d, Integer.valueOf(this.f10393e), Long.valueOf(this.f10394f), Long.valueOf(this.h), Integer.valueOf(this.f10395n), Integer.valueOf(this.f10396r)});
    }
}
