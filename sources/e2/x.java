package e2;

import a8.ed;
import a8.gd;
import a8.yb;
import f9.t0;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
public final class x {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final t0 f9730f = t0.t(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean f9731g = new AtomicBoolean();
    public byte[] f9732a;
    public int f9733b;
    public int f9734c;

    public x() {
        this.f9732a = n0.f9693b;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        byte b10 = (byte) i12;
        return ed.c((byte) 0, gd.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), gd.a(((((byte) i11) & 15) << 4) | ((b10 & 60) >> 2)), gd.a(((b10 & 3) << 6) | (((byte) i13) & 63)));
    }

    public static int d(Charset charset) {
        yb.h(f9730f.contains(charset), "Unsupported charset: %s", charset);
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
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        this.f9733b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int B() {
        f(4);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        this.f9733b = i10 + 2;
        int i12 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f9733b = i10 + 4;
        return i12;
    }

    public final long C() {
        f(4);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        int i12 = i10 + 2;
        this.f9733b = i12;
        int i13 = i10 + 3;
        this.f9733b = i13;
        this.f9733b = i10 + 4;
        return (bArr[i13] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
    }

    public final int D() {
        f(3);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        int i12 = i10 + 2;
        this.f9733b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f9733b = i10 + 3;
        return (bArr[i12] & 255) | i13 | ((bArr[i10] & 255) << 16);
    }

    public final int E() {
        int m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException(ic.a.i(m10, "Top bit not zero: "));
    }

    public final int F() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f9733b != this.f9734c) {
                long A = A();
                j10 |= (127 & A) << (i10 * 7);
                if ((A & 128) == 0) {
                    break;
                }
            } else {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
        }
        return ed.b(j10);
    }

    public final long G() {
        long u10 = u();
        if (u10 >= 0) {
            return u10;
        }
        throw new IllegalStateException(a1.g.o(u10, "Top bit not zero: "));
    }

