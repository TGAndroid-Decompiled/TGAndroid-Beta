package n7;

import java.io.Serializable;
import java.util.Comparator;
public final class h extends x implements Serializable {
    public final Comparator f15123a;

    public h(Comparator comparator) {
        comparator.getClass();
        this.f15123a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f15123a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return this.f15123a.equals(((h) obj).f15123a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15123a.hashCode();
    }

    public final String toString() {
        return this.f15123a.toString();
    }
}
