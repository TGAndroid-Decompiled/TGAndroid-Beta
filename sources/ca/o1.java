package ca;
public final class o1 extends s2 {
    public final String f4488a;

    public o1(String str) {
        this.f4488a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s2) {
            return this.f4488a.equals(((o1) ((s2) obj)).f4488a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4488a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("User{identifier="), this.f4488a, "}");
    }
}
