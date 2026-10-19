package e9;

import java.io.Serializable;
import org.telegram.ui.jg0;
public final class y extends v1 implements Serializable {
    public final jg0 f8535a;

    public y(jg0 jg0Var) {
        this.f8535a = jg0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8535a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return this.f8535a.equals(((y) obj).f8535a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8535a.hashCode();
    }

    public final String toString() {
        return this.f8535a.toString();
    }
}
