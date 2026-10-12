package id;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f11380a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f11380a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f11380a, ((e) obj).f11380a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11380a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f11380a + ')';
    }
}
