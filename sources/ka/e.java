package ka;

import kotlin.jvm.internal.j;
public final class e {
    public final String f13600a;

    public e(String str) {
        this.f13600a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.f13600a, ((e) obj).f13600a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13600a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f13600a + ')';
    }
}
