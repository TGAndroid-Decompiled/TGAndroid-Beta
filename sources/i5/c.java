package i5;
public final class c {
    public final String f12011a;

    public c(String str) {
        if (str != null) {
            this.f12011a = str;
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
        return this.f12011a.equals(((c) obj).f12011a);
    }

    public final int hashCode() {
        return this.f12011a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.t(new StringBuilder("Encoding{name=\""), this.f12011a, "\"}");
    }
}
