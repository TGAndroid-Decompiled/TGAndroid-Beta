package dd;

import java.io.Serializable;
public final class f implements Serializable {
    public final Throwable f8792a;

    public f(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        this.f8792a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (kotlin.jvm.internal.j.a(this.f8792a, ((f) obj).f8792a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8792a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f8792a + ')';
    }
}
