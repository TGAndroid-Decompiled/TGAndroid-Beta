package hd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f11084a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f11084a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f11084a, ((e) obj).f11084a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11084a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f11084a + ')';
    }
}
