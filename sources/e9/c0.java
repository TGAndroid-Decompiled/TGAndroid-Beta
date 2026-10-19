package e9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
public final class c0 extends v1 implements Serializable {
    public final Comparator[] f8422a;

    public c0(r rVar, r rVar2) {
        this.f8422a = new Comparator[]{rVar, rVar2};
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f8422a;
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
        if (obj instanceof c0) {
            return Arrays.equals(this.f8422a, ((c0) obj).f8422a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8422a);
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Ordering.compound("), Arrays.toString(this.f8422a), ")");
    }
}
