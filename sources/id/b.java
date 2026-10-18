package id;
public final class b implements Comparable {
    public static final b f12767b = new b();
    public final int f12768a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f12768a - other.f12768a;
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
        if (bVar != null && this.f12768a == bVar.f12768a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12768a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
