package la;
public final class m {
    public final String f11803a;

    public m(String str) {
        this.f11803a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.j.a(this.f11803a, ((m) obj).f11803a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11803a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f11803a + ')';
    }
}
