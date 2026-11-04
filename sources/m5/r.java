package m5;
public final class r extends d0 {
    public final q f19155a;

    public r(q qVar) {
        this.f19155a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f19155a.equals(((r) ((d0) obj)).f19155a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19155a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f19155a + "}";
    }
}
