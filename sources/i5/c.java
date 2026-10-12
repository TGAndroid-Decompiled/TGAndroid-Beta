package i5;
public final class c {
    public final String f11318a;

    public c(String str) {
        if (str != null) {
            this.f11318a = str;
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
        return this.f11318a.equals(((c) obj).f11318a);
    }

    public final int hashCode() {
        return this.f11318a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Encoding{name=\""), this.f11318a, "\"}");
    }
}
