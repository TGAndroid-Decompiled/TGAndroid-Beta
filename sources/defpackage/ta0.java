package defpackage;
public final class ta0 extends r84 {
    public final sa0 a;

    public ta0(sa0 sa0Var) {
        this.a = sa0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r84) {
            return this.a.equals(((ta0) ((r84) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
