package hd;
public final class b implements Comparable {
    public static final b f11082b = new b();
    public final int f11083a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f11083a - other.f11083a;
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
        if (bVar != null && this.f11083a == bVar.f11083a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11083a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
