package gd;
public final class b implements Comparable {
    public static final b f13817b = new b();
    public final int f13818a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.j.e(other, "other");
        return this.f13818a - other.f13818a;
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
        if (bVar != null && this.f13818a == bVar.f13818a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13818a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
