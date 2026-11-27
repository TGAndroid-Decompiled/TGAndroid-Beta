package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
public final class kr2 extends eu7 implements Serializable {
    public final Comparator[] a;

    public kr2(d51 d51Var, d51 d51Var2) {
        this.a = new Comparator[]{d51Var, d51Var2};
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
        if (obj instanceof kr2) {
            return Arrays.equals(this.a, ((kr2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return c00.k(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
