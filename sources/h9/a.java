package h9;

import java.io.Serializable;
import v7.u6;
public final class a implements Serializable {
    public static final int f10137c = 0;
    public final int[] f10138a;
    public final int f10139b;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.f10138a = iArr;
        this.f10139b = length;
    }

    public final boolean equals(Object obj) {
        a aVar;
        int i10;
        int i11;
        if (obj != this) {
            if ((obj instanceof a) && (i11 = this.f10139b) == (i10 = (aVar = (a) obj).f10139b)) {
                for (int i12 = 0; i12 < i11; i12++) {
                    u6.c(i12, i11);
                    int i13 = this.f10138a[i12];
                    u6.c(i12, i10);
                    if (i13 == aVar.f10138a[i12]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f10139b; i11++) {
            i10 = (i10 * 31) + this.f10138a[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f10139b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.f10138a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
