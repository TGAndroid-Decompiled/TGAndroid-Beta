package e9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
public final class a0 extends y0 implements Serializable {
    public final Comparator[] f7355a;

    public a0(p pVar, p pVar2) {
        this.f7355a = new Comparator[]{pVar, pVar2};
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f7355a;
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
        if (obj instanceof a0) {
            return Arrays.equals(this.f7355a, ((a0) obj).f7355a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7355a);
    }

    public final String toString() {
        return a4.a.s(new StringBuilder("Ordering.compound("), Arrays.toString(this.f7355a), ")");
    }
}
