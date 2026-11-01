package i9;

import java.io.Serializable;
import v7.t6;
public final class a implements Serializable {
    public static final a f8233c = new a(new int[0]);
    public final int[] f8234a;
    public final int f8235b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f8234a = iArr;
        this.f8235b = length;
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            if (i11 < this.f8235b) {
                if (this.f8234a[i11] == i10) {
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
        t6.j(i10, this.f8235b);
        return this.f8234a[i10];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i10 = aVar.f8235b;
                int i11 = this.f8235b;
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
        for (int i11 = 0; i11 < this.f8235b; i11++) {
            i10 = (i10 * 31) + this.f8234a[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f8235b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.f8234a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
