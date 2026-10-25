package jd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f15574a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f15574a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f15574a, ((e) obj).f15574a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15574a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f15574a + ')';
    }
}
