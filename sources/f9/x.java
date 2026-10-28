package f9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
public final class x extends q1 implements Serializable {
    public final Comparator[] f10356a;

    public x(n nVar, n nVar2) {
        this.f10356a = new Comparator[]{nVar, nVar2};
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f10356a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i10].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i10++;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            return Arrays.equals(this.f10356a, ((x) obj).f10356a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10356a);
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Ordering.compound("), Arrays.toString(this.f10356a), ")");
    }
}
