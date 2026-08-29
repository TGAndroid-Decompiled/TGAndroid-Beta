package i9;
public final class v0 extends w1 {
    public final String f8803a;

    public v0(String str) {
        this.f8803a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f8803a.equals(((v0) ((w1) obj)).f8803a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8803a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a4.w.q(new StringBuilder("Log{content="), this.f8803a, "}");
    }
}
