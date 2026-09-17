package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f16654a;

    public f(Object obj) {
        this.f16654a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f16654a, ((f) obj).f16654a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16654a});
    }

    public final String toString() {
        return a4.a.p("Suppliers.ofInstance(", this.f16654a.toString(), ")");
    }
}
