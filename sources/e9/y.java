package e9;

import java.io.Serializable;
import org.telegram.ui.o70;
public final class y extends v1 implements Serializable {
    public final o70 f8542a;

    public y(o70 o70Var) {
        this.f8542a = o70Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8542a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return this.f8542a.equals(((y) obj).f8542a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8542a.hashCode();
    }

    public final String toString() {
        return this.f8542a.toString();
    }
}
