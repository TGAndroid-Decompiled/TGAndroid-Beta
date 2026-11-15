package be;
public final class j {
    public static final i f3176b = new Object();
    public final Object f3177a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (!kotlin.jvm.internal.j.a(this.f3177a, ((j) obj).f3177a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3177a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f3177a;
        if (obj instanceof h) {
            return ((h) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
