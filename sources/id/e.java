package id;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f11384a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f11384a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f11384a, ((e) obj).f11384a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11384a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f11384a + ')';
    }
}
