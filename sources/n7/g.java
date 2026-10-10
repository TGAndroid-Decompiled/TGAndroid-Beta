package n7;

import java.io.Serializable;
import java.util.Comparator;
public final class g extends w implements Serializable {
    public final Comparator f16756a;

    public g(Comparator comparator) {
        comparator.getClass();
        this.f16756a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f16756a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f16756a.equals(((g) obj).f16756a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16756a.hashCode();
    }

    public final String toString() {
        return this.f16756a.toString();
    }
}
