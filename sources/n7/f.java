package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f15352a;

    public f(Object obj) {
        this.f15352a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f15352a, ((f) obj).f15352a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15352a});
    }

    public final String toString() {
        return a4.a.p("Suppliers.ofInstance(", this.f15352a.toString(), ")");
    }
}
