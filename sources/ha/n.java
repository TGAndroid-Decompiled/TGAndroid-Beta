package ha;
public final class n {
    public final String f10349a;

    public n(String str) {
        this.f10349a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.i.a(this.f10349a, ((n) obj).f10349a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10349a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f10349a + ')';
    }
}
