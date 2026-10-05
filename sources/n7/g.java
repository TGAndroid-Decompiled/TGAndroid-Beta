package n7;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f16785a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f16785a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f16785a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f16785a.equals(((g) obj).f16785a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16785a.hashCode();
    }

    public final String toString() {
        return this.f16785a.toString();
    }
}
