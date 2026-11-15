package cc;

import java.util.Arrays;
public final class a implements Cloneable {
    public static final int[] f4869c = new int[0];
    public int f4871b = 0;
    public int[] f4870a = f4869c;

    public final void a(boolean z10) {
        c(this.f4871b + 1);
        if (z10) {
            int[] iArr = this.f4870a;
            int i7 = this.f4871b;
            int i10 = i7 / 32;
            iArr[i10] = (1 << (i7 & 31)) | iArr[i10];
        }
        this.f4871b++;
    }

    public final void b(int i7, int i10) {
        if (i10 >= 0 && i10 <= 32) {
            int i11 = this.f4871b;
            c(i11 + i10);
            for (int i12 = i10 - 1; i12 >= 0; i12--) {
                if (((1 << i12) & i7) != 0) {
                    int[] iArr = this.f4870a;
                    int i13 = i11 / 32;
                    iArr[i13] = iArr[i13] | (1 << (i11 & 31));
                }
                i11++;
            }
            this.f4871b = i11;
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i7) {
        if (i7 > this.f4870a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i7 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f4870a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f4870a = iArr;
        }
    }

    public final Object clone() {
        int i7 = this.f4871b;
        ?? obj = new Object();
        obj.f4870a = (int[]) this.f4870a.clone();
        obj.f4871b = i7;
        return obj;
    }

    public final boolean d(int i7) {
        if (((1 << (i7 & 31)) & this.f4870a[i7 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (this.f4871b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4871b != aVar.f4871b || !Arrays.equals(this.f4870a, aVar.f4870a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4870a) + (this.f4871b * 31);
    }

    public final String toString() {
        char c10;
        int i7 = this.f4871b;
        StringBuilder sb2 = new StringBuilder((i7 / 8) + i7 + 1);
        for (int i10 = 0; i10 < this.f4871b; i10++) {
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
