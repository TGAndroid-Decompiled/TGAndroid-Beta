package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class g implements Serializable {
    public final Object f15130a;

    public g(Object obj) {
        this.f15130a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return a.h(this.f15130a, ((g) obj).f15130a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15130a});
    }

    public final String toString() {
        return a4.a.p("Suppliers.ofInstance(", this.f15130a.toString(), ")");
    }
}
