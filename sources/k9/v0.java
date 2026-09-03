package k9;
public final class v0 extends w1 {
    public final String f10239a;

    public v0(String str) {
        this.f10239a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f10239a.equals(((v0) ((w1) obj)).f10239a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10239a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("Log{content="), this.f10239a, "}");
    }
}
