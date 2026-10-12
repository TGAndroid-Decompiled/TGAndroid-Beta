package ab;

import kotlin.jvm.internal.i;
public final class e {
    public final String f405a;

    public e(String str) {
        this.f405a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f405a, ((e) obj).f405a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f405a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f405a + ')';
    }
}
