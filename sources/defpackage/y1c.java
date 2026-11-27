package defpackage;
public final class y1c {
    public final p1c a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final int[] h;
    public final long i;
    public final boolean j;

    public y1c(p1c p1cVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        boolean z2;
        boolean z3;
        if (iArr.length == jArr2.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        yve.f(z2);
        if (jArr.length == jArr2.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        yve.f(z3);
        yve.f(iArr2.length == jArr2.length);
        this.a = p1cVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = iArr3;
        this.j = z;
        this.i = j;
        this.b = i2;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f;
        if (jArr.length <= 0) {
            return -1;
        }
        int i = 0;
        if (this.j) {
            return gcc.f(jArr, j, false);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i2 = -1;
        while (i <= length) {
            int g = ik8.g(length, i, 2, i);
            if (jArr[iArr[g]] <= j) {
                i = g + 1;
                i2 = g;
            } else {
                length = g - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 > 0 && jArr[iArr[i2 - 1]] == j2) {
                i2--;
            }
        }
        return iArr[i2];
    }

    public final int b(long j) {
        long[] jArr = this.f;
        if (jArr.length <= 0) {
            return -1;
        }
        if (this.j) {
            return gcc.b(jArr, j, true);
        }
        int[] iArr = this.h;
        int length = iArr.length - 1;
        int i = 0;
        int i2 = -1;
        while (i <= length) {
            int g = ik8.g(length, i, 2, i);
            if (jArr[iArr[g]] >= j) {
                length = g - 1;
                i2 = g;
            } else {
                i = g + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 < iArr.length - 1) {
                int i3 = i2 + 1;
                if (jArr[iArr[i3]] != j2) {
                    break;
                }
                i2 = i3;
            }
        }
        return iArr[i2];
    }
}
