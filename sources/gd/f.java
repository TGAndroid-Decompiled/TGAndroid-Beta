package gd;

import java.io.Serializable;
public final class f implements Serializable {
    public final Throwable f13476a;

    public f(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        this.f13476a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (kotlin.jvm.internal.j.a(this.f13476a, ((f) obj).f13476a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13476a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13476a + ')';
    }
}
