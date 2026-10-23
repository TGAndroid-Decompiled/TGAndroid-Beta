package i9;

import java.io.Serializable;
import v7.u6;
public final class a implements Serializable {
    public static final a f12766c = new a(new int[0]);
    public final int[] f12767a;
    public final int f12768b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f12767a = iArr;
        this.f12768b = length;
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            if (i11 < this.f12768b) {
                if (this.f12767a[i11] == i10) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return false;
        }
        return true;
    }

    public final int b(int i10) {
        u6.j(i10, this.f12768b);
        return this.f12767a[i10];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i10 = aVar.f12768b;
                int i11 = this.f12768b;
                if (i11 == i10) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (b(i12) == aVar.b(i12)) {
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
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12768b; i11++) {
            i10 = (i10 * 31) + this.f12767a[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f12768b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.f12767a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
