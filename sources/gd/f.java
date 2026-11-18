package gd;

import java.io.Serializable;
public final class f implements Serializable {
    public final Throwable f13479a;

    public f(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        this.f13479a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (kotlin.jvm.internal.j.a(this.f13479a, ((f) obj).f13479a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13479a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13479a + ')';
    }
}
