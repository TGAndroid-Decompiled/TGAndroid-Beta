package id;

import java.io.Serializable;
public final class f implements Serializable {
    public final Object f12772a;

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f12771a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!kotlin.jvm.internal.i.a(this.f12772a, ((f) obj).f12772a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f12772a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f12772a;
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
