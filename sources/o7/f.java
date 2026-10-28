package o7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f19208a;

    public f(Object obj) {
        this.f19208a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f19208a, ((f) obj).f19208a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19208a});
    }

    public final String toString() {
        return a1.g.p("Suppliers.ofInstance(", this.f19208a.toString(), ")");
    }
}
