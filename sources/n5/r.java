package n5;
public final class r extends d0 {
    public final q f20464a;

    public r(q qVar) {
        this.f20464a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f20464a.equals(((r) ((d0) obj)).f20464a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20464a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f20464a + "}";
    }
}
