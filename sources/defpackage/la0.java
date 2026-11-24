package defpackage;
public final class la0 extends q03 {
    public final String a;

    public la0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q03) {
            return this.a.equals(((la0) ((q03) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return b10.j(new StringBuilder("User{identifier="), this.a, "}");
    }
}
