package j3;

import java.util.Arrays;
public final class v0 extends g2 {
    public static final String f10819e;
    public static final String f10820f;
    public static final d0 h;
    public final boolean f10821c;
    public final boolean d;

    static {
        int i10 = f5.d0.f6579a;
        f10819e = Integer.toString(1, 36);
        f10820f = Integer.toString(2, 36);
        h = new d0(2);
    }

    public v0() {
        this.f10821c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (this.d == v0Var.d && this.f10821c == v0Var.f10821c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10821c), Boolean.valueOf(this.d)});
    }

    public v0(boolean z10) {
        this.f10821c = true;
        this.d = z10;
    }
}
