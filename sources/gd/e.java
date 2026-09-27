package gd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f9602a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f9602a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f9602a, ((e) obj).f9602a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9602a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f9602a + ')';
    }
}
