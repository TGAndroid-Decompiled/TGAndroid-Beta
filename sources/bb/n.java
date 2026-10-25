package bb;
public final class n {
    public final String f3801a;

    public n(String str) {
        this.f3801a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.i.a(this.f3801a, ((n) obj).f3801a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3801a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f3801a + ')';
    }
}
