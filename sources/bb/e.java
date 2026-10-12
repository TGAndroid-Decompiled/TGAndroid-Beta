package bb;

import kotlin.jvm.internal.i;
public final class e {
    public final String f2628a;

    public e(String str) {
        this.f2628a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f2628a, ((e) obj).f2628a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2628a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f2628a + ')';
    }
}
