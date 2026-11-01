package e9;

import java.io.Serializable;
import org.telegram.ui.dx0;
public final class y extends v1 implements Serializable {
    public final dx0 f6451a;

    public y(dx0 dx0Var) {
        this.f6451a = dx0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f6451a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return this.f6451a.equals(((y) obj).f6451a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6451a.hashCode();
    }

    public final String toString() {
        return this.f6451a.toString();
    }
}
