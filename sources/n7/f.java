package n7;

import java.io.Serializable;
import java.util.Arrays;
public final class f implements Serializable {
    public final Object f16775a;

    public f(Object obj) {
        this.f16775a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return a.h(this.f16775a, ((f) obj).f16775a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16775a});
    }

    public final String toString() {
        return a4.a.q("Suppliers.ofInstance(", this.f16775a.toString(), ")");
    }
}
