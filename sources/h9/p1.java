package h9;

import a8.la;
import a8.ma;
import java.util.Arrays;
public final class p1 {
    public transient Object[] f14032a;
    public transient int[] f14033b;
    public transient int f14034c;
    public transient int[] d;
    public transient long[] f14035e;
    public transient float f14036f;
    public transient int f14037g;

    public final void a(int i7) {
        if (i7 > this.f14035e.length) {
            f(i7);
        }
        if (i7 >= this.f14037g) {
            g(Math.max(2, Integer.highestOneBit(i7 - 1) << 1));
        }
    }

    public final int b(Object obj) {
        int c10 = c(obj);
        if (c10 == -1) {
            return 0;
        }
        return this.f14033b[c10];
    }

    public final int c(Object obj) {
        int v = o.v(obj);
        int[] iArr = this.d;
        int i7 = iArr[(iArr.length - 1) & v];
        while (i7 != -1) {
            long j3 = this.f14035e[i7];
            if (((int) (j3 >>> 32)) == v && la.a(obj, this.f14032a[i7])) {
                return i7;
            }
            i7 = (int) j3;
        }
        return -1;
    }

    public final void d(int i7) {
        boolean z10;
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.e("Initial capacity must be non-negative", z10);
        int max = Math.max(i7, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0f * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
            highestOneBit = 1073741824;
        }
        int[] iArr = new int[highestOneBit];
        Arrays.fill(iArr, -1);
        this.d = iArr;
        this.f14036f = 1.0f;
        this.f14032a = new Object[i7];
        this.f14033b = new int[i7];
        long[] jArr = new long[i7];
        Arrays.fill(jArr, -1L);
        this.f14035e = jArr;
        this.f14037g = Math.max(1, (int) (highestOneBit * 1.0f));
    }

    public final void e(int i7, Object obj) {
        long j3;
        if (i7 > 0) {
            long[] jArr = this.f14035e;
            Object[] objArr = this.f14032a;
            int[] iArr = this.f14033b;
            int v = o.v(obj);
            int[] iArr2 = this.d;
            int length = (iArr2.length - 1) & v;
            int i10 = this.f14034c;
            int i11 = iArr2[length];
            if (i11 == -1) {
                iArr2[length] = i10;
                j3 = 4294967295L;
            } else {
                while (true) {
                    long j10 = jArr[i11];
                    j3 = 4294967295L;
                    if (((int) (j10 >>> 32)) == v && la.a(obj, objArr[i11])) {
                        int i12 = iArr[i11];
                        iArr[i11] = i7;
                        return;
                    }
                    int i13 = (int) j10;
                    if (i13 == -1) {
                        jArr[i11] = ((-4294967296L) & j10) | (i10 & 4294967295L);
                        break;
                    }
                    i11 = i13;
                }
            }
            int i14 = Integer.MAX_VALUE;
            if (i10 != Integer.MAX_VALUE) {
                int i15 = i10 + 1;
                int length2 = this.f14035e.length;
                if (i15 > length2) {
                    int max = Math.max(1, length2 >>> 1) + length2;
                    if (max >= 0) {
                        i14 = max;
                    }
                    if (i14 != length2) {
                        f(i14);
                    }
                }
                this.f14035e[i10] = (v << 32) | j3;
                this.f14032a[i10] = obj;
                this.f14033b[i10] = i7;
                this.f14034c = i15;
                if (i10 >= this.f14037g) {
                    g(this.d.length * 2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        throw new IllegalArgumentException(i5.c.i(i7, "count must be positive but was: "));
    }

    public final void f(int i7) {
        this.f14032a = Arrays.copyOf(this.f14032a, i7);
        this.f14033b = Arrays.copyOf(this.f14033b, i7);
        long[] jArr = this.f14035e;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i7);
        if (i7 > length) {
            Arrays.fill(copyOf, length, i7, -1L);
        }
        this.f14035e = copyOf;
    }

    public final void g(int i7) {
        if (this.d.length >= 1073741824) {
            this.f14037g = Integer.MAX_VALUE;
            return;
        }
        int i10 = ((int) (i7 * this.f14036f)) + 1;
        int[] iArr = new int[i7];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f14035e;
        int i11 = i7 - 1;
        for (int i12 = 0; i12 < this.f14034c; i12++) {
            int i13 = (int) (jArr[i12] >>> 32);
            int i14 = i13 & i11;
            int i15 = iArr[i14];
            iArr[i14] = i12;
            jArr[i12] = (i13 << 32) | (i15 & 4294967295L);
        }
        this.f14037g = i10;
        this.d = iArr;
    }
}
