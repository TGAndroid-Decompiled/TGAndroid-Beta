package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f15343a;

    public f(Object obj) {
        this.f15343a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f15343a, ((f) obj).f15343a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15343a});
    }

    public final String toString() {
        return a4.a.q("Suppliers.ofInstance(", this.f15343a.toString(), ")");
    }
}
