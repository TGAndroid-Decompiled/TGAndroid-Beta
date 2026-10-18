package i5;
public final class c {
    public final String f12709a;

    public c(String str) {
        if (str != null) {
            this.f12709a = str;
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
        return this.f12709a.equals(((c) obj).f12709a);
    }

    public final int hashCode() {
        return this.f12709a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("Encoding{name=\""), this.f12709a, "\"}");
    }
}
