package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f17268a;

    public f(Object obj) {
        this.f17268a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f17268a, ((f) obj).f17268a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17268a});
    }

    public final String toString() {
        return a1.g.p("Suppliers.ofInstance(", this.f17268a.toString(), ")");
    }
}
