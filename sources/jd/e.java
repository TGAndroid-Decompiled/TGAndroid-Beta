package jd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f15573a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f15573a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f15573a, ((e) obj).f15573a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15573a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f15573a + ')';
    }
}
