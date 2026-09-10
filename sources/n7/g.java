package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class g implements Serializable {
    public final Object f13950a;

    public g(Object obj) {
        this.f13950a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return a.h(this.f13950a, ((g) obj).f13950a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13950a});
    }

    public final String toString() {
        return a4.a.p("Suppliers.ofInstance(", this.f13950a.toString(), ")");
    }
}
