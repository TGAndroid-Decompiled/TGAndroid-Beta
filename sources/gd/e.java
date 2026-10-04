package gd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f10446a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f10446a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f10446a, ((e) obj).f10446a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10446a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f10446a + ')';
    }
}
