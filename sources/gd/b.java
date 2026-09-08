package gd;
public final class b implements Comparable {
    public static final b f10606b = new b();
    public final int f10607a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f10607a - other.f10607a;
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
        if (bVar != null && this.f10607a == bVar.f10607a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10607a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
