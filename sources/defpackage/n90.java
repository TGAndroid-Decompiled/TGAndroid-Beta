package defpackage;
public final class n90 extends a03 {
    public final String a;

    public n90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a03) {
            return this.a.equals(((n90) ((a03) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return c00.k(new StringBuilder("User{identifier="), this.a, "}");
    }
}
