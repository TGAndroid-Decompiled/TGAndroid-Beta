package k9;
public final class v0 extends w1 {
    public final String f10259a;

    public v0(String str) {
        this.f10259a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            return this.f10259a.equals(((v0) ((w1) obj)).f10259a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10259a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("Log{content="), this.f10259a, "}");
    }
}
