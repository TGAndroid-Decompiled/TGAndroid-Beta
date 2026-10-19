package ab;
public final class n {
    public final String f443a;

    public n(String str) {
        this.f443a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.i.a(this.f443a, ((n) obj).f443a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f443a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f443a + ')';
    }
}
