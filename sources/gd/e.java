package gd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f10610a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f10610a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f10610a, ((e) obj).f10610a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10610a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f10610a + ')';
    }
}
