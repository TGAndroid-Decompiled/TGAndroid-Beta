package b7;

import java.io.Serializable;
import java.util.Arrays;
public final class h implements Serializable {
    public final Object f1681a;

    public h(Object obj) {
        this.f1681a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return b.h(this.f1681a, ((h) obj).f1681a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1681a});
    }

    public final String toString() {
        return android.support.v4.media.a.o("Suppliers.ofInstance(", this.f1681a.toString(), ")");
    }
}
