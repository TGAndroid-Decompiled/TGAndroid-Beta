package e9;

import java.io.Serializable;
import org.telegram.ui.ds0;
public final class y extends v1 implements Serializable {
    public final ds0 f8656a;

    public y(ds0 ds0Var) {
        this.f8656a = ds0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8656a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return this.f8656a.equals(((y) obj).f8656a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8656a.hashCode();
    }

    public final String toString() {
        return this.f8656a.toString();
    }
}
