package id;

import java.io.Serializable;
public final class f implements Serializable {
    public final Object f12774a;

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f12773a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!kotlin.jvm.internal.i.a(this.f12774a, ((f) obj).f12774a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f12774a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f12774a;
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
