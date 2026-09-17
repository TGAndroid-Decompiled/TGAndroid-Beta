package ab;

import kotlin.jvm.internal.i;
public final class e {
    public final String f402a;

    public e(String str) {
        this.f402a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f402a, ((e) obj).f402a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f402a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f402a + ')';
    }
}
