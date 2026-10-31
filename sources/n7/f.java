package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f13667a;

    public f(Object obj) {
        this.f13667a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f13667a, ((f) obj).f13667a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13667a});
    }

    public final String toString() {
        return a1.g.n("Suppliers.ofInstance(", this.f13667a.toString(), ")");
    }
}
