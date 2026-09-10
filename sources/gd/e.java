package gd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f8742a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f8742a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f8742a, ((e) obj).f8742a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8742a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f8742a + ')';
    }
}
