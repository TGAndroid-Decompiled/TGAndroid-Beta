package i5;
public final class c {
    public final String f8206a;

    public c(String str) {
        if (str != null) {
            this.f8206a = str;
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
        return this.f8206a.equals(((c) obj).f8206a);
    }

    public final int hashCode() {
        return this.f8206a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.r(new StringBuilder("Encoding{name=\""), this.f8206a, "\"}");
    }
}
