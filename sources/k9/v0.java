package k9;
public final class v0 extends w1 {
    public final String f11023a;

    public v0(String str) {
        this.f11023a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f11023a.equals(((v0) ((w1) obj)).f11023a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11023a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("Log{content="), this.f11023a, "}");
    }
}
