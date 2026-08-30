package b7;

import java.io.Serializable;
import java.util.Comparator;
public final class i extends z implements Serializable {
    public final Comparator f1683a;

    public i(Comparator comparator) {
        comparator.getClass();
        this.f1683a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f1683a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f1683a.equals(((i) obj).f1683a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1683a.hashCode();
    }

    public final String toString() {
        return this.f1683a.toString();
    }
}
