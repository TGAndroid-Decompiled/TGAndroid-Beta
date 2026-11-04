package ca;
public final class h1 extends m2 {
    public final String f4396a;

    public h1(String str) {
        this.f4396a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            return this.f4396a.equals(((h1) ((m2) obj)).f4396a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4396a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Log{content="), this.f4396a, "}");
    }
}
