package l9;

import a8.la;
import java.io.Serializable;
public final class a implements Serializable {
    public static final a f19731c = new a(new int[0]);
    public final int[] f19732a;
    public final int f19733b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f19732a = iArr;
        this.f19733b = length;
    }

    public final boolean a(int i7) {
        int i10 = 0;
        while (true) {
            if (i10 < this.f19733b) {
                if (this.f19732a[i10] == i7) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    public final int b(int i7) {
        la.j(i7, this.f19733b);
        return this.f19732a[i7];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i7 = aVar.f19733b;
                int i10 = this.f19733b;
                if (i10 == i7) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (b(i11) == aVar.b(i11)) {
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
        int i7 = 1;
        for (int i10 = 0; i10 < this.f19733b; i10++) {
            i7 = (i7 * 31) + this.f19732a[i10];
        }
        return i7;
    }

    public final String toString() {
        int i7 = this.f19733b;
        if (i7 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i7 * 5);
        sb2.append('[');
        int[] iArr = this.f19732a;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i7; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
