package n5;
public final class r extends d0 {
    public final q f21394a;

    public r(q qVar) {
        this.f21394a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f21394a.equals(((r) ((d0) obj)).f21394a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21394a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f21394a + "}";
    }
}
