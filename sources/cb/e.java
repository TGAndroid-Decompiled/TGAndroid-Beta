package cb;

import kotlin.jvm.internal.i;
public final class e {
    public final String f6184a;

    public e(String str) {
        this.f6184a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f6184a, ((e) obj).f6184a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6184a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f6184a + ')';
    }
}
