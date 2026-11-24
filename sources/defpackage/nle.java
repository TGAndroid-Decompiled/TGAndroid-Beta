package defpackage;

import java.util.logging.Logger;
public final class nle {
    public static final Logger e = Logger.getLogger(nle.class.getName());
    public static final boolean f = k2f.e;
    public eod a;
    public final byte[] b;
    public final int c;
    public int d;

    public nle(int i, byte[] bArr) {
        if (((bArr.length - i) | i) >= 0) {
            this.b = bArr;
            this.d = 0;
            this.c = i;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
    }

    public static int f(String str) {
        int length;
        try {
            length = s2f.a(str);
        } catch (b3f unused) {
            length = str.getBytes(iqe.a).length;
        }
        return t(length) + length;
    }

    public static int h(int i, rfe rfeVar, zye zyeVar) {
        int t = t(i << 3) << 1;
        int c = rfeVar.c();
        if (c == -1) {
            c = zyeVar.zzb(rfeVar);
            rfeVar.b(c);
        }
        return t + c;
    }

    public static int i(int i, tke tkeVar) {
        int t = t(i << 3);
        int i2 = tkeVar.i();
        return mle.a(i2, i2, t);
    }

    public static int m(int i) {
        return t(i << 3);
    }

    public static int n(int i, long j) {
        return o(j) + t(i << 3);
    }

    public static int o(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            return i + 1;
        }
        return i;
    }

    public static int p(int i) {
        if (i >= 0) {
            return t(i);
        }
        return 10;
    }

    public static int q(int i, long j) {
        return o((j << 1) ^ (j >> 63)) + t(i << 3);
    }

    public static int r(int i) {
        return t(i << 3) + 8;
    }

    public static int s(int i, int i2) {
        return t(i2) + t(i << 3);
    }

    public static int t(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int u(int i, int i2) {
        return t((i2 << 1) ^ (i2 >> 31)) + t(i << 3);
    }

    public static int v(int i) {
        return t(i << 3) + 4;
    }

    public final void a(byte b) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new ole(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void b(int i) {
        if (i >= 0) {
            g(i);
        } else {
            d(i);
        }
    }

    public final void c(int i, int i2) {
        g((i << 3) | i2);
    }

    public final void d(long j) {
        boolean z = f;
        byte[] bArr = this.b;
        if (!z || e() < 10) {
            while (true) {
                int i = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                try {
                    int i2 = this.d;
                    if (i == 0) {
                        this.d = i2 + 1;
                        bArr[i2] = (byte) j;
                        return;
                    }
                    this.d = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new ole(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
                }
            }
        } else {
            while (true) {
                int i3 = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i4 = this.d;
                if (i3 == 0) {
                    this.d = i4 + 1;
                    k2f.e(bArr, i4, (byte) j);
                    return;
                }
                this.d = i4 + 1;
                k2f.e(bArr, i4, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
    }

    public final int e() {
        return this.c - this.d;
    }

    public final void g(int i) {
        boolean z = f;
        byte[] bArr = this.b;
        if (z && !kge.a() && e() >= 5) {
            int i2 = i & (-128);
            int i3 = this.d;
            if (i2 == 0) {
                this.d = i3 + 1;
                k2f.e(bArr, i3, (byte) i);
                return;
            }
            this.d = i3 + 1;
            k2f.e(bArr, i3, (byte) (i | 128));
            int i4 = i >>> 7;
            int i5 = i4 & (-128);
            int i6 = this.d;
            if (i5 == 0) {
                this.d = i6 + 1;
                k2f.e(bArr, i6, (byte) i4);
                return;
            }
            this.d = i6 + 1;
            k2f.e(bArr, i6, (byte) (i4 | 128));
            int i7 = i >>> 14;
            int i8 = i7 & (-128);
            int i9 = this.d;
            if (i8 == 0) {
                this.d = i9 + 1;
                k2f.e(bArr, i9, (byte) i7);
                return;
            }
            this.d = i9 + 1;
            k2f.e(bArr, i9, (byte) (i7 | 128));
            int i10 = i >>> 21;
            int i11 = i10 & (-128);
            int i12 = this.d;
            if (i11 == 0) {
                this.d = i12 + 1;
                k2f.e(bArr, i12, (byte) i10);
                return;
            }
            this.d = i12 + 1;
            k2f.e(bArr, i12, (byte) (i10 | 128));
            int i13 = this.d;
            this.d = i13 + 1;
            k2f.e(bArr, i13, (byte) (i >>> 28));
            return;
        }
        while (true) {
            int i14 = i & (-128);
            try {
                int i15 = this.d;
                if (i14 == 0) {
                    this.d = i15 + 1;
                    bArr[i15] = (byte) i;
                    return;
                }
                this.d = i15 + 1;
                bArr[i15] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new ole(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
            }
        }
    }

    public final void j(long j) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) j;
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (j >> 8);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (j >> 16);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (j >> 24);
            int i6 = i + 5;
            this.d = i6;
            bArr[i5] = (byte) (j >> 32);
            int i7 = i + 6;
            this.d = i7;
            bArr[i6] = (byte) (j >> 40);
            int i8 = i + 7;
            this.d = i8;
            bArr[i7] = (byte) (j >> 48);
            this.d = i + 8;
            bArr[i8] = (byte) (j >> 56);
        } catch (IndexOutOfBoundsException e2) {
            throw new ole(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void k(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new ole(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2);
        }
    }

    public final void l(int i) {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) i;
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) (i >> 16);
            this.d = i2 + 4;
            bArr[i5] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e2) {
            throw new ole(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }
}
