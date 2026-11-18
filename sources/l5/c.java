package l5;

import a8.p0;
public final class c {
    public final String f19671a;

    public c(String str) {
        if (str != null) {
            this.f19671a = str;
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
        return this.f19671a.equals(((c) obj).f19671a);
    }

    public final int hashCode() {
        return this.f19671a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return p0.s(new StringBuilder("Encoding{name=\""), this.f19671a, "\"}");
    }
}
