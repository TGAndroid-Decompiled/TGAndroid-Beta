package jd;
public final class b implements Comparable {
    public static final b f15570b = new b();
    public final int f15571a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f15571a - other.f15571a;
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
        if (bVar != null && this.f15571a == bVar.f15571a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15571a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
