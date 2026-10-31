package bb;
public final class n {
    public final String f2602a;

    public n(String str) {
        this.f2602a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.i.a(this.f2602a, ((n) obj).f2602a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2602a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f2602a + ')';
    }
}
