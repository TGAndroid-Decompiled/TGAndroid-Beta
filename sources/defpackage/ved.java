package defpackage;

import java.io.Serializable;
import java.util.Arrays;
public final class ved implements Serializable {
    public final Object a;

    public ved(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ved) {
            return vze.a(this.a, ((ved) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return tb4.y("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
