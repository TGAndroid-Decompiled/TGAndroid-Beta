package n7;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f16501a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f16501a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f16501a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f16501a.equals(((g) obj).f16501a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16501a.hashCode();
    }

    public final String toString() {
        return this.f16501a.toString();
    }
}
