package hd;
public final class b implements Comparable {
    public static final b f11081b = new b();
    public final int f11082a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f11082a - other.f11082a;
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
        if (bVar != null && this.f11082a == bVar.f11082a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11082a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
