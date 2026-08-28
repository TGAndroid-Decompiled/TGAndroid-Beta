package g9;
public final class v0 extends w1 {
    public final String f7668a;

    public v0(String str) {
        this.f7668a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f7668a.equals(((v0) ((w1) obj)).f7668a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7668a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return aa.d.r(new StringBuilder("Log{content="), this.f7668a, "}");
    }
}
