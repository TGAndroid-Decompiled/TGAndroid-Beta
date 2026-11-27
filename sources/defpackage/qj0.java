package defpackage;

import java.util.Arrays;
public final class qj0 implements Cloneable {
    public static final int[] c = new int[0];
    public int b = 0;
    public int[] a = c;

    public final void a(boolean z) {
        c(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = iArr[i2] | (1 << (i & 31));
        }
        this.b++;
    }

    public final void b(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            int i3 = this.b;
            c(i3 + i2);
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                if (((1 << i4) & i) != 0) {
                    int[] iArr = this.a;
                    int i5 = i3 / 32;
                    iArr[i5] = iArr[i5] | (1 << (i3 & 31));
                }
                i3++;
            }
            this.b = i3;
            return;
        }
        lq5.j("Num bits must be between 0 and 32");
    }

    public final void c(int i) {
        if (i > (this.a.length << 5)) {
            int[] iArr = new int[(((int) Math.ceil(i / 0.75f)) + 31) / 32];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.a = iArr;
        }
    }

    public final Object clone() {
        int i = this.b;
        ?? obj = new Object();
        obj.a = (int[]) this.a.clone();
        obj.b = i;
        return obj;
    }

    public final boolean d(int i) {
        if ((this.a[i / 32] & (1 << (i & 31))) != 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return (this.b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qj0)) {
            return false;
        }
        qj0 qj0Var = (qj0) obj;
        if (this.b != qj0Var.b || !Arrays.equals(this.a, qj0Var.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + (this.b * 31);
    }

    public final String toString() {
        char c2;
        int i = this.b;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            if (d(i2)) {
                c2 = 'X';
            } else {
                c2 = '.';
            }
            sb.append(c2);
        }
        return sb.toString();
    }
}
