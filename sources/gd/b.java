package gd;
public final class b implements Comparable {
    public static final b f9607b = new b();
    public final int f9608a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f9608a - other.f9608a;
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
        if (bVar != null && this.f9608a == bVar.f9608a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9608a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
