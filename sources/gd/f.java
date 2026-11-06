package gd;

import java.io.Serializable;
public final class f implements Serializable {
    public final Throwable f13820a;

    public f(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        this.f13820a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (kotlin.jvm.internal.j.a(this.f13820a, ((f) obj).f13820a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13820a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13820a + ')';
    }
}
