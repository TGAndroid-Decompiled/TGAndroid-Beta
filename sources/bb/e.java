package bb;

import kotlin.jvm.internal.i;
public final class e {
    public final String f2632a;

    public e(String str) {
        this.f2632a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f2632a, ((e) obj).f2632a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2632a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f2632a + ')';
    }
}
