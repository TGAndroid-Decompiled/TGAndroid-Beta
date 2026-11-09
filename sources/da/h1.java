package da;
public final class h1 extends m2 {
    public final String f8368a;

    public h1(String str) {
        this.f8368a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            return this.f8368a.equals(((h1) ((m2) obj)).f8368a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8368a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a8.p0.s(new StringBuilder("Log{content="), this.f8368a, "}");
    }
}
