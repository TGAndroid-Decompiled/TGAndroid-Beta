package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f16175a;

    public f(Object obj) {
        this.f16175a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f16175a, ((f) obj).f16175a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16175a});
    }

    public final String toString() {
        return a1.g.p("Suppliers.ofInstance(", this.f16175a.toString(), ")");
    }
}
