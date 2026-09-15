package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class g implements Serializable {
    public final Object f15120a;

    public g(Object obj) {
        this.f15120a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return a.h(this.f15120a, ((g) obj).f15120a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15120a});
    }

    public final String toString() {
        return a4.a.p("Suppliers.ofInstance(", this.f15120a.toString(), ")");
    }
}
