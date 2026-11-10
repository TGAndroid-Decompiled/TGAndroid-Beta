package n5;
public final class r extends d0 {
    public final q f20472a;

    public r(q qVar) {
        this.f20472a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f20472a.equals(((r) ((d0) obj)).f20472a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20472a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f20472a + "}";
    }
}
