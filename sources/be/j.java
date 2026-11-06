package be;
public final class j {
    public static final i f3218b = new Object();
    public final Object f3219a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (!kotlin.jvm.internal.j.a(this.f3219a, ((j) obj).f3219a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3219a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f3219a;
        if (obj instanceof h) {
            return ((h) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
