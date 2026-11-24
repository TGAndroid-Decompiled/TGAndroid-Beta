package defpackage;
public final class l90 extends fz2 {
    public final String a;

    public l90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fz2) {
            return this.a.equals(((l90) ((fz2) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return b00.j(new StringBuilder("User{identifier="), this.a, "}");
    }
}
