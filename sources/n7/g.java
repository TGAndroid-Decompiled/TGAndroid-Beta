package n7;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f17270a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f17270a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f17270a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f17270a.equals(((g) obj).f17270a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17270a.hashCode();
    }

    public final String toString() {
        return this.f17270a.toString();
    }
}
