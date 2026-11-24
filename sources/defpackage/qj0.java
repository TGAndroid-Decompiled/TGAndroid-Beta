package defpackage;

import java.util.Arrays;
public final class qj0 implements Cloneable {
    public int a;
    public int b;
    public int c;
    public int[] d;

    public qj0(int i, int i2) {
        if (i >= 1 && i2 >= 1) {
            this.a = i;
            this.b = i2;
            int i3 = (i + 31) / 32;
            this.c = i3;
            this.d = new int[i3 * i2];
            return;
        }
        w26.j("Both dimensions must be greater than 0");
        throw null;
    }

    public final void a(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.c);
        int[] iArr = this.d;
        iArr[i3] = iArr[i3] ^ (1 << (i & 31));
    }

    public final boolean b(int i, int i2) {
        int i3 = i2 * this.c;
        if (((this.d[(i / 32) + i3] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void c(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.c);
        int[] iArr = this.d;
        iArr[i3] = iArr[i3] | (1 << (i & 31));
    }

    public final Object clone() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        ?? obj = new Object();
        obj.a = i;
        obj.b = i2;
        obj.c = i3;
        obj.d = (int[]) this.d.clone();
        return obj;
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i >= 0) {
            if (i4 >= 1 && i3 >= 1) {
                int i5 = i3 + i;
                int i6 = i4 + i2;
                if (i6 <= this.b && i5 <= this.a) {
                    while (i2 < i6) {
                        int i7 = this.c * i2;
                        for (int i8 = i; i8 < i5; i8++) {
                            int[] iArr = this.d;
                            int i9 = (i8 / 32) + i7;
                            iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                        }
                        i2++;
                    }
                    return;
                }
                w26.j("The region must fit inside the matrix");
                return;
            }
            w26.j("Height and width must be at least 1");
            return;
        }
        w26.j("Left and top must be nonnegative");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qj0)) {
            return false;
        }
        qj0 qj0Var = (qj0) obj;
        if (this.a != qj0Var.a || this.b != qj0Var.b || this.c != qj0Var.c || !Arrays.equals(this.d, qj0Var.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.d) + (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        String str;
        int i = this.b;
        int i2 = this.a;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (b(i4, i3)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb.append(str);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
