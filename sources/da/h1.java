package da;
public final class h1 extends m2 {
    public final String f8071a;

    public h1(String str) {
        this.f8071a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            return this.f8071a.equals(((h1) ((m2) obj)).f8071a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8071a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a8.p0.s(new StringBuilder("Log{content="), this.f8071a, "}");
    }
}
