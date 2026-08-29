package ja;
public final class n {
    public final String f11384a;

    public n(String str) {
        this.f11384a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.j.a(this.f11384a, ((n) obj).f11384a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11384a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f11384a + ')';
    }
}
