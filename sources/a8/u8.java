package a8;

import java.util.Arrays;
public final class u8 {
    public final Float f656a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        if (q6.m.k(null, null) && q6.m.k(this.f656a, u8Var.f656a) && q6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.f656a, null});
    }
}
