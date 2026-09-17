package i5;
public final class c {
    public final String f11858a;

    public c(String str) {
        if (str != null) {
            this.f11858a = str;
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
        return this.f11858a.equals(((c) obj).f11858a);
    }

    public final int hashCode() {
        return this.f11858a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a4.a.s(new StringBuilder("Encoding{name=\""), this.f11858a, "\"}");
    }
}
