package ab;

import kotlin.jvm.internal.i;
public final class e {
    public final String f375a;

    public e(String str) {
        this.f375a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f375a, ((e) obj).f375a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f375a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f375a + ')';
    }
}
