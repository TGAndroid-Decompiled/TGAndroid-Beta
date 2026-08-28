package lb;

import java.util.Arrays;
public final class b implements Cloneable {
    public int f16735a;
    public int f16736b;
    public int f16737c;
    public int[] d;

    public b(int i9, int i10) {
        if (i9 >= 1 && i10 >= 1) {
            this.f16735a = i9;
            this.f16736b = i10;
            int i11 = (i9 + 31) / 32;
            this.f16737c = i11;
            this.d = new int[i11 * i10];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final void a(int i9, int i10) {
        int i11 = (i9 / 32) + (i10 * this.f16737c);
        int[] iArr = this.d;
        iArr[i11] = (1 << (i9 & 31)) ^ iArr[i11];
    }

    public final boolean b(int i9, int i10) {
        if (((this.d[(i9 / 32) + (i10 * this.f16737c)] >>> (i9 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void c(int i9, int i10, int i11, int i12) {
        if (i10 >= 0 && i9 >= 0) {
            if (i12 >= 1 && i11 >= 1) {
                int i13 = i11 + i9;
                int i14 = i12 + i10;
                if (i14 <= this.f16736b && i13 <= this.f16735a) {
                    while (i10 < i14) {
                        int i15 = this.f16737c * i10;
                        for (int i16 = i9; i16 < i13; i16++) {
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

    public final Object clone() {
        int i9 = this.f16735a;
        int i10 = this.f16736b;
        int i11 = this.f16737c;
        ?? obj = new Object();
        obj.f16735a = i9;
        obj.f16736b = i10;
        obj.f16737c = i11;
        obj.d = (int[]) this.d.clone();
        return obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f16735a != bVar.f16735a || this.f16736b != bVar.f16736b || this.f16737c != bVar.f16737c || !Arrays.equals(this.d, bVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9 = this.f16735a;
        return Arrays.hashCode(this.d) + (((((((i9 * 31) + i9) * 31) + this.f16736b) * 31) + this.f16737c) * 31);
    }

    public final String toString() {
        String str;
        int i9 = this.f16736b;
        int i10 = this.f16735a;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i9);
        for (int i11 = 0; i11 < i9; i11++) {
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
