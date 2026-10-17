package id;
public final class b implements Comparable {
    public static final b f12769b = new b();
    public final int f12770a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f12770a - other.f12770a;
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
        if (bVar != null && this.f12770a == bVar.f12770a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12770a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
