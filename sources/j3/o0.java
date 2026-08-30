package j3;

import java.util.Arrays;
public final class o0 extends f2 {
    public static final String e;
    public static final String f8761f;
    public static final f0.d h;
    public final boolean f8762c;
    public final boolean d;

    static {
        int i10 = h5.d0.f6937a;
        e = Integer.toString(1, 36);
        f8761f = Integer.toString(2, 36);
        h = new f0.d(28);
    }

    public o0() {
        this.f8762c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (this.d == o0Var.d && this.f8762c == o0Var.f8762c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8762c), Boolean.valueOf(this.d)});
    }

    public o0(boolean z4) {
        this.f8762c = true;
        this.d = z4;
    }
}
