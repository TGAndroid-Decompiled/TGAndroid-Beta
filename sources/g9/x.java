package g9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
public final class x extends q1 implements Serializable {
    public final Comparator[] f12166a;

    public x(n nVar, n nVar2) {
        this.f12166a = new Comparator[]{nVar, nVar2};
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i3 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f12166a;
            if (i3 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i3].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i3++;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return Arrays.equals(this.f12166a, ((x) obj).f12166a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12166a);
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Ordering.compound("), Arrays.toString(this.f12166a), ")");
    }
}
