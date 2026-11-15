package hb;

import kotlin.jvm.internal.j;
public final class e {
    public final String f13811a;

    public e(String sessionId) {
        j.e(sessionId, "sessionId");
        this.f13811a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.f13811a, ((e) obj).f13811a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13811a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f13811a + ')';
    }
}
