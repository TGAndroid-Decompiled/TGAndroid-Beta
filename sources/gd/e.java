package gd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f9608a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f9608a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f9608a, ((e) obj).f9608a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9608a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f9608a + ')';
    }
}
