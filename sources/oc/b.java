package oc;
public final class b implements Comparable {
    public static final b f19187b = new b();
    public final int f19188a = 131348;

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f19188a - other.f19188a;
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
        if (bVar != null && this.f19188a == bVar.f19188a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19188a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
