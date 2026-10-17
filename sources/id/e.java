package id;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f12773a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f12773a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f12773a, ((e) obj).f12773a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12773a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f12773a + ')';
    }
}
