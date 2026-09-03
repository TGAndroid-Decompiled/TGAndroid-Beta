package ma;

import kotlin.jvm.internal.j;
public final class e {
    public final String f13883a;

    public e(String str) {
        this.f13883a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.f13883a, ((e) obj).f13883a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13883a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f13883a + ')';
    }
}
