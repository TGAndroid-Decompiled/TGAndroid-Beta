package j9;

import a8.yb;
import java.io.Serializable;
public final class a implements Serializable {
    public static final a f15538c = new a(new int[0]);
    public final int[] f15539a;
    public final int f15540b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f15539a = iArr;
        this.f15540b = length;
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            if (i11 < this.f15540b) {
                if (this.f15539a[i11] == i10) {
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
        yb.j(i10, this.f15540b);
        return this.f15539a[i10];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i10 = aVar.f15540b;
                int i11 = this.f15540b;
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
        for (int i11 = 0; i11 < this.f15540b; i11++) {
            i10 = (i10 * 31) + this.f15539a[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f15540b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.f15539a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
