package ja;

import kotlin.jvm.internal.j;

public final class e {

    public final String f12879a;

    public e(String str) {
        this.f12879a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j.a(this.f12879a, ((e) obj).f12879a);
    }

    public final int hashCode() {
        return this.f12879a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f12879a + ')';
    }
}
