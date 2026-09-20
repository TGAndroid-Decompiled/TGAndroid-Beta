package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f15339a;

    public f(Object obj) {
        this.f15339a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f15339a, ((f) obj).f15339a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15339a});
    }

    public final String toString() {
        return a4.a.p("Suppliers.ofInstance(", this.f15339a.toString(), ")");
    }
}
