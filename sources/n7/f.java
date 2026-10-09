package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f16748a;

    public f(Object obj) {
        this.f16748a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f16748a, ((f) obj).f16748a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16748a});
    }

    public final String toString() {
        return a1.g.q("Suppliers.ofInstance(", this.f16748a.toString(), ")");
    }
}
