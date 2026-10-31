package ad;

import java.io.Serializable;
public final class f implements Serializable {
    public final Throwable f395a;

    public f(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f395a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (kotlin.jvm.internal.i.a(this.f395a, ((f) obj).f395a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f395a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f395a + ')';
    }
}
