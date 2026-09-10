package ab;

import kotlin.jvm.internal.i;
public final class e {
    public final String f373a;

    public e(String str) {
        this.f373a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f373a, ((e) obj).f373a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f373a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f373a + ')';
    }
}
