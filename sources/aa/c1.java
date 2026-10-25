package aa;
public final class c1 extends e2 {
    public final String f1049a;

    public c1(String str) {
        this.f1049a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            return this.f1049a.equals(((c1) ((e2) obj)).f1049a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1049a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("User{identifier="), this.f1049a, "}");
    }
}
