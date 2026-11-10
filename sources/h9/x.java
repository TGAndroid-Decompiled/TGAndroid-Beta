package h9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
public final class x extends r1 implements Serializable {
    public final Comparator[] f14414a;

    public x(n nVar, n nVar2) {
        this.f14414a = new Comparator[]{nVar, nVar2};
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i7 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f14414a;
            if (i7 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i7].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i7++;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return Arrays.equals(this.f14414a, ((x) obj).f14414a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14414a);
    }

    public final String toString() {
        return a8.p0.s(new StringBuilder("Ordering.compound("), Arrays.toString(this.f14414a), ")");
    }
}
