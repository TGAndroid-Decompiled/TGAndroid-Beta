package defpackage;

import java.io.Serializable;
public final class ta9 implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof sa9) {
            return ((sa9) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ta9) {
            if (!rp5.a(this.a, ((ta9) obj).a)) {
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
        if (obj instanceof sa9) {
            return ((sa9) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
