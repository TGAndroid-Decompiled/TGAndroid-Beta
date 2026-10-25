package aa;
public final class x0 extends y1 {
    public final String f1225a;

    public x0(String str) {
        this.f1225a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            return this.f1225a.equals(((x0) ((y1) obj)).f1225a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1225a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Log{content="), this.f1225a, "}");
    }
}
