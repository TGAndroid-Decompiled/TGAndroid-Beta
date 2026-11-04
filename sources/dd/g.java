package dd;

import java.io.Serializable;
public final class g implements Serializable {
    public final Object f8793a;

    public static final Throwable a(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).f8792a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!kotlin.jvm.internal.j.a(this.f8793a, ((g) obj).f8793a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f8793a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f8793a;
        if (obj instanceof f) {
            return ((f) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
