package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class g implements Serializable {
    public final Object f15095a;

    public g(Object obj) {
        this.f15095a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return a.h(this.f15095a, ((g) obj).f15095a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15095a});
    }

    public final String toString() {
        return a4.a.q("Suppliers.ofInstance(", this.f15095a.toString(), ")");
    }
}
