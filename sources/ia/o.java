package ia;

public final class o {

    public final String f11061a;

    public o(String str) {
        this.f11061a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && kotlin.jvm.internal.j.a(this.f11061a, ((o) obj).f11061a);
    }

    public final int hashCode() {
        String str = this.f11061a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f11061a + ')';
    }
}
