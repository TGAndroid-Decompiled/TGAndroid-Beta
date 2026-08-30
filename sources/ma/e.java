package ma;

import kotlin.jvm.internal.j;
public final class e {
    public final String f13899a;

    public e(String str) {
        this.f13899a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.f13899a, ((e) obj).f13899a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13899a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f13899a + ')';
    }
}
