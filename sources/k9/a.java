package k9;

import b8.zb;
import java.io.Serializable;
public final class a implements Serializable {
    public static final a f16905c = new a(new int[0]);
    public final int[] f16906a;
    public final int f16907b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f16906a = iArr;
        this.f16907b = length;
    }

    public final boolean a(int i3) {
        int i10 = 0;
        while (true) {
            if (i10 < this.f16907b) {
                if (this.f16906a[i10] == i3) {
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

    public final int b(int i3) {
        zb.j(i3, this.f16907b);
        return this.f16906a[i3];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i3 = aVar.f16907b;
                int i10 = this.f16907b;
                if (i10 == i3) {
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
        int i3 = 1;
        for (int i10 = 0; i10 < this.f16907b; i10++) {
            i3 = (i3 * 31) + this.f16906a[i10];
        }
        return i3;
    }

    public final String toString() {
        int i3 = this.f16907b;
        if (i3 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i3 * 5);
        sb2.append('[');
        int[] iArr = this.f16906a;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i3; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
