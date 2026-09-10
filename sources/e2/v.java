package e2;

import e9.m0;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import v7.a8;
import v7.t6;
import v7.y7;
public final class v {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final m0 f7233f = m0.u(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public byte[] f7234a;
    public int f7235b;
    public int f7236c;

    public v() {
        this.f7234a = d0.f7189b;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        byte b10 = (byte) i12;
        return y7.c((byte) 0, a8.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), a8.a(((((byte) i11) & 15) << 4) | ((b10 & 60) >> 2)), a8.a(((b10 & 3) << 6) | (((byte) i13) & 63)));
    }

    public static int d(Charset charset) {
        boolean contains = f7233f.contains(charset);
        d.a("Unsupported charset: " + charset, contains);
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(StandardCharsets.US_ASCII)) {
            return 2;
        }
        return 1;
    }

    public static boolean e(byte b10) {
        if ((b10 & 192) == 128) {
            return true;
        }
        return false;
    }

    public final int A() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        int i12 = i10 + 2;
        this.f7235b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f7235b = i10 + 3;
        return (bArr[i12] & 255) | i13 | ((bArr[i10] & 255) << 16);
    }

    public final int B() {
        int j3 = j();
        if (j3 >= 0) {
            return j3;
        }
        throw new IllegalStateException(hc.b.j(j3, "Top bit not zero: "));
    }

    public final long C() {
        long r10 = r();
        if (r10 >= 0) {
            return r10;
        }
        throw new IllegalStateException(a4.a.o(r10, "Top bit not zero: "));
    }

    public final int D() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        this.f7235b = i10 + 2;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public final long E() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j3 = this.f7234a[this.f7235b];
        int i13 = 7;
        while (true) {
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j3) != 0) {
                i13--;
            } else if (i13 < 6) {
                j3 &= i12 - 1;
                i11 = 7 - i13;
            } else if (i13 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.f7234a[this.f7235b + i10] & 192) == 128) {
                    j3 = (j3 << 6) | (b10 & 63);
                } else {
                    throw new NumberFormatException(a4.a.o(j3, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.f7235b += i11;
            return j3;
        }
        throw new NumberFormatException(a4.a.o(j3, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset F() {
        if (a() >= 3) {
            byte[] bArr = this.f7234a;
            int i10 = this.f7235b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f7235b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f7234a;
            int i11 = this.f7235b;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f7235b = i11 + 2;
                return StandardCharsets.UTF_16BE;
            } else if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f7235b = i11 + 2;
                return StandardCharsets.UTF_16LE;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void G(int i10) {
        byte[] bArr = this.f7234a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        H(i10, bArr);
    }

    public final void H(int i10, byte[] bArr) {
        this.f7234a = bArr;
        this.f7236c = i10;
        this.f7235b = 0;
    }

    public final void I(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f7234a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.b(z10);
        this.f7236c = i10;
    }

    public final void J(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f7236c) {
            z10 = true;
        } else {
            z10 = false;
        }
        d.b(z10);
        this.f7235b = i10;
    }

    public final void K(int i10) {
        J(this.f7235b + i10);
    }

    public final int a() {
        return Math.max(this.f7236c - this.f7235b, 0);
    }

    public final void c(int i10) {
        byte[] bArr = this.f7234a;
        if (i10 > bArr.length) {
            this.f7234a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char f(int i10, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f7234a;
            int i11 = this.f7235b + i10;
            b10 = bArr[i11];
            b11 = bArr[i11 + 1];
        } else {
            byte[] bArr2 = this.f7234a;
            int i12 = this.f7235b + i10;
            b10 = bArr2[i12 + 1];
            b11 = bArr2[i12];
        }
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public final int g(Charset charset) {
        ByteOrder byteOrder;
        int i10;
        int i11;
        int i12;
        boolean contains = f7233f.contains(charset);
        d.a("Unsupported charset: " + charset, contains);
        if (a() >= d(charset)) {
            int i13 = 1;
            if (charset.equals(StandardCharsets.US_ASCII)) {
                byte b10 = this.f7234a[this.f7235b];
                if ((b10 & 128) == 0) {
                    i10 = b10 & 255;
                    return (i10 << 8) | i13;
                }
                return 0;
            }
            if (charset.equals(StandardCharsets.UTF_8)) {
                byte b11 = this.f7234a[this.f7235b];
                if ((b11 & 128) == 0) {
                    i11 = 1;
                } else if ((b11 & 224) == 192 && a() >= 2 && e(this.f7234a[this.f7235b + 1])) {
                    i11 = 2;
                } else if ((this.f7234a[this.f7235b] & 240) == 224 && a() >= 3 && e(this.f7234a[this.f7235b + 1]) && e(this.f7234a[this.f7235b + 2])) {
                    i11 = 3;
                } else if ((this.f7234a[this.f7235b] & 248) == 240 && a() >= 4 && e(this.f7234a[this.f7235b + 1]) && e(this.f7234a[this.f7235b + 2]) && e(this.f7234a[this.f7235b + 3])) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                byte[] bArr = this.f7234a;
                                int i14 = this.f7235b;
                                i12 = b(bArr[i14], bArr[i14 + 1], bArr[i14 + 2], bArr[i14 + 3]);
                            }
                            return 0;
                        }
                        byte[] bArr2 = this.f7234a;
                        int i15 = this.f7235b;
                        i12 = b(0, bArr2[i15] & 15, bArr2[i15 + 1], bArr2[i15 + 2]);
                    } else {
                        byte[] bArr3 = this.f7234a;
                        int i16 = this.f7235b;
                        i12 = b(0, 0, bArr3[i16], bArr3[i16 + 1]);
                    }
                } else {
                    i12 = this.f7234a[this.f7235b] & 255;
                }
                i13 = i11;
                i10 = i12;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
                char f7 = f(0, byteOrder);
                if (Character.isHighSurrogate(f7) && a() >= 4) {
                    i10 = Character.toCodePoint(f7, f(2, byteOrder));
                    i13 = 4;
                } else {
                    i10 = f7;
                    i13 = 2;
                }
            }
            return (i10 << 8) | i13;
        }
        throw new IndexOutOfBoundsException("position=" + this.f7235b + ", limit=" + this.f7236c);
    }

    public final void h(int i10, int i11, byte[] bArr) {
        System.arraycopy(this.f7234a, this.f7235b, bArr, i10, i11);
        this.f7235b += i11;
    }

    public final char i(Charset charset, char[] cArr) {
        int g10;
        boolean z10;
        if (a() >= d(charset) && (g10 = g(charset)) != 0) {
            long j3 = g10 >>> 8;
            boolean z11 = true;
            if ((j3 >> 32) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.b(j3, "out of range: %s", z10);
            int i10 = (int) j3;
            if (!Character.isSupplementaryCodePoint(i10)) {
                long j10 = i10;
                char c10 = (char) j10;
                if (c10 != j10) {
                    z11 = false;
                }
                t6.b(j10, "Out of range: %s", z11);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.f7235b = y7.b(g10 & 255) + this.f7235b;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int j() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        int i12 = i10 + 2;
        this.f7235b = i12;
        int i13 = ((bArr[i11] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i14 = i10 + 3;
        this.f7235b = i14;
        this.f7235b = i10 + 4;
        return (bArr[i14] & 255) | i13 | ((bArr[i12] & 255) << 8);
    }

    public final String k(Charset charset) {
        int i10;
        boolean contains = f7233f.contains(charset);
        d.a("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            F();
        }
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f7235b;
        while (true) {
            int i12 = this.f7236c;
            if (i11 < i12 - (i10 - 1)) {
                if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && d0.M(this.f7234a[i11])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.f7234a;
                    if (bArr[i11] == 0 && d0.M(bArr[i11 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.f7234a;
                    if (bArr2[i11 + 1] == 0 && d0.M(bArr2[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                i11 = i12;
                break;
            }
        }
        String v = v(i11 - this.f7235b, charset);
        if (this.f7235b != this.f7236c && i(charset, d) == '\r') {
            i(charset, e);
        }
        return v;
    }

    public final int l() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        int i12 = i10 + 2;
        this.f7235b = i12;
        int i13 = ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
        int i14 = i10 + 3;
        this.f7235b = i14;
        this.f7235b = i10 + 4;
        return ((bArr[i14] & 255) << 24) | i13 | ((bArr[i12] & 255) << 16);
    }

    public final long m() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        int i12 = i10 + 2;
        this.f7235b = i12;
        long j3 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i13 = i10 + 3;
        this.f7235b = i13;
        int i14 = i10 + 4;
        this.f7235b = i14;
        long j10 = j3 | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24);
        int i15 = i10 + 5;
        this.f7235b = i15;
        int i16 = i10 + 6;
        this.f7235b = i16;
        long j11 = j10 | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40);
        int i17 = i10 + 7;
        this.f7235b = i17;
        this.f7235b = i10 + 8;
        return ((bArr[i17] & 255) << 56) | j11 | ((bArr[i16] & 255) << 48);
    }

    public final short n() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        this.f7235b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public final long o() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        int i12 = i10 + 2;
        this.f7235b = i12;
        int i13 = i10 + 3;
        this.f7235b = i13;
        this.f7235b = i10 + 4;
        return ((bArr[i13] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    public final int p() {
        int l4 = l();
        if (l4 >= 0) {
            return l4;
        }
        throw new IllegalStateException(hc.b.j(l4, "Top bit not zero: "));
    }

    public final int q() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        this.f7235b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public final long r() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        int i12 = i10 + 2;
        this.f7235b = i12;
        int i13 = i10 + 3;
        this.f7235b = i13;
        long j3 = ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40);
        int i14 = i10 + 4;
        this.f7235b = i14;
        int i15 = i10 + 5;
        this.f7235b = i15;
        long j10 = j3 | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24);
        int i16 = i10 + 6;
        this.f7235b = i16;
        int i17 = i10 + 7;
        this.f7235b = i17;
        this.f7235b = i10 + 8;
        return (bArr[i17] & 255) | j10 | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8);
    }

    public final String s() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f7235b;
        while (i10 < this.f7236c && this.f7234a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f7234a;
        int i11 = this.f7235b;
        String str = d0.f7188a;
        String str2 = new String(bArr, i11, i10 - i11, StandardCharsets.UTF_8);
        this.f7235b = i10;
        if (i10 < this.f7236c) {
            this.f7235b = i10 + 1;
        }
        return str2;
    }

    public final String t(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.f7235b;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.f7236c && this.f7234a[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        byte[] bArr = this.f7234a;
        String str = d0.f7188a;
        String str2 = new String(bArr, i12, i11, StandardCharsets.UTF_8);
        this.f7235b += i10;
        return str2;
    }

    public final short u() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        this.f7235b = i10 + 2;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public final String v(int i10, Charset charset) {
        String str = new String(this.f7234a, this.f7235b, i10, charset);
        this.f7235b += i10;
        return str;
    }

    public final int w() {
        return (x() << 21) | (x() << 14) | (x() << 7) | x();
    }

    public final int x() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        this.f7235b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int y() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        this.f7235b = i10 + 2;
        int i12 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f7235b = i10 + 4;
        return i12;
    }

    public final long z() {
        byte[] bArr = this.f7234a;
        int i10 = this.f7235b;
        int i11 = i10 + 1;
        this.f7235b = i11;
        int i12 = i10 + 2;
        this.f7235b = i12;
        int i13 = i10 + 3;
        this.f7235b = i13;
        this.f7235b = i10 + 4;
        return (bArr[i13] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
    }

    public v(int i10) {
        this.f7234a = new byte[i10];
        this.f7236c = i10;
    }

    public v(byte[] bArr) {
        this.f7234a = bArr;
        this.f7236c = bArr.length;
    }

    public v(byte[] bArr, int i10) {
        this.f7234a = bArr;
        this.f7236c = i10;
    }
}
