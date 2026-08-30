package h5;

import java.nio.charset.Charset;
import java.util.Arrays;
import k7.b7;
import kh.a2;
public final class w {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final s8.z f6999f = s8.z.t(5, r8.d.f43387a, r8.d.f43389c, r8.d.f43390f, r8.d.d, r8.d.e);
    public byte[] f7000a;
    public int f7001b;
    public int f7002c;

    public w() {
        this.f7000a = d0.f6940f;
    }

    public final long A() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j10 = this.f7000a[this.f7001b];
        int i13 = 7;
        while (true) {
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j10) != 0) {
                i13--;
            } else if (i13 < 6) {
                j10 &= i12 - 1;
                i11 = 7 - i13;
            } else if (i13 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.f7000a[this.f7001b + i10] & 192) == 128) {
                    j10 = (j10 << 6) | (b10 & 63);
                } else {
                    throw new NumberFormatException(android.support.v4.media.a.n(j10, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.f7001b += i11;
            return j10;
        }
        throw new NumberFormatException(android.support.v4.media.a.n(j10, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.f7000a;
            int i10 = this.f7001b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f7001b = i10 + 3;
                return r8.d.f43389c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f7000a;
            int i11 = this.f7001b;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f7001b = i11 + 2;
                return r8.d.d;
            } else if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f7001b = i11 + 2;
                return r8.d.e;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void C(int i10) {
        byte[] bArr = this.f7000a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        D(i10, bArr);
    }

    public final void D(int i10, byte[] bArr) {
        this.f7000a = bArr;
        this.f7002c = i10;
        this.f7001b = 0;
    }

    public final void E(int i10) {
        boolean z4;
        if (i10 >= 0 && i10 <= this.f7000a.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        a.f(z4);
        this.f7002c = i10;
    }

    public final void F(int i10) {
        boolean z4;
        if (i10 >= 0 && i10 <= this.f7002c) {
            z4 = true;
        } else {
            z4 = false;
        }
        a.f(z4);
        this.f7001b = i10;
    }

    public final void G(int i10) {
        F(this.f7001b + i10);
    }

    public final int a() {
        return this.f7002c - this.f7001b;
    }

    public final void b(int i10) {
        byte[] bArr = this.f7000a;
        if (i10 > bArr.length) {
            this.f7000a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char c(Charset charset) {
        boolean contains = f6999f.contains(charset);
        a.e("Unsupported charset: " + charset, contains);
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        boolean z4;
        byte b10;
        int i10;
        byte b11;
        byte b12;
        boolean z10 = false;
        if ((charset.equals(r8.d.f43389c) || charset.equals(r8.d.f43387a)) && a() >= 1) {
            long j10 = this.f7000a[this.f7001b] & 255;
            char c3 = (char) j10;
            if (c3 == j10) {
                z4 = true;
            } else {
                z4 = false;
            }
            b7.b(j10, "Out of range: %s", z4);
            b10 = (byte) c3;
            i10 = 1;
        } else {
            i10 = 2;
            if ((charset.equals(r8.d.f43390f) || charset.equals(r8.d.d)) && a() >= 2) {
                byte[] bArr = this.f7000a;
                int i11 = this.f7001b;
                b11 = bArr[i11];
                b12 = bArr[i11 + 1];
            } else if (!charset.equals(r8.d.e) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.f7000a;
                int i12 = this.f7001b;
                b11 = bArr2[i12 + 1];
                b12 = bArr2[i12];
            }
            b10 = (byte) ((char) ((b12 & 255) | (b11 << 8)));
        }
        long j11 = b10;
        char c10 = (char) j11;
        if (c10 == j11) {
            z10 = true;
        }
        b7.b(j11, "Out of range: %s", z10);
        return (c10 << 16) + i10;
    }

    public final void e(int i10, int i11, byte[] bArr) {
        System.arraycopy(this.f7000a, this.f7001b, bArr, i10, i11);
        this.f7001b += i11;
    }

    public final char f(Charset charset, char[] cArr) {
        int d10 = d(charset);
        if (d10 != 0) {
            char c3 = (char) (d10 >> 16);
            for (char c10 : cArr) {
                if (c10 == c3) {
                    this.f7001b += d10 & 65535;
                    return c3;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        int i12 = i10 + 2;
        this.f7001b = i12;
        int i13 = ((bArr[i11] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i14 = i10 + 3;
        this.f7001b = i14;
        this.f7001b = i10 + 4;
        return (bArr[i14] & 255) | i13 | ((bArr[i12] & 255) << 8);
    }

    public final String h(Charset charset) {
        int i10;
        boolean contains = f6999f.contains(charset);
        a.e("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = r8.d.f43387a;
        if (!charset.equals(charset2)) {
            B();
        }
        if (!charset.equals(r8.d.f43389c) && !charset.equals(charset2)) {
            if (!charset.equals(r8.d.f43390f) && !charset.equals(r8.d.e) && !charset.equals(r8.d.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f7001b;
        while (true) {
            int i12 = this.f7002c;
            if (i11 < i12 - (i10 - 1)) {
                if ((charset.equals(r8.d.f43389c) || charset.equals(r8.d.f43387a)) && d0.E(this.f7000a[i11])) {
                    break;
                }
                if (charset.equals(r8.d.f43390f) || charset.equals(r8.d.d)) {
                    byte[] bArr = this.f7000a;
                    if (bArr[i11] == 0 && d0.E(bArr[i11 + 1])) {
                        break;
                    }
                }
                if (charset.equals(r8.d.e)) {
                    byte[] bArr2 = this.f7000a;
                    if (bArr2[i11 + 1] == 0 && d0.E(bArr2[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                i11 = i12;
                break;
            }
        }
        String s6 = s(i11 - this.f7001b, charset);
        if (this.f7001b != this.f7002c && f(charset, d) == '\r') {
            f(charset, e);
        }
        return s6;
    }

    public final int i() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        int i12 = i10 + 2;
        this.f7001b = i12;
        int i13 = ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
        int i14 = i10 + 3;
        this.f7001b = i14;
        this.f7001b = i10 + 4;
        return ((bArr[i14] & 255) << 24) | i13 | ((bArr[i12] & 255) << 16);
    }

    public final long j() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        int i12 = i10 + 2;
        this.f7001b = i12;
        long j10 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i13 = i10 + 3;
        this.f7001b = i13;
        int i14 = i10 + 4;
        this.f7001b = i14;
        long j11 = j10 | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24);
        int i15 = i10 + 5;
        this.f7001b = i15;
        int i16 = i10 + 6;
        this.f7001b = i16;
        long j12 = j11 | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40);
        int i17 = i10 + 7;
        this.f7001b = i17;
        this.f7001b = i10 + 8;
        return ((bArr[i17] & 255) << 56) | j12 | ((bArr[i16] & 255) << 48);
    }

    public final short k() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        this.f7001b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public final long l() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        int i12 = i10 + 2;
        this.f7001b = i12;
        int i13 = i10 + 3;
        this.f7001b = i13;
        this.f7001b = i10 + 4;
        return ((bArr[i13] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    public final int m() {
        int i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(a2.j(i10, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        this.f7001b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public final long o() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        int i12 = i10 + 2;
        this.f7001b = i12;
        int i13 = i10 + 3;
        this.f7001b = i13;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40);
        int i14 = i10 + 4;
        this.f7001b = i14;
        int i15 = i10 + 5;
        this.f7001b = i15;
        long j11 = j10 | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24);
        int i16 = i10 + 6;
        this.f7001b = i16;
        int i17 = i10 + 7;
        this.f7001b = i17;
        this.f7001b = i10 + 8;
        return (bArr[i17] & 255) | j11 | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8);
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f7001b;
        while (i10 < this.f7002c && this.f7000a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f7000a;
        int i11 = this.f7001b;
        int i12 = d0.f6937a;
        String str = new String(bArr, i11, i10 - i11, r8.d.f43389c);
        this.f7001b = i10;
        if (i10 < this.f7002c) {
            this.f7001b = i10 + 1;
        }
        return str;
    }

    public final String q(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.f7001b;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.f7002c && this.f7000a[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        byte[] bArr = this.f7000a;
        int i14 = d0.f6937a;
        String str = new String(bArr, i12, i11, r8.d.f43389c);
        this.f7001b += i10;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        this.f7001b = i10 + 2;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public final String s(int i10, Charset charset) {
        String str = new String(this.f7000a, this.f7001b, i10, charset);
        this.f7001b += i10;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        this.f7001b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long v() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        int i12 = i10 + 2;
        this.f7001b = i12;
        int i13 = i10 + 3;
        this.f7001b = i13;
        this.f7001b = i10 + 4;
        return (bArr[i13] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
    }

    public final int w() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        int i12 = i10 + 2;
        this.f7001b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f7001b = i10 + 3;
        return (bArr[i12] & 255) | i13 | ((bArr[i10] & 255) << 16);
    }

    public final int x() {
        int g10 = g();
        if (g10 >= 0) {
            return g10;
        }
        throw new IllegalStateException(a2.j(g10, "Top bit not zero: "));
    }

    public final long y() {
        long o10 = o();
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException(android.support.v4.media.a.n(o10, "Top bit not zero: "));
    }

    public final int z() {
        byte[] bArr = this.f7000a;
        int i10 = this.f7001b;
        int i11 = i10 + 1;
        this.f7001b = i11;
        this.f7001b = i10 + 2;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public w(int i10) {
        this.f7000a = new byte[i10];
        this.f7002c = i10;
    }

    public w(byte[] bArr) {
        this.f7000a = bArr;
        this.f7002c = bArr.length;
    }

    public w(byte[] bArr, int i10) {
        this.f7000a = bArr;
        this.f7002c = i10;
    }
}
