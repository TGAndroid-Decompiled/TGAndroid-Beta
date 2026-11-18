package h2;

import a8.la;
import a8.p0;
import c8.k1;
import c8.m1;
import h9.t0;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
public final class x {
    public static final char[] d = {'\r', '\n'};
    public static final char[] f13833e = {'\n'};
    public static final t0 f13834f = t0.p(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean f13835g = new AtomicBoolean();
    public byte[] f13836a;
    public int f13837b;
    public int f13838c;

    public x() {
        this.f13836a = l0.f13787b;
    }

    public static int b(int i7, int i10, int i11, int i12) {
        byte b10 = (byte) i11;
        return k1.c((byte) 0, m1.a(((i7 & 7) << 2) | ((i10 & 48) >> 4)), m1.a(((((byte) i10) & 15) << 4) | ((b10 & 60) >> 2)), m1.a(((b10 & 3) << 6) | (((byte) i12) & 63)));
    }

    public static int d(Charset charset) {
        la.h(f13834f.contains(charset), "Unsupported charset: %s", charset);
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
        f(1);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        this.f13837b = i7 + 1;
        return bArr[i7] & 255;
    }

    public final int B() {
        f(4);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        this.f13837b = i7 + 2;
        int i11 = (bArr[i10] & 255) | ((bArr[i7] & 255) << 8);
        this.f13837b = i7 + 4;
        return i11;
    }

    public final long C() {
        f(4);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        int i11 = i7 + 2;
        this.f13837b = i11;
        int i12 = i7 + 3;
        this.f13837b = i12;
        this.f13837b = i7 + 4;
        return (bArr[i12] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
    }

    public final int D() {
        f(3);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        int i11 = i7 + 2;
        this.f13837b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f13837b = i7 + 3;
        return (bArr[i11] & 255) | i12 | ((bArr[i7] & 255) << 16);
    }

    public final int E() {
        int m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException(i5.c.i(m10, "Top bit not zero: "));
    }

    public final int F() {
        long j3 = 0;
        for (int i7 = 0; i7 < 9; i7++) {
            if (this.f13837b != this.f13838c) {
                long A = A();
                j3 |= (127 & A) << (i7 * 7);
                if ((A & 128) == 0) {
                    break;
                }
            } else {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
        }
        return k1.b(j3);
    }

    public final long G() {
        long u10 = u();
        if (u10 >= 0) {
            return u10;
        }
        throw new IllegalStateException(p0.o(u10, "Top bit not zero: "));
    }

    public final int H() {
        f(2);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        this.f13837b = i7 + 2;
        return (bArr[i10] & 255) | ((bArr[i7] & 255) << 8);
    }

    public final long I() {
        int i7;
        byte b10;
        int i10;
        f(1);
        long j3 = this.f13836a[this.f13837b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j3) != 0) {
                i11--;
            } else if (i11 < 6) {
                j3 &= i10 - 1;
                i7 = 7 - i11;
            } else if (i11 == 7) {
                i7 = 1;
            }
        }
        i7 = 0;
        if (i7 != 0) {
            f(i7);
            for (int i12 = 1; i12 < i7; i12++) {
                if ((this.f13836a[this.f13837b + i12] & 192) == 128) {
                    j3 = (j3 << 6) | (b10 & 63);
                } else {
                    throw new NumberFormatException(p0.o(j3, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.f13837b += i7;
            return j3;
        }
        throw new NumberFormatException(p0.o(j3, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset J() {
        if (a() >= 3) {
            byte[] bArr = this.f13836a;
            int i7 = this.f13837b;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f13837b = i7 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f13836a;
            int i10 = this.f13837b;
            byte b10 = bArr2[i10];
            if (b10 == -2 && bArr2[i10 + 1] == -1) {
                this.f13837b = i10 + 2;
                return StandardCharsets.UTF_16BE;
            } else if (b10 == -1 && bArr2[i10 + 1] == -2) {
                this.f13837b = i10 + 2;
                return StandardCharsets.UTF_16LE;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void K(int i7) {
        byte[] bArr = this.f13836a;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        L(i7, bArr);
    }

    public final void L(int i7, byte[] bArr) {
        this.f13836a = bArr;
        this.f13838c = i7;
        this.f13837b = 0;
    }

    public final void M(int i7) {
        boolean z10;
        if (i7 >= 0 && i7 <= this.f13836a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f13838c = i7;
    }

    public final void N(int i7) {
        boolean z10;
        if (i7 >= 0 && i7 <= this.f13838c) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        this.f13837b = i7;
    }

    public final void O(int i7) {
        N(this.f13837b + i7);
    }

    public final int a() {
        return Math.max(this.f13838c - this.f13837b, 0);
    }

    public final void c(int i7) {
        byte[] bArr = this.f13836a;
        if (i7 > bArr.length) {
            this.f13836a = Arrays.copyOf(bArr, i7);
        }
    }

    public final void f(int i7) {
        if (f13835g.get() && a() < i7) {
            StringBuilder m10 = i5.c.m(i7, "bytesNeeded= ", ", bytesLeft=");
            m10.append(a());
            throw new IndexOutOfBoundsException(m10.toString());
        }
    }

    public final char g(int i7, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        f(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f13836a;
            int i10 = this.f13837b + i7;
            b10 = bArr[i10];
            b11 = bArr[i10 + 1];
        } else {
            byte[] bArr2 = this.f13836a;
            int i11 = this.f13837b + i7;
            b10 = bArr2[i11 + 1];
            b11 = bArr2[i11];
        }
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public final int h(Charset charset) {
        ByteOrder byteOrder;
        int i7;
        int i10;
        int i11;
        la.h(f13834f.contains(charset), "Unsupported charset: %s", charset);
        if (a() >= d(charset)) {
            int i12 = 1;
            if (charset.equals(StandardCharsets.US_ASCII)) {
                byte b10 = this.f13836a[this.f13837b];
                if ((b10 & 128) != 0) {
                    return 0;
                }
                i7 = b10 & 255;
            } else if (charset.equals(StandardCharsets.UTF_8)) {
                byte b11 = this.f13836a[this.f13837b];
                if ((b11 & 128) == 0) {
                    i10 = 1;
                } else if ((b11 & 224) == 192 && a() >= 2 && e(this.f13836a[this.f13837b + 1])) {
                    i10 = 2;
                } else if ((this.f13836a[this.f13837b] & 240) == 224 && a() >= 3 && e(this.f13836a[this.f13837b + 1]) && e(this.f13836a[this.f13837b + 2])) {
                    i10 = 3;
                } else if ((this.f13836a[this.f13837b] & 248) == 240 && a() >= 4 && e(this.f13836a[this.f13837b + 1]) && e(this.f13836a[this.f13837b + 2]) && e(this.f13836a[this.f13837b + 3])) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return 0;
                            }
                            byte[] bArr = this.f13836a;
                            int i13 = this.f13837b;
                            i11 = b(bArr[i13], bArr[i13 + 1], bArr[i13 + 2], bArr[i13 + 3]);
                        } else {
                            byte[] bArr2 = this.f13836a;
                            int i14 = this.f13837b;
                            i11 = b(0, bArr2[i14] & 15, bArr2[i14 + 1], bArr2[i14 + 2]);
                        }
                    } else {
                        byte[] bArr3 = this.f13836a;
                        int i15 = this.f13837b;
                        i11 = b(0, 0, bArr3[i15], bArr3[i15 + 1]);
                    }
                } else {
                    i11 = this.f13836a[this.f13837b] & 255;
                }
                i12 = i10;
                i7 = i11;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
                char g10 = g(0, byteOrder);
                if (Character.isHighSurrogate(g10) && a() >= 4) {
                    i7 = Character.toCodePoint(g10, g(2, byteOrder));
                    i12 = 4;
                } else {
                    i7 = g10;
                    i12 = 2;
                }
            }
            return (i7 << 8) | i12;
        }
        throw new IndexOutOfBoundsException("position=" + this.f13837b + ", limit=" + this.f13838c);
    }

    public final int i() {
        if (a() >= 4) {
            int m10 = m();
            this.f13837b -= 4;
            return m10;
        }
        throw new IndexOutOfBoundsException("position=" + this.f13837b + ", limit=" + this.f13838c);
    }

    public final int j() {
        f(1);
        return this.f13836a[this.f13837b] & 255;
    }

    public final void k(int i7, int i10, byte[] bArr) {
        f(i10);
        System.arraycopy(this.f13836a, this.f13837b, bArr, i7, i10);
        this.f13837b += i10;
    }

    public final char l(Charset charset, char[] cArr) {
        int h;
        boolean z10;
        if (a() >= d(charset) && (h = h(charset)) != 0) {
            long j3 = h >>> 8;
            boolean z11 = true;
            if ((j3 >> 32) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.d(j3, "out of range: %s", z10);
            int i7 = (int) j3;
            if (!Character.isSupplementaryCodePoint(i7)) {
                long j10 = i7;
                char c10 = (char) j10;
                if (c10 != j10) {
                    z11 = false;
                }
                la.d(j10, "Out of range: %s", z11);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.f13837b = k1.b(h & 255) + this.f13837b;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        int i11 = i7 + 2;
        this.f13837b = i11;
        int i12 = ((bArr[i10] & 255) << 16) | ((bArr[i7] & 255) << 24);
        int i13 = i7 + 3;
        this.f13837b = i13;
        this.f13837b = i7 + 4;
        return (bArr[i13] & 255) | i12 | ((bArr[i11] & 255) << 8);
    }

    public final String n(Charset charset) {
        int i7;
        la.h(f13834f.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            J();
        }
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i7 = 2;
        } else {
            i7 = 1;
        }
        int i10 = this.f13837b;
        while (true) {
            int i11 = this.f13838c;
            if (i10 < i11 - (i7 - 1)) {
                if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && l0.O(this.f13836a[i10])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.f13836a;
                    if (bArr[i10] == 0 && l0.O(bArr[i10 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.f13836a;
                    if (bArr2[i10 + 1] == 0 && l0.O(bArr2[i10])) {
                        break;
                    }
                }
                i10 += i7;
            } else {
                i10 = i11;
                break;
            }
        }
        String y10 = y(i10 - this.f13837b, charset);
        if (this.f13837b != this.f13838c && l(charset, d) == '\r') {
            l(charset, f13833e);
        }
        return y10;
    }

    public final int o() {
        f(4);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        int i11 = i7 + 2;
        this.f13837b = i11;
        int i12 = ((bArr[i10] & 255) << 8) | (bArr[i7] & 255);
        int i13 = i7 + 3;
        this.f13837b = i13;
        this.f13837b = i7 + 4;
        return ((bArr[i13] & 255) << 24) | i12 | ((bArr[i11] & 255) << 16);
    }

    public final long p() {
        f(8);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        int i11 = i7 + 2;
        this.f13837b = i11;
        int i12 = i7 + 3;
        this.f13837b = i12;
        long j3 = (bArr[i7] & 255) | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16);
        int i13 = i7 + 4;
        this.f13837b = i13;
        int i14 = i7 + 5;
        this.f13837b = i14;
        long j10 = j3 | ((bArr[i12] & 255) << 24) | ((bArr[i13] & 255) << 32);
        int i15 = i7 + 6;
        this.f13837b = i15;
        int i16 = i7 + 7;
        this.f13837b = i16;
        this.f13837b = i7 + 8;
        return ((bArr[i16] & 255) << 56) | j10 | ((bArr[i14] & 255) << 40) | ((bArr[i15] & 255) << 48);
    }

    public final short q() {
        f(2);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        this.f13837b = i7 + 2;
        return (short) (((bArr[i10] & 255) << 8) | (bArr[i7] & 255));
    }

    public final long r() {
        f(4);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        int i11 = i7 + 2;
        this.f13837b = i11;
        int i12 = i7 + 3;
        this.f13837b = i12;
        this.f13837b = i7 + 4;
        return ((bArr[i12] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16);
    }

    public final int s() {
        int o4 = o();
        if (o4 >= 0) {
            return o4;
        }
        throw new IllegalStateException(i5.c.i(o4, "Top bit not zero: "));
    }

    public final int t() {
        f(2);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        this.f13837b = i7 + 2;
        return ((bArr[i10] & 255) << 8) | (bArr[i7] & 255);
    }

    public final long u() {
        f(8);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        int i11 = i7 + 2;
        this.f13837b = i11;
        int i12 = i7 + 3;
        this.f13837b = i12;
        long j3 = ((bArr[i7] & 255) << 56) | ((bArr[i10] & 255) << 48) | ((bArr[i11] & 255) << 40);
        int i13 = i7 + 4;
        this.f13837b = i13;
        int i14 = i7 + 5;
        this.f13837b = i14;
        long j10 = j3 | ((bArr[i12] & 255) << 32) | ((bArr[i13] & 255) << 24);
        int i15 = i7 + 6;
        this.f13837b = i15;
        int i16 = i7 + 7;
        this.f13837b = i16;
        this.f13837b = i7 + 8;
        return (bArr[i16] & 255) | j10 | ((bArr[i14] & 255) << 16) | ((bArr[i15] & 255) << 8);
    }

    public final String v() {
        if (a() == 0) {
            return null;
        }
        int i7 = this.f13837b;
        while (i7 < this.f13838c && this.f13836a[i7] != 0) {
            i7++;
        }
        byte[] bArr = this.f13836a;
        int i10 = this.f13837b;
        String str = l0.f13786a;
        String str2 = new String(bArr, i10, i7 - i10, StandardCharsets.UTF_8);
        this.f13837b = i7;
        if (i7 < this.f13838c) {
            this.f13837b = i7 + 1;
        }
        return str2;
    }

    public final String w(int i7) {
        int i10;
        f(i7);
        if (i7 == 0) {
            return "";
        }
        int i11 = this.f13837b;
        int i12 = (i11 + i7) - 1;
        if (i12 < this.f13838c && this.f13836a[i12] == 0) {
            i10 = i7 - 1;
        } else {
            i10 = i7;
        }
        byte[] bArr = this.f13836a;
        String str = l0.f13786a;
        String str2 = new String(bArr, i11, i10, StandardCharsets.UTF_8);
        this.f13837b += i7;
        return str2;
    }

    public final short x() {
        f(2);
        byte[] bArr = this.f13836a;
        int i7 = this.f13837b;
        int i10 = i7 + 1;
        this.f13837b = i10;
        this.f13837b = i7 + 2;
        return (short) ((bArr[i10] & 255) | ((bArr[i7] & 255) << 8));
    }

    public final String y(int i7, Charset charset) {
        f(i7);
        String str = new String(this.f13836a, this.f13837b, i7, charset);
        this.f13837b += i7;
        return str;
    }

    public final int z() {
        return (A() << 21) | (A() << 14) | (A() << 7) | A();
    }

    public x(int i7) {
        this.f13836a = new byte[i7];
        this.f13838c = i7;
    }

    public x(byte[] bArr) {
        this.f13836a = bArr;
        this.f13838c = bArr.length;
    }

    public x(byte[] bArr, int i7) {
        this.f13836a = bArr;
        this.f13838c = i7;
    }
}
