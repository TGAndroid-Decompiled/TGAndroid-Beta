package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
public final class cs2 extends at7 implements Serializable {
    public final Comparator[] a;

    public cs2(c61 c61Var, c61 c61Var2) {
        this.a = new Comparator[]{c61Var, c61Var2};
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cs2) {
            return Arrays.equals(this.a, ((cs2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return b10.j(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
