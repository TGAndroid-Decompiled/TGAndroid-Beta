package h9;

import java.io.Serializable;
import v7.t6;
public final class a implements Serializable {
    public static final int f10914c = 0;
    public final int[] f10915a;
    public final int f10916b;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.f10915a = iArr;
        this.f10916b = length;
    }

    public final boolean equals(Object obj) {
        a aVar;
        int i10;
        int i11;
        if (obj != this) {
            if ((obj instanceof a) && (i11 = this.f10916b) == (i10 = (aVar = (a) obj).f10916b)) {
                for (int i12 = 0; i12 < i11; i12++) {
                    t6.c(i12, i11);
                    int i13 = this.f10915a[i12];
                    t6.c(i12, i10);
                    if (i13 == aVar.f10915a[i12]) {
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
        for (int i11 = 0; i11 < this.f10916b; i11++) {
            i10 = (i10 * 31) + this.f10915a[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f10916b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.f10915a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
