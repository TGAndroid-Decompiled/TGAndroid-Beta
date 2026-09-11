package ab;

import kotlin.jvm.internal.i;
public final class e {
    public final String f390a;

    public e(String str) {
        this.f390a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f390a, ((e) obj).f390a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f390a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f390a + ')';
    }
}
