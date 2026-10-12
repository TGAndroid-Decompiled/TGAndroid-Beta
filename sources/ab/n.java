package ab;
public final class n {
    public final String f441a;

    public n(String str) {
        this.f441a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.i.a(this.f441a, ((n) obj).f441a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f441a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f441a + ')';
    }
}
