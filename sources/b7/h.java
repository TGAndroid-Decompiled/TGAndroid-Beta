package b7;

import java.io.Serializable;
import java.util.Arrays;
public final class h implements Serializable {
    public final Object f1820a;

    public h(Object obj) {
        this.f1820a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return b.h(this.f1820a, ((h) obj).f1820a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1820a});
    }

    public final String toString() {
        return android.support.v4.media.a.o("Suppliers.ofInstance(", this.f1820a.toString(), ")");
    }
}
