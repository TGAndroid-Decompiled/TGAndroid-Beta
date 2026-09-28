package i5;
public final class c {
    public final String f10982a;

    public c(String str) {
        if (str != null) {
            this.f10982a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f10982a.equals(((c) obj).f10982a);
    }

    public final int hashCode() {
        return this.f10982a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a4.a.t(new StringBuilder("Encoding{name=\""), this.f10982a, "\"}");
    }
}
