package gd;

import java.io.Serializable;
public final class f implements Serializable {
    public final Throwable f13471a;

    public f(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        this.f13471a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (kotlin.jvm.internal.j.a(this.f13471a, ((f) obj).f13471a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13471a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13471a + ')';
    }
}
