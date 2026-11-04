package dd;
public final class b implements Comparable {
    public static final b f8787b = new b();
    public final int f8788a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.j.e(other, "other");
        return this.f8788a - other.f8788a;
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
        if (bVar != null && this.f8788a == bVar.f8788a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8788a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
