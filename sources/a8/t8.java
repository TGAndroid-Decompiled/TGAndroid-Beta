package a8;

import java.util.Arrays;
public final class t8 {
    public final Float f652a;

    public t8(d6.i iVar) {
        this.f652a = (Float) iVar.f8212b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        if (q6.m.k(null, null) && q6.m.k(this.f652a, t8Var.f652a) && q6.m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.f652a, null});
    }
}
