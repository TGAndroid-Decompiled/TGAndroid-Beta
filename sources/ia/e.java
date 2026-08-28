package ia;

import kotlin.jvm.internal.i;
public final class e {
    public final String f11077a;

    public e(String str) {
        this.f11077a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && i.a(this.f11077a, ((e) obj).f11077a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11077a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f11077a + ')';
    }
}
