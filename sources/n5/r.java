package n5;
public final class r extends d0 {
    public final q f21493a;

    public r(q qVar) {
        this.f21493a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f21493a.equals(((r) ((d0) obj)).f21493a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21493a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f21493a + "}";
    }
}
