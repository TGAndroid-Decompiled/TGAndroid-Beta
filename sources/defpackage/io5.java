package defpackage;

import java.io.Serializable;
public final class io5 implements Serializable {
    public static final io5 c = new io5(new int[0], 0);
    public final int[] a;
    public final int b;

    public io5(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    public static io5 c(int... iArr) {
        boolean z;
        if (iArr.length <= 2147483646) {
            z = true;
        } else {
            z = false;
        }
        jte.e("the total number of elements must fit in an int", z);
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new io5(iArr2, length);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            if (i2 < this.b) {
                if (this.a[i2] == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return false;
        }
        return true;
    }

    public final int b(int i) {
        jte.j(i, this.b);
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof io5) {
                io5 io5Var = (io5) obj;
                int i = io5Var.b;
                int i2 = this.b;
                if (i2 == i) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (b(i3) == io5Var.b(i3)) {
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
            i = (i * 31) + this.a[i2];
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
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
