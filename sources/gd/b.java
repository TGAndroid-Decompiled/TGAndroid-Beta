package gd;
public final class b implements Comparable {
    public static final b f8738b = new b();
    public final int f8739a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f8739a - other.f8739a;
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
        if (bVar != null && this.f8739a == bVar.f8739a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8739a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
