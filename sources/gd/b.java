package gd;
public final class b implements Comparable {
    public static final b f13474b = new b();
    public final int f13475a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.j.e(other, "other");
        return this.f13475a - other.f13475a;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        if (bVar != null && this.f13475a == bVar.f13475a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13475a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
