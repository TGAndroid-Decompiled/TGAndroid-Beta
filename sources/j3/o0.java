package j3;

import java.util.Arrays;
public final class o0 extends f2 {
    public static final String f9347e;
    public static final String f9348f;
    public static final f5.u h;
    public final boolean f9349c;
    public final boolean d;

    static {
        int i10 = h5.d0.f7237a;
        f9347e = Integer.toString(1, 36);
        f9348f = Integer.toString(2, 36);
        h = new f5.u(28);
    }

    public o0() {
        this.f9349c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (this.d == o0Var.d && this.f9349c == o0Var.f9349c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9349c), Boolean.valueOf(this.d)});
    }

    public o0(boolean z4) {
        this.f9349c = true;
        this.d = z4;
    }
}
