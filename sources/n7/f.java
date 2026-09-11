package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f16627a;

    public f(Object obj) {
        this.f16627a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f16627a, ((f) obj).f16627a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16627a});
    }

    public final String toString() {
        return a4.a.p("Suppliers.ofInstance(", this.f16627a.toString(), ")");
    }
}
