package la;
public final class m {
    public final String f12220a;

    public m(String str) {
        this.f12220a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.j.a(this.f12220a, ((m) obj).f12220a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12220a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f12220a + ')';
    }
}
