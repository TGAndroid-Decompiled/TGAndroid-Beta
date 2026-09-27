package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f15378a;

    public f(Object obj) {
        this.f15378a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f15378a, ((f) obj).f15378a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15378a});
    }

    public final String toString() {
        return a4.a.p("Suppliers.ofInstance(", this.f15378a.toString(), ")");
    }
}
