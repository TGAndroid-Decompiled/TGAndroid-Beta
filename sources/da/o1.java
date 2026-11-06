package da;
public final class o1 extends s2 {
    public final String f8462a;

    public o1(String str) {
        this.f8462a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s2) {
            return this.f8462a.equals(((o1) ((s2) obj)).f8462a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8462a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a8.p0.s(new StringBuilder("User{identifier="), this.f8462a, "}");
    }
}
