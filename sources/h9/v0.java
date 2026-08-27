package h9;

public final class v0 extends w1 {

    public final String f8839a;

    public v0(String str) {
        this.f8839a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        return this.f8839a.equals(((v0) ((w1) obj)).f8839a);
    }

    public final int hashCode() {
        return this.f8839a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a9.p.p(new StringBuilder("Log{content="), this.f8839a, "}");
    }
}
