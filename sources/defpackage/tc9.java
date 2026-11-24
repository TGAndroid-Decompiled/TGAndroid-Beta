package defpackage;

import java.io.Serializable;
public final class tc9 implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof sc9) {
            return ((sc9) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tc9) {
            if (!rr5.a(this.a, ((tc9) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof sc9) {
            return ((sc9) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
