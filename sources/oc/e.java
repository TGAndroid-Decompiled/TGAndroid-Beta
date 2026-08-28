package oc;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f19191a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f19191a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f19191a, ((e) obj).f19191a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19191a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f19191a + ')';
    }
}
