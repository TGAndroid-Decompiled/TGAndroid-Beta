package eb;

import kotlin.jvm.internal.j;
public final class e {
    public final String f9930a;

    public e(String sessionId) {
        j.e(sessionId, "sessionId");
        this.f9930a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.f9930a, ((e) obj).f9930a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9930a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f9930a + ')';
    }
}
