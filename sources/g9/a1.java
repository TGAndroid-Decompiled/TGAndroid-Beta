package g9;
public final class a1 extends c2 {
    public final String f7458a;

    public a1(String str) {
        this.f7458a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            return this.f7458a.equals(((a1) ((c2) obj)).f7458a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7458a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return aa.d.r(new StringBuilder("User{identifier="), this.f7458a, "}");
    }
}
