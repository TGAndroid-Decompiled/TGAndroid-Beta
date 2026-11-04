package g9;

import b8.yb;
import b8.zb;
import java.util.Arrays;
public final class p1 {
    public transient Object[] f12120a;
    public transient int[] f12121b;
    public transient int f12122c;
    public transient int[] d;
    public transient long[] f12123e;
    public transient float f12124f;
    public transient int f12125g;

    public final void a(int i3) {
        if (i3 > this.f12123e.length) {
            f(i3);
        }
        if (i3 >= this.f12125g) {
            g(Math.max(2, Integer.highestOneBit(i3 - 1) << 1));
        }
    }

    public final int b(Object obj) {
        int c2 = c(obj);
        if (c2 == -1) {
            return 0;
        }
        return this.f12121b[c2];
    }

    public final int c(Object obj) {
        int v = o.v(obj);
        int[] iArr = this.d;
        int i3 = iArr[(iArr.length - 1) & v];
        while (i3 != -1) {
            long j10 = this.f12123e[i3];
            if (((int) (j10 >>> 32)) == v && yb.a(obj, this.f12120a[i3])) {
                return i3;
            }
            i3 = (int) j10;
        }
        return -1;
    }

    public final void d(int i3) {
        boolean z10;
        if (i3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.e("Initial capacity must be non-negative", z10);
        int max = Math.max(i3, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0f * highestOneBit)) && (highestOneBit = highestOneBit << 1) <= 0) {
            highestOneBit = 1073741824;
        }
        int[] iArr = new int[highestOneBit];
        Arrays.fill(iArr, -1);
        this.d = iArr;
        this.f12124f = 1.0f;
        this.f12120a = new Object[i3];
        this.f12121b = new int[i3];
        long[] jArr = new long[i3];
        Arrays.fill(jArr, -1L);
        this.f12123e = jArr;
        this.f12125g = Math.max(1, (int) (highestOneBit * 1.0f));
    }

    public final void e(int i3, Object obj) {
        long j10;
        if (i3 > 0) {
            long[] jArr = this.f12123e;
            Object[] objArr = this.f12120a;
            int[] iArr = this.f12121b;
            int v = o.v(obj);
            int[] iArr2 = this.d;
            int length = (iArr2.length - 1) & v;
            int i10 = this.f12122c;
            int i11 = iArr2[length];
            if (i11 == -1) {
                iArr2[length] = i10;
                j10 = 4294967295L;
            } else {
                while (true) {
                    long j11 = jArr[i11];
                    j10 = 4294967295L;
                    if (((int) (j11 >>> 32)) == v && yb.a(obj, objArr[i11])) {
                        int i12 = iArr[i11];
                        iArr[i11] = i3;
                        return;
                    }
                    int i13 = (int) j11;
                    if (i13 == -1) {
                        jArr[i11] = ((-4294967296L) & j11) | (i10 & 4294967295L);
                        break;
                    }
                    i11 = i13;
                }
            }
            int i14 = Integer.MAX_VALUE;
            if (i10 != Integer.MAX_VALUE) {
                int i15 = i10 + 1;
                int length2 = this.f12123e.length;
                if (i15 > length2) {
                    int max = Math.max(1, length2 >>> 1) + length2;
                    if (max >= 0) {
                        i14 = max;
                    }
                    if (i14 != length2) {
                        f(i14);
                    }
                }
                this.f12123e[i10] = (v << 32) | j10;
                this.f12120a[i10] = obj;
                this.f12121b[i10] = i3;
                this.f12122c = i15;
                if (i10 >= this.f12125g) {
                    g(this.d.length * 2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        throw new IllegalArgumentException(k2.p1.i(i3, "count must be positive but was: "));
    }

    public final void f(int i3) {
        this.f12120a = Arrays.copyOf(this.f12120a, i3);
        this.f12121b = Arrays.copyOf(this.f12121b, i3);
        long[] jArr = this.f12123e;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i3);
        if (i3 > length) {
            Arrays.fill(copyOf, length, i3, -1L);
        }
        this.f12123e = copyOf;
    }

    public final void g(int i3) {
        if (this.d.length >= 1073741824) {
            this.f12125g = Integer.MAX_VALUE;
            return;
        }
        int i10 = ((int) (i3 * this.f12124f)) + 1;
        int[] iArr = new int[i3];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f12123e;
        int i11 = i3 - 1;
        for (int i12 = 0; i12 < this.f12122c; i12++) {
            int i13 = (int) (jArr[i12] >>> 32);
            int i14 = i13 & i11;
            int i15 = iArr[i14];
            iArr[i14] = i12;
            jArr[i12] = (i13 << 32) | (i15 & 4294967295L);
        }
        this.f12125g = i10;
        this.d = iArr;
    }
}
