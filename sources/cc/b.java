package cc;

import java.util.Arrays;
public final class b implements Cloneable {
    public int f6042a;
    public int f6043b;
    public int f6044c;
    public int[] d;

    public b(int i7, int i10) {
        if (i7 >= 1 && i10 >= 1) {
            this.f6042a = i7;
            this.f6043b = i10;
            int i11 = (i7 + 31) / 32;
            this.f6044c = i11;
            this.d = new int[i11 * i10];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final void a(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.f6044c);
        int[] iArr = this.d;
        iArr[i11] = (1 << (i7 & 31)) ^ iArr[i11];
    }

    public final boolean b(int i7, int i10) {
        if (((this.d[(i7 / 32) + (i10 * this.f6044c)] >>> (i7 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void c(int i7, int i10) {
        int i11 = (i7 / 32) + (i10 * this.f6044c);
        int[] iArr = this.d;
        iArr[i11] = (1 << (i7 & 31)) | iArr[i11];
    }

    public final Object clone() {
        int i7 = this.f6042a;
        int i10 = this.f6043b;
        int i11 = this.f6044c;
        ?? obj = new Object();
        obj.f6042a = i7;
        obj.f6043b = i10;
        obj.f6044c = i11;
        obj.d = (int[]) this.d.clone();
        return obj;
    }

    public final void d(int i7, int i10, int i11, int i12) {
        if (i10 >= 0 && i7 >= 0) {
            if (i12 >= 1 && i11 >= 1) {
                int i13 = i11 + i7;
                int i14 = i12 + i10;
                if (i14 <= this.f6043b && i13 <= this.f6042a) {
                    while (i10 < i14) {
                        int i15 = this.f6044c * i10;
                        for (int i16 = i7; i16 < i13; i16++) {
                            int[] iArr = this.d;
                            int i17 = (i16 / 32) + i15;
                            iArr[i17] = iArr[i17] | (1 << (i16 & 31));
                        }
                        i10++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f6042a != bVar.f6042a || this.f6043b != bVar.f6043b || this.f6044c != bVar.f6044c || !Arrays.equals(this.d, bVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f6042a;
        return Arrays.hashCode(this.d) + (((((((i7 * 31) + i7) * 31) + this.f6043b) * 31) + this.f6044c) * 31);
    }

    public final String toString() {
        String str;
        int i7 = this.f6043b;
        int i10 = this.f6042a;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i7);
        for (int i11 = 0; i11 < i7; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (b(i12, i11)) {
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
