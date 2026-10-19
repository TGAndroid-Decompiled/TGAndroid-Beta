package e9;

import java.io.Serializable;
import org.telegram.ui.ig0;
public final class y extends v1 implements Serializable {
    public final ig0 f8537a;

    public y(ig0 ig0Var) {
        this.f8537a = ig0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8537a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return this.f8537a.equals(((y) obj).f8537a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8537a.hashCode();
    }

    public final String toString() {
        return this.f8537a.toString();
    }
}
