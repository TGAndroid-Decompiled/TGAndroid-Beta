package gd;

import java.io.Serializable;
public final class f implements Serializable {
    public final Throwable f13505a;

    public f(Throwable exception) {
        kotlin.jvm.internal.j.e(exception, "exception");
        this.f13505a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (kotlin.jvm.internal.j.a(this.f13505a, ((f) obj).f13505a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13505a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f13505a + ')';
    }
}
