package n5;
public final class r extends d0 {
    public final q f20467a;

    public r(q qVar) {
        this.f20467a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f20467a.equals(((r) ((d0) obj)).f20467a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20467a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f20467a + "}";
    }
}
