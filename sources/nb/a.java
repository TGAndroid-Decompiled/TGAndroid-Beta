package nb;

import java.util.Arrays;
public final class a implements Cloneable {
    public static final int[] f17199c = new int[0];
    public int f17201b = 0;
    public int[] f17200a = f17199c;

    public final void a(boolean z10) {
        c(this.f17201b + 1);
        if (z10) {
            int[] iArr = this.f17200a;
            int i10 = this.f17201b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f17201b++;
    }

    public final void b(int i10, int i11) {
        if (i11 >= 0 && i11 <= 32) {
            int i12 = this.f17201b;
            c(i12 + i11);
            for (int i13 = i11 - 1; i13 >= 0; i13--) {
                if (((1 << i13) & i10) != 0) {
                    int[] iArr = this.f17200a;
                    int i14 = i12 / 32;
                    iArr[i14] = iArr[i14] | (1 << (i12 & 31));
                }
                i12++;
            }
            this.f17201b = i12;
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i10) {
        if (i10 > this.f17200a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i10 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f17200a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f17200a = iArr;
        }
    }

    public final Object clone() {
        int i10 = this.f17201b;
        ?? obj = new Object();
        obj.f17200a = (int[]) this.f17200a.clone();
        obj.f17201b = i10;
        return obj;
    }

    public final boolean d(int i10) {
        if (((1 << (i10 & 31)) & this.f17200a[i10 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (this.f17201b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f17201b != aVar.f17201b || !Arrays.equals(this.f17200a, aVar.f17200a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17200a) + (this.f17201b * 31);
    }

    public final String toString() {
        char c3;
        int i10 = this.f17201b;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f17201b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            if (d(i11)) {
                c3 = 'X';
            } else {
                c3 = '.';
            }
            sb2.append(c3);
        }
        return sb2.toString();
    }
}
