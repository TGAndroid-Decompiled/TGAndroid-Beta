package ab;
public final class n {
    public final String f444a;

    public n(String str) {
        this.f444a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.i.a(this.f444a, ((n) obj).f444a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f444a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f444a + ')';
    }
}
