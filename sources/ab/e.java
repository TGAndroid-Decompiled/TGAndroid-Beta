package ab;

import kotlin.jvm.internal.i;
public final class e {
    public final String f403a;

    public e(String str) {
        this.f403a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f403a, ((e) obj).f403a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f403a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f403a + ')';
    }
}
