package e9;

import java.io.Serializable;
import org.telegram.ui.kg0;
public final class y extends v1 implements Serializable {
    public final kg0 f8536a;

    public y(kg0 kg0Var) {
        this.f8536a = kg0Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f8536a.compare(obj, obj2);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            return this.f8536a.equals(((y) obj).f8536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8536a.hashCode();
    }

    public final String toString() {
        return this.f8536a.toString();
    }
}
