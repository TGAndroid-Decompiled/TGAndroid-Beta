package hb;

import kotlin.jvm.internal.j;
public final class e {
    public final String f14120a;

    public e(String sessionId) {
        j.e(sessionId, "sessionId");
        this.f14120a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.f14120a, ((e) obj).f14120a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14120a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f14120a + ')';
    }
}
