package o8;

import java.io.Serializable;
import java.util.Comparator;
public final class q extends k0 implements Serializable {
    public final Comparator f19078a;

    public q(Comparator comparator) {
        this.f19078a = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f19078a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return this.f19078a.equals(((q) obj).f19078a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19078a.hashCode();
    }

    public final String toString() {
        return this.f19078a.toString();
    }
}
