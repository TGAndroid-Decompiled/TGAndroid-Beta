package l7;

import java.util.Arrays;
public final class ra {
    public final qa f14946a;
    public final Integer f14947b;

    public ra(g9.l lVar) {
        this.f14946a = (qa) lVar.f7168b;
        this.f14947b = (Integer) lVar.f7169c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        if (z5.l.l(this.f14946a, raVar.f14946a) && z5.l.l(this.f14947b, raVar.f14947b) && z5.l.l(null, null) && z5.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14946a, this.f14947b, null, null});
    }
}
