package defpackage;
public final class v90 extends d84 {
    public final u90 a;

    public v90(u90 u90Var) {
        this.a = u90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d84) {
            return this.a.equals(((v90) ((d84) obj)).a);
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
