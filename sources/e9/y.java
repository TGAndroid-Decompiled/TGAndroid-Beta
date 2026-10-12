package e9;

import java.io.Serializable;
import org.telegram.ui.es0;
public final class y extends v1 implements Serializable {
    public final es0 f8653a;

    public y(es0 es0Var) {
        this.f8653a = es0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8653a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return this.f8653a.equals(((y) obj).f8653a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8653a.hashCode();
    }

    public final String toString() {
        return this.f8653a.toString();
    }
}
