package n7;

import java.util.Arrays;
public final class sa {
    public final ra f14728a;
    public final Integer f14729b;

    public sa(qa qaVar) {
        this.f14728a = (ra) qaVar.f14702b;
        this.f14729b = (Integer) qaVar.f14703c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (b6.m.l(this.f14728a, saVar.f14728a) && b6.m.l(this.f14729b, saVar.f14729b) && b6.m.l(null, null) && b6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14728a, this.f14729b, null, null});
    }
}
