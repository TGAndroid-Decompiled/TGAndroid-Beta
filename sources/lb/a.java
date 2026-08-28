package lb;

import java.util.Arrays;
public final class a implements Cloneable {
    public static final int[] f16732c = new int[0];
    public int f16734b = 0;
    public int[] f16733a = f16732c;

    public final void a(boolean z10) {
        c(this.f16734b + 1);
        if (z10) {
            int[] iArr = this.f16733a;
            int i9 = this.f16734b;
            int i10 = i9 / 32;
            iArr[i10] = (1 << (i9 & 31)) | iArr[i10];
        }
        this.f16734b++;
    }

    public final void b(int i9, int i10) {
        if (i10 >= 0 && i10 <= 32) {
            int i11 = this.f16734b;
            c(i11 + i10);
            for (int i12 = i10 - 1; i12 >= 0; i12--) {
                if (((1 << i12) & i9) != 0) {
                    int[] iArr = this.f16733a;
                    int i13 = i11 / 32;
                    iArr[i13] = iArr[i13] | (1 << (i11 & 31));
                }
                i11++;
            }
            this.f16734b = i11;
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i9) {
        if (i9 > this.f16733a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i9 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f16733a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f16733a = iArr;
        }
    }

    public final Object clone() {
        int i9 = this.f16734b;
        ?? obj = new Object();
        obj.f16733a = (int[]) this.f16733a.clone();
        obj.f16734b = i9;
        return obj;
    }

    public final boolean d(int i9) {
        if (((1 << (i9 & 31)) & this.f16733a[i9 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (this.f16734b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f16734b != aVar.f16734b || !Arrays.equals(this.f16733a, aVar.f16733a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16733a) + (this.f16734b * 31);
    }

    public final String toString() {
        char c10;
        int i9 = this.f16734b;
        StringBuilder sb2 = new StringBuilder((i9 / 8) + i9 + 1);
        for (int i10 = 0; i10 < this.f16734b; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            if (d(i10)) {
                c10 = 'X';
            } else {
                c10 = '.';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }
}
