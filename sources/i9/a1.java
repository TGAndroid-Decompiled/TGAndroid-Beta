package i9;
public final class a1 extends c2 {
    public final String f8593a;

    public a1(String str) {
        this.f8593a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return this.f8593a.equals(((a1) ((c2) obj)).f8593a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8593a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a4.w.q(new StringBuilder("User{identifier="), this.f8593a, "}");
    }
}
