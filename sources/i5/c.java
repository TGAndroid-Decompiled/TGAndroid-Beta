package i5;
public final class c {
    public final String f12012a;

    public c(String str) {
        if (str != null) {
            this.f12012a = str;
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
        return this.f12012a.equals(((c) obj).f12012a);
    }

    public final int hashCode() {
        return this.f12012a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.t(new StringBuilder("Encoding{name=\""), this.f12012a, "\"}");
    }
}