    public final int H() {
        f(2);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        this.f9733b = i10 + 2;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public final long I() {
        int i10;
        byte b10;
        int i11;
        f(1);
        long j10 = this.f9732a[this.f9733b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= i11 - 1;
                i10 = 7 - i12;
            } else if (i12 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 != 0) {
            f(i10);
            for (int i13 = 1; i13 < i10; i13++) {
                if ((this.f9732a[this.f9733b + i13] & 192) == 128) {
                    j10 = (j10 << 6) | (b10 & 63);
                } else {
                    throw new NumberFormatException(a1.g.o(j10, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.f9733b += i10;
            return j10;
        }
        throw new NumberFormatException(a1.g.o(j10, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset J() {
        if (a() >= 3) {
            byte[] bArr = this.f9732a;
            int i10 = this.f9733b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f9733b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f9732a;
            int i11 = this.f9733b;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f9733b = i11 + 2;
                return StandardCharsets.UTF_16BE;
            } else if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f9733b = i11 + 2;
                return StandardCharsets.UTF_16LE;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void K(int i10) {
        byte[] bArr = this.f9732a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        L(i10, bArr);
    }

    public final void L(int i10, byte[] bArr) {
        this.f9732a = bArr;
        this.f9734c = i10;
        this.f9733b = 0;
    }

    public final void M(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f9732a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        this.f9734c = i10;
    }

    public final void N(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f9734c) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        this.f9733b = i10;
    }

    public final void O(int i10) {
        N(this.f9733b + i10);
    }

    public final int a() {
        return Math.max(this.f9734c - this.f9733b, 0);
    }

    public final void c(int i10) {
        byte[] bArr = this.f9732a;
        if (i10 > bArr.length) {
            this.f9732a = Arrays.copyOf(bArr, i10);
        }
    }

    public final void f(int i10) {
        if (f9731g.get() && a() < i10) {
            StringBuilder k10 = ic.a.k(i10, "bytesNeeded= ", ", bytesLeft=");
            k10.append(a());
            throw new IndexOutOfBoundsException(k10.toString());
        }
    }

    public final char g(int i10, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        f(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f9732a;
            int i11 = this.f9733b + i10;
            b10 = bArr[i11];
            b11 = bArr[i11 + 1];
        } else {
            byte[] bArr2 = this.f9732a;
            int i12 = this.f9733b + i10;
            b10 = bArr2[i12 + 1];
            b11 = bArr2[i12];
        }
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public final int h(Charset charset) {
        ByteOrder byteOrder;
        int i10;
        int i11;
        int i12;
        yb.h(f9730f.contains(charset), "Unsupported charset: %s", charset);
        if (a() >= d(charset)) {
            int i13 = 1;
            if (charset.equals(StandardCharsets.US_ASCII)) {
                byte b10 = this.f9732a[this.f9733b];
                if ((b10 & 128) != 0) {
                    return 0;
                }
                i10 = b10 & 255;
            } else if (charset.equals(StandardCharsets.UTF_8)) {
                byte b11 = this.f9732a[this.f9733b];
                if ((b11 & 128) == 0) {
                    i11 = 1;
                } else if ((b11 & 224) == 192 && a() >= 2 && e(this.f9732a[this.f9733b + 1])) {
                    i11 = 2;
                } else if ((this.f9732a[this.f9733b] & 240) == 224 && a() >= 3 && e(this.f9732a[this.f9733b + 1]) && e(this.f9732a[this.f9733b + 2])) {
                    i11 = 3;
                } else if ((this.f9732a[this.f9733b] & 248) == 240 && a() >= 4 && e(this.f9732a[this.f9733b + 1]) && e(this.f9732a[this.f9733b + 2]) && e(this.f9732a[this.f9733b + 3])) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                return 0;
                            }
                            byte[] bArr = this.f9732a;
                            int i14 = this.f9733b;
                            i12 = b(bArr[i14], bArr[i14 + 1], bArr[i14 + 2], bArr[i14 + 3]);
                        } else {
                            byte[] bArr2 = this.f9732a;
                            int i15 = this.f9733b;
                            i12 = b(0, bArr2[i15] & 15, bArr2[i15 + 1], bArr2[i15 + 2]);
                        }
                    } else {
                        byte[] bArr3 = this.f9732a;
                        int i16 = this.f9733b;
                        i12 = b(0, 0, bArr3[i16], bArr3[i16 + 1]);
                    }
                } else {
                    i12 = this.f9732a[this.f9733b] & 255;
                }
                i13 = i11;
                i10 = i12;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                } else {
                    byteOrder = ByteOrder.BIG_ENDIAN;
                }
                char g7 = g(0, byteOrder);
                if (Character.isHighSurrogate(g7) && a() >= 4) {
                    i10 = Character.toCodePoint(g7, g(2, byteOrder));
                    i13 = 4;
                } else {
                    i10 = g7;
                    i13 = 2;
                }
            }
            return (i10 << 8) | i13;
        }
        throw new IndexOutOfBoundsException("position=" + this.f9733b + ", limit=" + this.f9734c);
    }

    public final int i() {
        if (a() >= 4) {
            int m10 = m();
            this.f9733b -= 4;
            return m10;
        }
        throw new IndexOutOfBoundsException("position=" + this.f9733b + ", limit=" + this.f9734c);
    }

    public final int j() {
        f(1);
        return this.f9732a[this.f9733b] & 255;
    }

    public final void k(int i10, int i11, byte[] bArr) {
        f(i11);
        System.arraycopy(this.f9732a, this.f9733b, bArr, i10, i11);
        this.f9733b += i11;
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
            yb.c(j10, "out of range: %s", z10);
            int i10 = (int) j10;
            if (!Character.isSupplementaryCodePoint(i10)) {
                long j11 = i10;
                char c10 = (char) j11;
                if (c10 != j11) {
                    z11 = false;
                }
                yb.c(j11, "Out of range: %s", z11);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.f9733b = ed.b(h & 255) + this.f9733b;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        int i12 = i10 + 2;
        this.f9733b = i12;
        int i13 = ((bArr[i11] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i14 = i10 + 3;
        this.f9733b = i14;
        this.f9733b = i10 + 4;
        return (bArr[i14] & 255) | i13 | ((bArr[i12] & 255) << 8);
    }

    public final String n(Charset charset) {
        int i10;
        yb.h(f9730f.contains(charset), "Unsupported charset: %s", charset);
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
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f9733b;
        while (true) {
            int i12 = this.f9734c;
            if (i11 < i12 - (i10 - 1)) {
                if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && n0.O(this.f9732a[i11])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.f9732a;
                    if (bArr[i11] == 0 && n0.O(bArr[i11 + 1])) {
                        break;
                    }
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    byte[] bArr2 = this.f9732a;
                    if (bArr2[i11 + 1] == 0 && n0.O(bArr2[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                i11 = i12;
                break;
            }
        }
        String y3 = y(i11 - this.f9733b, charset);
        if (this.f9733b != this.f9734c && l(charset, d) == '\r') {
            l(charset, e);
        }
        return y3;
    }

    public final int o() {
        f(4);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        int i12 = i10 + 2;
        this.f9733b = i12;
        int i13 = ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
        int i14 = i10 + 3;
        this.f9733b = i14;
        this.f9733b = i10 + 4;
        return ((bArr[i14] & 255) << 24) | i13 | ((bArr[i12] & 255) << 16);
    }

    public final long p() {
        f(8);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        int i12 = i10 + 2;
        this.f9733b = i12;
        int i13 = i10 + 3;
        this.f9733b = i13;
        long j10 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
        int i14 = i10 + 4;
        this.f9733b = i14;
        int i15 = i10 + 5;
        this.f9733b = i15;
        long j11 = j10 | ((bArr[i13] & 255) << 24) | ((bArr[i14] & 255) << 32);
        int i16 = i10 + 6;
        this.f9733b = i16;
        int i17 = i10 + 7;
        this.f9733b = i17;
        this.f9733b = i10 + 8;
        return ((bArr[i17] & 255) << 56) | j11 | ((bArr[i15] & 255) << 40) | ((bArr[i16] & 255) << 48);
    }

    public final short q() {
        f(2);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        this.f9733b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | (bArr[i10] & 255));
    }

    public final long r() {
        f(4);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        int i12 = i10 + 2;
        this.f9733b = i12;
        int i13 = i10 + 3;
        this.f9733b = i13;
        this.f9733b = i10 + 4;
        return ((bArr[i13] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    public final int s() {
        int o10 = o();
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException(ic.a.i(o10, "Top bit not zero: "));
    }

    public final int t() {
        f(2);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        this.f9733b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public final long u() {
        f(8);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        int i12 = i10 + 2;
        this.f9733b = i12;
        int i13 = i10 + 3;
        this.f9733b = i13;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40);
        int i14 = i10 + 4;
        this.f9733b = i14;
        int i15 = i10 + 5;
        this.f9733b = i15;
        long j11 = j10 | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24);
        int i16 = i10 + 6;
        this.f9733b = i16;
        int i17 = i10 + 7;
        this.f9733b = i17;
        this.f9733b = i10 + 8;
        return (bArr[i17] & 255) | j11 | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8);
    }

    public final String v() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f9733b;
        while (i10 < this.f9734c && this.f9732a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f9732a;
        int i11 = this.f9733b;
        String str = n0.f9692a;
        String str2 = new String(bArr, i11, i10 - i11, StandardCharsets.UTF_8);
        this.f9733b = i10;
        if (i10 < this.f9734c) {
            this.f9733b = i10 + 1;
        }
        return str2;
    }

    public final String w(int i10) {
        int i11;
        f(i10);
        if (i10 == 0) {
            return "";
        }
        int i12 = this.f9733b;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.f9734c && this.f9732a[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        byte[] bArr = this.f9732a;
        String str = n0.f9692a;
        String str2 = new String(bArr, i12, i11, StandardCharsets.UTF_8);
        this.f9733b += i10;
        return str2;
    }

    public final short x() {
        f(2);
        byte[] bArr = this.f9732a;
        int i10 = this.f9733b;
        int i11 = i10 + 1;
        this.f9733b = i11;
        this.f9733b = i10 + 2;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public final String y(int i10, Charset charset) {
        f(i10);
        String str = new String(this.f9732a, this.f9733b, i10, charset);
        this.f9733b += i10;
        return str;
    }

    public final int z() {
        return (A() << 21) | (A() << 14) | (A() << 7) | A();
    }

    public x(int i10) {
        this.f9732a = new byte[i10];
        this.f9734c = i10;
    }

    public x(byte[] bArr) {
        this.f9732a = bArr;
        this.f9734c = bArr.length;
    }

    public x(byte[] bArr, int i10) {
        this.f9732a = bArr;
        this.f9734c = i10;
    }
}
