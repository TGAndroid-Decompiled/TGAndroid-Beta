package gd;
public final class b implements Comparable {
    public static final b f13159b = new b();
    public final int f13160a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.j.e(other, "other");
        return this.f13160a - other.f13160a;
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
        if (bVar != null && this.f13160a == bVar.f13160a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13160a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
