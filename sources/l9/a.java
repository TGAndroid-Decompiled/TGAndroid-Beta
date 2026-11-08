package l9;

import a8.ia;
import java.io.Serializable;
public final class a implements Serializable {
    public static final a f18203c = new a(new int[0]);
    public final int[] f18204a;
    public final int f18205b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f18204a = iArr;
        this.f18205b = length;
    }

    public final boolean a(int i7) {
        int i10 = 0;
        while (true) {
            if (i10 < this.f18205b) {
                if (this.f18204a[i10] == i7) {
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
        ia.j(i7, this.f18205b);
        return this.f18204a[i7];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i7 = aVar.f18205b;
                int i10 = this.f18205b;
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
        for (int i10 = 0; i10 < this.f18205b; i10++) {
            i7 = (i7 * 31) + this.f18204a[i10];
        }
        return i7;
    }

    public final String toString() {
        int i7 = this.f18205b;
        if (i7 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i7 * 5);
        sb2.append('[');
        int[] iArr = this.f18204a;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i7; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
