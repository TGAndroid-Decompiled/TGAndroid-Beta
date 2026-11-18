package n5;
public final class r extends d0 {
    public final q f21400a;

    public r(q qVar) {
        this.f21400a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f21400a.equals(((r) ((d0) obj)).f21400a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21400a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f21400a + "}";
    }
}
