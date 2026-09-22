package ab;

import kotlin.jvm.internal.i;
public final class e {
    public final String f374a;

    public e(String str) {
        this.f374a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f374a, ((e) obj).f374a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f374a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f374a + ')';
    }
}
