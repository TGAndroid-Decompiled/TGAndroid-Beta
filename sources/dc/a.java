package dc;

import java.util.Arrays;
public final class a implements Cloneable {
    public static final int[] f7615c = new int[0];
    public int f7617b = 0;
    public int[] f7616a = f7615c;

    public final void a(boolean z10) {
        c(this.f7617b + 1);
        if (z10) {
            int[] iArr = this.f7616a;
            int i10 = this.f7617b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f7617b++;
    }

    public final void b(int i10, int i11) {
        if (i11 >= 0 && i11 <= 32) {
            int i12 = this.f7617b;
            c(i12 + i11);
            for (int i13 = i11 - 1; i13 >= 0; i13--) {
                if (((1 << i13) & i10) != 0) {
                    int[] iArr = this.f7616a;
                    int i14 = i12 / 32;
                    iArr[i14] = iArr[i14] | (1 << (i12 & 31));
                }
                i12++;
            }
            this.f7617b = i12;
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public final void c(int i10) {
        if (i10 > this.f7616a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i10 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f7616a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f7616a = iArr;
        }
    }

    public final Object clone() {
        int i10 = this.f7617b;
        ?? obj = new Object();
        obj.f7616a = (int[]) this.f7616a.clone();
        obj.f7617b = i10;
        return obj;
    }

    public final boolean d(int i10) {
        if (((1 << (i10 & 31)) & this.f7616a[i10 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (this.f7617b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7617b != aVar.f7617b || !Arrays.equals(this.f7616a, aVar.f7616a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7616a) + (this.f7617b * 31);
    }

    public final String toString() {
        char c10;
        int i10 = this.f7617b;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f7617b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            if (d(i11)) {
                c10 = 'X';
            } else {
                c10 = '.';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }
}
