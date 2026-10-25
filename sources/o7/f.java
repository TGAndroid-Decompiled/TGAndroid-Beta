package o7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f19209a;

    public f(Object obj) {
        this.f19209a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f19209a, ((f) obj).f19209a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19209a});
    }

    public final String toString() {
        return a1.g.p("Suppliers.ofInstance(", this.f19209a.toString(), ")");
    }
}
