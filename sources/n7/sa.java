package n7;

import java.util.Arrays;
public final class sa {
    public final ra f14713a;
    public final Integer f14714b;

    public sa(qa qaVar) {
        this.f14713a = (ra) qaVar.f14687b;
        this.f14714b = (Integer) qaVar.f14688c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (b6.m.l(this.f14713a, saVar.f14713a) && b6.m.l(this.f14714b, saVar.f14714b) && b6.m.l(null, null) && b6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14713a, this.f14714b, null, null});
    }
}
