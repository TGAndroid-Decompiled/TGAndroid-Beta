package n7;

import java.util.Arrays;
public final class sa {
    public final ra f15728a;
    public final Integer f15729b;

    public sa(qa qaVar) {
        this.f15728a = (ra) qaVar.f15699b;
        this.f15729b = (Integer) qaVar.f15700c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (b6.m.l(this.f15728a, saVar.f15728a) && b6.m.l(this.f15729b, saVar.f15729b) && b6.m.l(null, null) && b6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15728a, this.f15729b, null, null});
    }
}
