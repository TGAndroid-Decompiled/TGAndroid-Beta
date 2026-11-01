package n7;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f13672a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f13672a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f13672a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f13672a.equals(((g) obj).f13672a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13672a.hashCode();
    }

    public final String toString() {
        return this.f13672a.toString();
    }
}
