package n5;
public final class r extends d0 {
    public final q f21036a;

    public r(q qVar) {
        this.f21036a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f21036a.equals(((r) ((d0) obj)).f21036a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21036a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f21036a + "}";
    }
}
