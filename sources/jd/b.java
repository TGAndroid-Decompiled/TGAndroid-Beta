package jd;
public final class b implements Comparable {
    public static final b f15569b = new b();
    public final int f15570a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f15570a - other.f15570a;
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
        if (bVar != null && this.f15570a == bVar.f15570a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15570a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
