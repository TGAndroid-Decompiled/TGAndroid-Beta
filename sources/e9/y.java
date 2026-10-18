package e9;

import java.io.Serializable;
import org.telegram.ui.lg0;
public final class y extends v1 implements Serializable {
    public final lg0 f8538a;

    public y(lg0 lg0Var) {
        this.f8538a = lg0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8538a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return this.f8538a.equals(((y) obj).f8538a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8538a.hashCode();
    }

    public final String toString() {
        return this.f8538a.toString();
    }
}
