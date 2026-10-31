package cb;

import kotlin.jvm.internal.i;
public final class e {
    public final String f4100a;

    public e(String str) {
        this.f4100a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f4100a, ((e) obj).f4100a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4100a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f4100a + ')';
    }
}
