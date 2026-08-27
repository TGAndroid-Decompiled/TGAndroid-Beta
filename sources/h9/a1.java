package h9;

public final class a1 extends c2 {

    public final String f8629a;

    public a1(String str) {
        this.f8629a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        return this.f8629a.equals(((a1) ((c2) obj)).f8629a);
    }

    public final int hashCode() {
        return this.f8629a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a9.p.p(new StringBuilder("User{identifier="), this.f8629a, "}");
    }
}
