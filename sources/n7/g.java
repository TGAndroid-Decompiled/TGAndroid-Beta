package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class g implements Serializable {
    public final Object f17272a;

    public g(Object obj) {
        this.f17272a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return a.h(this.f17272a, ((g) obj).f17272a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17272a});
    }

    public final String toString() {
        return a1.g.p("Suppliers.ofInstance(", this.f17272a.toString(), ")");
    }
}
