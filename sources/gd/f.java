package gd;

import java.io.Serializable;
public final class f implements Serializable {
    public final Object f9597a;

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f9596a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!kotlin.jvm.internal.i.a(this.f9597a, ((f) obj).f9597a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9597a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f9597a;
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
