package bb;

import kotlin.jvm.internal.i;
public final class e {
    public final String f4244a;

    public e(String str) {
        this.f4244a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f4244a, ((e) obj).f4244a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4244a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f4244a + ')';
    }
}
