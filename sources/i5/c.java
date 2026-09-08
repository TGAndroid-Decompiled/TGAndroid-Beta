package i5;
public final class c {
    public final String f11884a;

    public c(String str) {
        if (str != null) {
            this.f11884a = str;
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
        return this.f11884a.equals(((c) obj).f11884a);
    }

    public final int hashCode() {
        return this.f11884a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a4.a.s(new StringBuilder("Encoding{name=\""), this.f11884a, "\"}");
    }
}
