package h3;

import java.util.Arrays;

public final class v0 extends g2 {

    public static final String f8213e;

    public static final String f8214f;
    public static final f9.z h;

    public final boolean f8215c;
    public final boolean d;

    static {
        int i10 = d5.g0.f4795a;
        f8213e = Integer.toString(1, 36);
        f8214f = Integer.toString(2, 36);
        h = new f9.z(19);
    }

    public v0() {
        this.f8215c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.d == v0Var.d && this.f8215c == v0Var.f8215c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8215c), Boolean.valueOf(this.d)});
    }

    public v0(boolean z10) {
        this.f8215c = true;
        this.d = z10;
    }
}
