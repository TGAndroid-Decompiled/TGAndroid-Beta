package la;
public final class m {
    public final String f11913a;

    public m(String str) {
        this.f11913a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m) && kotlin.jvm.internal.j.a(this.f11913a, ((m) obj).f11913a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11913a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f11913a + ')';
    }
}
