package gd;

import java.io.Serializable;
public final class g implements Serializable {
    public final Object f13823a;

    public static final Throwable a(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).f13822a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!kotlin.jvm.internal.j.a(this.f13823a, ((g) obj).f13823a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13823a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13823a;
        if (obj instanceof f) {
            return ((f) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
