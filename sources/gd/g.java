package gd;

import java.io.Serializable;
public final class g implements Serializable {
    public final Object f13165a;

    public static final Throwable a(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).f13164a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!kotlin.jvm.internal.j.a(this.f13165a, ((g) obj).f13165a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13165a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13165a;
        if (obj instanceof f) {
            return ((f) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
