package f9;

import java.io.Serializable;
import org.telegram.ui.bv;
public final class t extends q1 implements Serializable {
    public final bv f10343a;

    public t(bv bvVar) {
        this.f10343a = bvVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f10343a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return this.f10343a.equals(((t) obj).f10343a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10343a.hashCode();
    }

    public final String toString() {
        return this.f10343a.toString();
    }
}
