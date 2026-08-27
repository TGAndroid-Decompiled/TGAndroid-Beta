package mb;

import java.util.Arrays;

public final class b implements Cloneable {

    public int f17919a;

    public int f17920b;

    public int f17921c;
    public int[] d;

    public b(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f17919a = i10;
        this.f17920b = i11;
        int i12 = (i10 + 31) / 32;
        this.f17921c = i12;
        this.d = new int[i12 * i11];
    }

    public final void a(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f17921c);
        int[] iArr = this.d;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public final boolean b(int i10, int i11) {
        return ((this.d[(i10 / 32) + (i11 * this.f17921c)] >>> (i10 & 31)) & 1) != 0;
    }

    public final void c(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f17920b || i14 > this.f17919a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f17921c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public final Object clone() {
        int i10 = this.f17919a;
        int i11 = this.f17920b;
        int i12 = this.f17921c;
        int[] iArr = (int[]) this.d.clone();
        b bVar = new b();
        bVar.f17919a = i10;
        bVar.f17920b = i11;
        bVar.f17921c = i12;
        bVar.d = iArr;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17919a == bVar.f17919a && this.f17920b == bVar.f17920b && this.f17921c == bVar.f17921c && Arrays.equals(this.d, bVar.d);
    }

    public final int hashCode() {
        int i10 = this.f17919a;
        return Arrays.hashCode(this.d) + (((((((i10 * 31) + i10) * 31) + this.f17920b) * 31) + this.f17921c) * 31);
    }

    public final String toString() {
        int i10 = this.f17920b;
        int i11 = this.f17919a;
        StringBuilder sb2 = new StringBuilder((i11 + 1) * i10);
        for (int i12 = 0; i12 < i10; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                sb2.append(b(i13, i12) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
