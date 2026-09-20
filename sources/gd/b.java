package gd;
public final class b implements Comparable {
    public static final b f9611b = new b();
    public final int f9612a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f9612a - other.f9612a;
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
        if (bVar != null && this.f9612a == bVar.f9612a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9612a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
