package n7;

import java.io.Serializable;
import java.util.Comparator;
public final class h extends x implements Serializable {
    public final Comparator f13955a;

    public h(Comparator comparator) {
        comparator.getClass();
        this.f13955a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f13955a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return this.f13955a.equals(((h) obj).f13955a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13955a.hashCode();
    }

    public final String toString() {
        return this.f13955a.toString();
    }
}
