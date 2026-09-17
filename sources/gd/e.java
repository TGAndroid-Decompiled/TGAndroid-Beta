package gd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Throwable f10582a;

    public e(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        this.f10582a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (kotlin.jvm.internal.i.a(this.f10582a, ((e) obj).f10582a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10582a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f10582a + ')';
    }
}
