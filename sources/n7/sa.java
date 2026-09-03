package n7;

import java.util.Arrays;
public final class sa {
    public final ra f15730a;
    public final Integer f15731b;

    public sa(qa qaVar) {
        this.f15730a = (ra) qaVar.f15701b;
        this.f15731b = (Integer) qaVar.f15702c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (b6.m.l(this.f15730a, saVar.f15730a) && b6.m.l(this.f15731b, saVar.f15731b) && b6.m.l(null, null) && b6.m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15730a, this.f15731b, null, null});
    }
}
