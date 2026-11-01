package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f13668a;

    public f(Object obj) {
        this.f13668a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f13668a, ((f) obj).f13668a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13668a});
    }

    public final String toString() {
        return a1.g.n("Suppliers.ofInstance(", this.f13668a.toString(), ")");
    }
}
