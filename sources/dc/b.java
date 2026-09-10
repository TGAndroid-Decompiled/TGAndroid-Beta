package dc;

import java.util.Arrays;
public final class b implements Cloneable {
    public int f6389a;
    public int f6390b;
    public int f6391c;
    public int[] d;

    public b(int i10, int i11) {
        if (i10 >= 1 && i11 >= 1) {
            this.f6389a = i10;
            this.f6390b = i11;
            int i12 = (i10 + 31) / 32;
            this.f6391c = i12;
            this.d = new int[i12 * i11];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final void a(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f6391c);
        int[] iArr = this.d;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public final boolean b(int i10, int i11) {
        if (((this.d[(i10 / 32) + (i11 * this.f6391c)] >>> (i10 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void c(int i10, int i11, int i12, int i13) {
        if (i11 >= 0 && i10 >= 0) {
            if (i13 >= 1 && i12 >= 1) {
                int i14 = i12 + i10;
                int i15 = i13 + i11;
                if (i15 <= this.f6390b && i14 <= this.f6389a) {
                    while (i11 < i15) {
                        int i16 = this.f6391c * i11;
                        for (int i17 = i10; i17 < i14; i17++) {
                            int[] iArr = this.d;
                            int i18 = (i17 / 32) + i16;
                            iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                        }
                        i11++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public final Object clone() {
        int i10 = this.f6389a;
        int i11 = this.f6390b;
        int i12 = this.f6391c;
        ?? obj = new Object();
        obj.f6389a = i10;
        obj.f6390b = i11;
        obj.f6391c = i12;
        obj.d = (int[]) this.d.clone();
        return obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f6389a != bVar.f6389a || this.f6390b != bVar.f6390b || this.f6391c != bVar.f6391c || !Arrays.equals(this.d, bVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f6389a;
        return Arrays.hashCode(this.d) + (((((((i10 * 31) + i10) * 31) + this.f6390b) * 31) + this.f6391c) * 31);
    }

    public final String toString() {
        String str;
        int i10 = this.f6390b;
        int i11 = this.f6389a;
        StringBuilder sb2 = new StringBuilder((i11 + 1) * i10);
        for (int i12 = 0; i12 < i10; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                if (b(i13, i12)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb2.append(str);
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
