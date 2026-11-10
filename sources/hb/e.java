package hb;

import kotlin.jvm.internal.j;
public final class e {
    public final String f14456a;

    public e(String sessionId) {
        j.e(sessionId, "sessionId");
        this.f14456a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.f14456a, ((e) obj).f14456a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14456a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f14456a + ')';
    }
}
