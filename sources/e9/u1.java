package e9;

import java.util.Arrays;
import v7.t6;
import v7.u6;
public final class u1 {
    public transient Object[] f8512a;
    public transient int[] f8513b;
    public transient int f8514c;
    public transient int[] d;
    public transient long[] e;
    public transient float f8515f;
    public transient int f8516g;

    public final void a(int i10) {
        if (i10 > this.e.length) {
            f(i10);
        }
        if (i10 >= this.f8516g) {
            g(Math.max(2, Integer.highestOneBit(i10 - 1) << 1));
        }
    }

    public final int b(Object obj) {
        int c10 = c(obj);
        if (c10 == -1) {
            return 0;
        }
        return this.f8513b[c10];
    }

    public final int c(Object obj) {
        int u10 = s.u(obj);
        int[] iArr = this.d;
        int i10 = iArr[(iArr.length - 1) & u10];
        while (i10 != -1) {
            long j10 = this.e[i10];
            if (((int) (j10 >>> 32)) == u10 && t6.a(obj, this.f8512a[i10])) {
                return i10;
            }
            i10 = (int) j10;
        }
        return -1;
    }

    public final void d(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.f("Initial capacity must be non-negative", z10);
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0f * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
            highestOneBit = 1073741824;
        }
        int[] iArr = new int[highestOneBit];
        Arrays.fill(iArr, -1);
        this.d = iArr;
        this.f8515f = 1.0f;
        this.f8512a = new Object[i10];
        this.f8513b = new int[i10];
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        this.e = jArr;
        this.f8516g = Math.max(1, (int) (highestOneBit * 1.0f));
    }

    public final void e(int i10, Object obj) {
        long j10;
        if (i10 > 0) {
            long[] jArr = this.e;
            Object[] objArr = this.f8512a;
            int[] iArr = this.f8513b;
            int u10 = s.u(obj);
            int[] iArr2 = this.d;
            int length = (iArr2.length - 1) & u10;
            int i11 = this.f8514c;
            int i12 = iArr2[length];
            if (i12 == -1) {
                iArr2[length] = i11;
                j10 = 4294967295L;
            } else {
                while (true) {
                    long j11 = jArr[i12];
                    j10 = 4294967295L;
                    if (((int) (j11 >>> 32)) == u10 && t6.a(obj, objArr[i12])) {
                        int i13 = iArr[i12];
                        iArr[i12] = i10;
                        return;
                    }
                    int i14 = (int) j11;
                    if (i14 == -1) {
                        jArr[i12] = ((-4294967296L) & j11) | (i11 & 4294967295L);
                        break;
                    }
                    i12 = i14;
                }
            }
            int i15 = Integer.MAX_VALUE;
            if (i11 != Integer.MAX_VALUE) {
                int i16 = i11 + 1;
                int length2 = this.e.length;
                if (i16 > length2) {
                    int max = Math.max(1, length2 >>> 1) + length2;
                    if (max >= 0) {
                        i15 = max;
                    }
                    if (i15 != length2) {
                        f(i15);
                    }
                }
                this.e[i11] = (u10 << 32) | j10;
                this.f8512a[i11] = obj;
                this.f8513b[i11] = i10;
                this.f8514c = i16;
                if (i11 >= this.f8516g) {
                    g(this.d.length * 2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        throw new IllegalArgumentException(i2.d.j(i10, "count must be positive but was: "));
    }

    public final void f(int i10) {
        this.f8512a = Arrays.copyOf(this.f8512a, i10);
        this.f8513b = Arrays.copyOf(this.f8513b, i10);
        long[] jArr = this.e;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(copyOf, length, i10, -1L);
        }
        this.e = copyOf;
    }

    public final void g(int i10) {
        if (this.d.length >= 1073741824) {
            this.f8516g = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f8515f)) + 1;
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        long[] jArr = this.e;
        int i12 = i10 - 1;
        for (int i13 = 0; i13 < this.f8514c; i13++) {
            int i14 = (int) (jArr[i13] >>> 32);
            int i15 = i14 & i12;
            int i16 = iArr[i15];
            iArr[i15] = i13;
            jArr[i13] = (i14 << 32) | (i16 & 4294967295L);
        }
        this.f8516g = i11;
        this.d = iArr;
    }
}
