package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f15328a;

    public f(Object obj) {
        this.f15328a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f15328a, ((f) obj).f15328a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15328a});
    }

    public final String toString() {
        return a4.a.q("Suppliers.ofInstance(", this.f15328a.toString(), ")");
    }
}
