package hb;

import kotlin.jvm.internal.j;
public final class e {
    public final String f14157a;

    public e(String sessionId) {
        j.e(sessionId, "sessionId");
        this.f14157a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.f14157a, ((e) obj).f14157a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14157a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f14157a + ')';
    }
}
