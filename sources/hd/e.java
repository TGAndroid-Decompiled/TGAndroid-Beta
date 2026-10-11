package hd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f11085a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f11085a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f11085a, ((e) obj).f11085a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11085a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f11085a + ')';
    }
}
