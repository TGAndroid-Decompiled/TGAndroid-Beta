package g2;

import b8.od;
import b8.qd;
import b8.zb;
import g9.t0;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.p1;
public final class y {
    public static final char[] d = {'\r', '\n'};
    public static final char[] f11920e = {'\n'};
    public static final t0 f11921f = t0.p(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean f11922g = new AtomicBoolean();
    public byte[] f11923a;
    public int f11924b;
    public int f11925c;

    public y() {
        this.f11923a = n0.f11874b;
    }

    public static int b(int i3, int i10, int i11, int i12) {
        byte b10 = (byte) i11;
        return od.c((byte) 0, qd.a(((i3 & 7) << 2) | ((i10 & 48) >> 4)), qd.a(((((byte) i10) & 15) << 4) | ((b10 & 60) >> 2)), qd.a(((b10 & 3) << 6) | (((byte) i12) & 63)));
    }

    public static int d(Charset charset) {
        zb.h(f11921f.contains(charset), "Unsupported charset: %s", charset);
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
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        this.f11924b = i3 + 1;
        return bArr[i3] & 255;
    }

    public final int B() {
        f(4);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        this.f11924b = i3 + 2;
        int i11 = (bArr[i10] & 255) | ((bArr[i3] & 255) << 8);
        this.f11924b = i3 + 4;
        return i11;
    }

    public final long C() {
        f(4);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        int i11 = i3 + 2;
        this.f11924b = i11;
        int i12 = i3 + 3;
        this.f11924b = i12;
        this.f11924b = i3 + 4;
        return (bArr[i12] & 255) | ((bArr[i3] & 255) << 24) | ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
    }

    public final int D() {
        f(3);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        int i11 = i3 + 2;
        this.f11924b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f11924b = i3 + 3;
        return (bArr[i11] & 255) | i12 | ((bArr[i3] & 255) << 16);
    }

    public final int E() {
        int m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException(p1.i(m10, "Top bit not zero: "));
    }

    public final int F() {
        long j10 = 0;
        for (int i3 = 0; i3 < 9; i3++) {
            if (this.f11924b != this.f11925c) {
                long A = A();
                j10 |= (127 & A) << (i3 * 7);
                if ((A & 128) == 0) {
                    break;
                }
            } else {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
        }
        return od.b(j10);
    }

    public final long G() {
        long u10 = u();
        if (u10 >= 0) {
            return u10;
        }
        throw new IllegalStateException(a1.g.p(u10, "Top bit not zero: "));
    }

    public final int H() {
        f(2);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        this.f11924b = i3 + 2;
        return (bArr[i10] & 255) | ((bArr[i3] & 255) << 8);
    }

    public final long I() {
        int i3;
        byte b10;
        int i10;
        f(1);
        long j10 = this.f11923a[this.f11924b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j10) != 0) {
                i11--;
            } else if (i11 < 6) {
                j10 &= i10 - 1;
                i3 = 7 - i11;
            } else if (i11 == 7) {
                i3 = 1;
            }
        }
        i3 = 0;
        if (i3 != 0) {
            f(i3);
            for (int i12 = 1; i12 < i3; i12++) {
                if ((this.f11923a[this.f11924b + i12] & 192) == 128) {
                    j10 = (j10 << 6) | (b10 & 63);
                } else {
                    throw new NumberFormatException(a1.g.p(j10, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.f11924b += i3;
            return j10;
        }
        throw new NumberFormatException(a1.g.p(j10, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset J() {
        if (a() >= 3) {
            byte[] bArr = this.f11923a;
            int i3 = this.f11924b;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.f11924b = i3 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f11923a;
            int i10 = this.f11924b;
            byte b10 = bArr2[i10];
            if (b10 == -2 && bArr2[i10 + 1] == -1) {
                this.f11924b = i10 + 2;
                return StandardCharsets.UTF_16BE;
            } else if (b10 == -1 && bArr2[i10 + 1] == -2) {
                this.f11924b = i10 + 2;
                return StandardCharsets.UTF_16LE;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void K(int i3) {
        byte[] bArr = this.f11923a;
        if (bArr.length < i3) {
            bArr = new byte[i3];
        }
        L(i3, bArr);
    }

    public final void L(int i3, byte[] bArr) {
        this.f11923a = bArr;
        this.f11925c = i3;
        this.f11924b = 0;
    }

    public final void M(int i3) {
        boolean z10;
        if (i3 >= 0 && i3 <= this.f11923a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        this.f11925c = i3;
    }

    public final void N(int i3) {
        boolean z10;
        if (i3 >= 0 && i3 <= this.f11925c) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        this.f11924b = i3;
    }

    public final void O(int i3) {
        N(this.f11924b + i3);
    }

    public final int a() {
        return Math.max(this.f11925c - this.f11924b, 0);
    }

    public final void c(int i3) {
        byte[] bArr = this.f11923a;
        if (i3 > bArr.length) {
            this.f11923a = Arrays.copyOf(bArr, i3);
        }
    }

    public final void f(int i3) {
        if (f11922g.get() && a() < i3) {
            StringBuilder m10 = p1.m(i3, "bytesNeeded= ", ", bytesLeft=");
            m10.append(a());
            throw new IndexOutOfBoundsException(m10.toString());
        }
    }

    public final char g(int i3, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        f(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f11923a;
            int i10 = this.f11924b + i3;
            b10 = bArr[i10];
            b11 = bArr[i10 + 1];
        } else {
            byte[] bArr2 = this.f11923a;
            int i11 = this.f11924b + i3;
            b10 = bArr2[i11 + 1];
            b11 = bArr2[i11];
        }
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public final int h(Charset charset) {
        ByteOrder byteOrder;
        int i3;
        int i10;
        int i11;
        zb.h(f11921f.contains(charset), "Unsupported charset: %s", charset);
        if (a() >= d(charset)) {
            int i12 = 1;
            if (charset.equals(StandardCharsets.US_ASCII)) {
                byte b10 = this.f11923a[this.f11924b];
                if ((b10 & 128) != 0) {
                    return 0;
                }
                i3 = b10 & 255;
            } else if (charset.equals(StandardCharsets.UTF_8)) {
                byte b11 = this.f11923a[this.f11924b];
                if ((b11 & 128) == 0) {
                    i10 = 1;
                } else if ((b11 & 224) == 192 && a() >= 2 && e(this.f11923a[this.f11924b + 1])) {
                    i10 = 2;
                } else if ((this.f11923a[this.f11924b] & 240) == 224 && a() >= 3 && e(this.f11923a[this.f11924b + 1]) && e(this.f11923a[this.f11924b + 2])) {
                    i10 = 3;
                } else if ((this.f11923a[this.f11924b] & 248) == 240 && a() >= 4 && e(this.f11923a[this.f11924b + 1]) && e(this.f11923a[this.f11924b + 2]) && e(this.f11923a[this.f11924b + 3])) {
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
                            byte[] bArr = this.f11923a;
                            int i13 = this.f11924b;
                            i11 = b(bArr[i13], bArr[i13 + 1], bArr[i13 + 2], bArr[i13 + 3]);
                        } else {
                            byte[] bArr2 = this.f11923a;
                            int i14 = this.f11924b;
                            i11 = b(0, bArr2[i14] & 15, bArr2[i14 + 1], bArr2[i14 + 2]);
                        }
                    } else {
                        byte[] bArr3 = this.f11923a;
                        int i15 = this.f11924b;
                        i11 = b(0, 0, bArr3[i15], bArr3[i15 + 1]);
                    }
                } else {
                    i11 = this.f11923a[this.f11924b] & 255;
                }
                i12 = i10;
                i3 = i11;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
                char g7 = g(0, byteOrder);
                if (Character.isHighSurrogate(g7) && a() >= 4) {
                    i3 = Character.toCodePoint(g7, g(2, byteOrder));
                    i12 = 4;
                } else {
                    i3 = g7;
                    i12 = 2;
                }
            }
            return (i3 << 8) | i12;
        }
        throw new IndexOutOfBoundsException("position=" + this.f11924b + ", limit=" + this.f11925c);
    }

    public final int i() {
        if (a() >= 4) {
            int m10 = m();
            this.f11924b -= 4;
            return m10;
        }
        throw new IndexOutOfBoundsException("position=" + this.f11924b + ", limit=" + this.f11925c);
    }

    public final int j() {
        f(1);
        return this.f11923a[this.f11924b] & 255;
    }

    public final void k(int i3, int i10, byte[] bArr) {
        f(i10);
        System.arraycopy(this.f11923a, this.f11924b, bArr, i3, i10);
        this.f11924b += i10;
    }

    public final char l(Charset charset, char[] cArr) {
        int h;
        boolean z10;
        if (a() >= d(charset) && (h = h(charset)) != 0) {
            long j10 = h >>> 8;
            boolean z11 = true;
            if ((j10 >> 32) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.d(j10, "out of range: %s", z10);
            int i3 = (int) j10;
            if (!Character.isSupplementaryCodePoint(i3)) {
                long j11 = i3;
                char c2 = (char) j11;
                if (c2 != j11) {
                    z11 = false;
                }
                zb.d(j11, "Out of range: %s", z11);
                for (char c10 : cArr) {
                    if (c10 == c2) {
                        this.f11924b = od.b(h & 255) + this.f11924b;
                        return c2;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        int i11 = i3 + 2;
        this.f11924b = i11;
        int i12 = ((bArr[i10] & 255) << 16) | ((bArr[i3] & 255) << 24);
        int i13 = i3 + 3;
        this.f11924b = i13;
        this.f11924b = i3 + 4;
        return (bArr[i13] & 255) | i12 | ((bArr[i11] & 255) << 8);
    }

    public final String n(Charset charset) {
        int i3;
        zb.h(f11921f.contains(charset), "Unsupported charset: %s", charset);
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
            i3 = 2;
        } else {
            i3 = 1;
        }
        int i10 = this.f11924b;
        while (true) {
            int i11 = this.f11925c;
            if (i10 < i11 - (i3 - 1)) {
                if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && n0.O(this.f11923a[i10])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.f11923a;
                    if (bArr[i10] == 0 && n0.O(bArr[i10 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.f11923a;
                    if (bArr2[i10 + 1] == 0 && n0.O(bArr2[i10])) {
                        break;
                    }
                }
                i10 += i3;
            } else {
                i10 = i11;
                break;
            }
        }
        String y9 = y(i10 - this.f11924b, charset);
        if (this.f11924b != this.f11925c && l(charset, d) == '\r') {
            l(charset, f11920e);
        }
        return y9;
    }

    public final int o() {
        f(4);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        int i11 = i3 + 2;
        this.f11924b = i11;
        int i12 = ((bArr[i10] & 255) << 8) | (bArr[i3] & 255);
        int i13 = i3 + 3;
        this.f11924b = i13;
        this.f11924b = i3 + 4;
        return ((bArr[i13] & 255) << 24) | i12 | ((bArr[i11] & 255) << 16);
    }

    public final long p() {
        f(8);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        int i11 = i3 + 2;
        this.f11924b = i11;
        int i12 = i3 + 3;
        this.f11924b = i12;
        long j10 = (bArr[i3] & 255) | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16);
        int i13 = i3 + 4;
        this.f11924b = i13;
        int i14 = i3 + 5;
        this.f11924b = i14;
        long j11 = j10 | ((bArr[i12] & 255) << 24) | ((bArr[i13] & 255) << 32);
        int i15 = i3 + 6;
        this.f11924b = i15;
        int i16 = i3 + 7;
        this.f11924b = i16;
        this.f11924b = i3 + 8;
        return ((bArr[i16] & 255) << 56) | j11 | ((bArr[i14] & 255) << 40) | ((bArr[i15] & 255) << 48);
    }

    public final short q() {
        f(2);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        this.f11924b = i3 + 2;
        return (short) (((bArr[i10] & 255) << 8) | (bArr[i3] & 255));
    }

    public final long r() {
        f(4);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        int i11 = i3 + 2;
        this.f11924b = i11;
        int i12 = i3 + 3;
        this.f11924b = i12;
        this.f11924b = i3 + 4;
        return ((bArr[i12] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16);
    }

    public final int s() {
        int o10 = o();
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException(p1.i(o10, "Top bit not zero: "));
    }

    public final int t() {
        f(2);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        this.f11924b = i3 + 2;
        return ((bArr[i10] & 255) << 8) | (bArr[i3] & 255);
    }

    public final long u() {
        f(8);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        int i11 = i3 + 2;
        this.f11924b = i11;
        int i12 = i3 + 3;
        this.f11924b = i12;
        long j10 = ((bArr[i3] & 255) << 56) | ((bArr[i10] & 255) << 48) | ((bArr[i11] & 255) << 40);
        int i13 = i3 + 4;
        this.f11924b = i13;
        int i14 = i3 + 5;
        this.f11924b = i14;
        long j11 = j10 | ((bArr[i12] & 255) << 32) | ((bArr[i13] & 255) << 24);
        int i15 = i3 + 6;
        this.f11924b = i15;
        int i16 = i3 + 7;
        this.f11924b = i16;
        this.f11924b = i3 + 8;
        return (bArr[i16] & 255) | j11 | ((bArr[i14] & 255) << 16) | ((bArr[i15] & 255) << 8);
    }

    public final String v() {
        if (a() == 0) {
            return null;
        }
        int i3 = this.f11924b;
        while (i3 < this.f11925c && this.f11923a[i3] != 0) {
            i3++;
        }
        byte[] bArr = this.f11923a;
        int i10 = this.f11924b;
        String str = n0.f11873a;
        String str2 = new String(bArr, i10, i3 - i10, StandardCharsets.UTF_8);
        this.f11924b = i3;
        if (i3 < this.f11925c) {
            this.f11924b = i3 + 1;
        }
        return str2;
    }

    public final String w(int i3) {
        int i10;
        f(i3);
        if (i3 == 0) {
            return "";
        }
        int i11 = this.f11924b;
        int i12 = (i11 + i3) - 1;
        if (i12 < this.f11925c && this.f11923a[i12] == 0) {
            i10 = i3 - 1;
        } else {
            i10 = i3;
        }
        byte[] bArr = this.f11923a;
        String str = n0.f11873a;
        String str2 = new String(bArr, i11, i10, StandardCharsets.UTF_8);
        this.f11924b += i3;
        return str2;
    }

    public final short x() {
        f(2);
        byte[] bArr = this.f11923a;
        int i3 = this.f11924b;
        int i10 = i3 + 1;
        this.f11924b = i10;
        this.f11924b = i3 + 2;
        return (short) ((bArr[i10] & 255) | ((bArr[i3] & 255) << 8));
    }

    public final String y(int i3, Charset charset) {
        f(i3);
        String str = new String(this.f11923a, this.f11924b, i3, charset);
        this.f11924b += i3;
        return str;
    }

    public final int z() {
        return (A() << 21) | (A() << 14) | (A() << 7) | A();
    }

    public y(int i3) {
        this.f11923a = new byte[i3];
        this.f11925c = i3;
    }

    public y(byte[] bArr) {
        this.f11923a = bArr;
        this.f11925c = bArr.length;
    }

    public y(byte[] bArr, int i3) {
        this.f11923a = bArr;
        this.f11925c = i3;
    }
}
