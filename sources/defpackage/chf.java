package defpackage;
public final class chf {
    public static final chf e = new chf(new int[0], new Object[0], false);
    public final int[] a;
    public final Object[] b;
    public int c = -1;
    public boolean d;

    public chf(int[] iArr, Object[] objArr, boolean z) {
        this.a = iArr;
        this.b = objArr;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof chf)) {
            return false;
        }
        chf chfVar = (chf) obj;
        return true;
    }

    public final int hashCode() {
        return 506991;
    }
}
