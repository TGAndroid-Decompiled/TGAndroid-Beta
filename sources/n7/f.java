package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f16770a;

    public f(Object obj) {
        this.f16770a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f16770a, ((f) obj).f16770a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16770a});
    }

    public final String toString() {
        return a4.a.p("Suppliers.ofInstance(", this.f16770a.toString(), ")");
    }
}
