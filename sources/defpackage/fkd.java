package defpackage;

import java.io.Serializable;
import java.util.Comparator;
public final class fkd extends bqd implements Serializable {
    public final Comparator a;

    public fkd(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fkd) {
            return this.a.equals(((fkd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
