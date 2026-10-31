package ad;

import java.io.Serializable;
public final class g implements Serializable {
    public final Object f396a;

    public static final Throwable a(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).f395a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!kotlin.jvm.internal.i.a(this.f396a, ((g) obj).f396a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f396a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f396a;
        if (obj instanceof f) {
            return ((f) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
