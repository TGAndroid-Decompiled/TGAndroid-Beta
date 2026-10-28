package o7;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f19212a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f19212a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f19212a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f19212a.equals(((g) obj).f19212a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19212a.hashCode();
    }

    public final String toString() {
        return this.f19212a.toString();
    }
}
