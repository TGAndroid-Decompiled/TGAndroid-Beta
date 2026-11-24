package defpackage;
public final class t90 extends i74 {
    public final s90 a;

    public t90(s90 s90Var) {
        this.a = s90Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i74) {
            return this.a.equals(((t90) ((i74) obj)).a);
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
