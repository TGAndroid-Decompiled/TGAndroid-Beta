package gd;

import java.io.Serializable;
public final class f implements Serializable {
    public final Object f10611a;

    public static final Throwable a(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).f10610a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!kotlin.jvm.internal.i.a(this.f10611a, ((f) obj).f10611a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f10611a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f10611a;
        if (obj instanceof e) {
            return ((e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
