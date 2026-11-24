package defpackage;
public final class djf {
    public static final djf e = new djf(new int[0], new Object[0], false);
    public final int[] a;
    public final Object[] b;
    public int c = -1;
    public boolean d;

    public djf(int[] iArr, Object[] objArr, boolean z) {
        this.a = iArr;
        this.b = objArr;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof djf)) {
            return false;
        }
        djf djfVar = (djf) obj;
        return true;
    }

    public final int hashCode() {
        return 506991;
    }
}
