package n5;
public final class r extends d0 {
    public final q f21425a;

    public r(q qVar) {
        this.f21425a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f21425a.equals(((r) ((d0) obj)).f21425a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21425a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f21425a + "}";
    }
}
