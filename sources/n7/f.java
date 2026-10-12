package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f16497a;

    public f(Object obj) {
        this.f16497a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f16497a, ((f) obj).f16497a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16497a});
    }

    public final String toString() {
        return a1.g.q("Suppliers.ofInstance(", this.f16497a.toString(), ")");
    }
}
