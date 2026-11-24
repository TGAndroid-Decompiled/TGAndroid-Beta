package defpackage;

import java.io.Serializable;
public final class om5 implements Serializable {
    public static final om5 c = new om5(0, new long[0]);
    public final long[] a;
    public final int b;

    public om5(int i, long[] jArr) {
        this.a = jArr;
        this.b = i;
    }

    public final long a(int i) {
        gre.j(i, this.b);
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof om5) {
                om5 om5Var = (om5) obj;
                int i = om5Var.b;
                int i2 = this.b;
                if (i2 == i) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (a(i3) == om5Var.a(i3)) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + zne.b(this.a[i2]);
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.a;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
