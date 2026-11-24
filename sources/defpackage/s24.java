package defpackage;
public final class s24 {
    public final String a;

    public s24(String str) {
        if (str != null) {
            this.a = str;
        } else {
            fvc.f("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s24)) {
            return false;
        }
        return this.a.equals(((s24) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return b00.j(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
