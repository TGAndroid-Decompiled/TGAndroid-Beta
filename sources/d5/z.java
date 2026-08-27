package d5;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class z {
    public static final char[] d = {'\r', '\n'};

    public static final char[] f4856e = {'\n'};

    public static final p8.c0 f4857f = p8.c0.t(5, o8.d.f19361a, o8.d.f19363c, o8.d.f19365f, o8.d.d, o8.d.f19364e);

    public byte[] f4858a;

    public int f4859b;

    public int f4860c;

    public z() {
        this.f4858a = g0.f4799f;
    }

    public final void A(int i10, byte[] bArr) {
        this.f4858a = bArr;
        this.f4860c = i10;
        this.f4859b = 0;
    }

    public final void B(int i10) {
        a.f(i10 >= 0 && i10 <= this.f4858a.length);
        this.f4860c = i10;
    }

    public final void C(int i10) {
        a.f(i10 >= 0 && i10 <= this.f4860c);
        this.f4859b = i10;
    }

    public final void D(int i10) {
        C(this.f4859b + i10);
    }

    public final int a() {
        return this.f4860c - this.f4859b;
    }

    public final void b(int i10) {
        byte[] bArr = this.f4858a;
        if (i10 > bArr.length) {
            this.f4858a = Arrays.copyOf(bArr, i10);
        }
    }

    public final void c(int i10, int i11, byte[] bArr) {
        System.arraycopy(this.f4858a, this.f4859b, bArr, i10, i11);
        this.f4859b += i11;
    }

    public final char d(Charset charset, char[] cArr) {
        char c10;
        int i10;
        byte b10;
        byte b11;
        if ((charset.equals(o8.d.f19363c) || charset.equals(o8.d.f19361a)) && a() >= 1) {
            long j10 = this.f4858a[this.f4859b] & 255;
            c10 = (char) j10;
            if (!(((long) c10) == j10)) {
                throw new IllegalArgumentException(h7.g0.a("Out of range: %s", Long.valueOf(j10)));
            }
            i10 = 1;
        } else {
            i10 = 2;
            if ((!charset.equals(o8.d.f19365f) && !charset.equals(o8.d.d)) || a() < 2) {
                if (charset.equals(o8.d.f19364e) && a() >= 2) {
                    byte[] bArr = this.f4858a;
                    int i11 = this.f4859b;
                    b10 = bArr[i11 + 1];
                    b11 = bArr[i11];
                }
                return (char) 0;
            }
            byte[] bArr2 = this.f4858a;
            int i12 = this.f4859b;
            b10 = bArr2[i12];
            b11 = bArr2[i12 + 1];
            c10 = (char) ((b11 & 255) | (b10 << 8));
        }
        for (char c11 : cArr) {
            if (c11 == c10) {
                this.f4859b += i10;
                long j11 = c10;
                char c12 = (char) j11;
                if (((long) c12) == j11) {
                    return c12;
                }
                throw new IllegalArgumentException(h7.g0.a("Out of range: %s", Long.valueOf(j11)));
            }
        }
        return (char) 0;
    }

    public final int e() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        int i11 = i10 + 1;
        this.f4859b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f4859b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f4859b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f4859b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public final String f(Charset charset) {
        int i10;
        byte[] bArr;
        a.e("Unsupported charset: " + charset, f4857f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = o8.d.f19361a;
        if (!charset.equals(charset2)) {
            y();
        }
        if (charset.equals(o8.d.f19363c) || charset.equals(charset2)) {
            i10 = 1;
        } else {
            if (!charset.equals(o8.d.f19365f) && !charset.equals(o8.d.f19364e) && !charset.equals(o8.d.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f4859b;
        while (true) {
            int i12 = this.f4860c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if ((charset.equals(o8.d.f19363c) || charset.equals(o8.d.f19361a)) && g0.E(this.f4858a[i11])) {
                break;
            }
            if (charset.equals(o8.d.f19365f) || charset.equals(o8.d.d)) {
                byte[] bArr2 = this.f4858a;
                if (bArr2[i11] == 0 && g0.E(bArr2[i11 + 1])) {
                    break;
                }
                if (charset.equals(o8.d.f19364e)) {
                    bArr = this.f4858a;
                    if (bArr[i11 + 1] == 0 && g0.E(bArr[i11])) {
                        break;
                    }
                }
                i11 += i10;
            } else {
                if (charset.equals(o8.d.f19364e)) {
                    bArr = this.f4858a;
                    if (bArr[i11 + 1] == 0) {
                        continue;
                    }
                }
                i11 += i10;
            }
        }
        String strP = p(i11 - this.f4859b, charset);
        if (this.f4859b != this.f4860c && d(charset, d) == '\r') {
            d(charset, f4856e);
        }
        return strP;
    }

    public final int g() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        int i11 = i10 + 1;
        this.f4859b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f4859b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f4859b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f4859b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final long h() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        int i11 = i10 + 1;
        this.f4859b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f4859b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f4859b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f4859b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f4859b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f4859b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f4859b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f4859b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public final long i() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        int i11 = i10 + 1;
        this.f4859b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f4859b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f4859b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f4859b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public final int j() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(i0.a.k(iG, "Top bit not zero: "));
    }

    public final int k() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        int i11 = i10 + 1;
        this.f4859b = i11;
        int i12 = bArr[i10] & 255;
        this.f4859b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long l() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        int i11 = i10 + 1;
        this.f4859b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f4859b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f4859b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f4859b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f4859b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f4859b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f4859b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f4859b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public final String m() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f4859b;
        while (i10 < this.f4860c && this.f4858a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f4858a;
        int i11 = this.f4859b;
        int i12 = g0.f4795a;
        String str = new String(bArr, i11, i10 - i11, o8.d.f19363c);
        this.f4859b = i10;
        if (i10 < this.f4860c) {
            this.f4859b = i10 + 1;
        }
        return str;
    }

    public final String n(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f4859b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f4860c || this.f4858a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f4858a;
        int i14 = g0.f4795a;
        String str = new String(bArr, i11, i13, o8.d.f19363c);
        this.f4859b += i10;
        return str;
    }

    public final short o() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        int i11 = i10 + 1;
        this.f4859b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f4859b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String p(int i10, Charset charset) {
        String str = new String(this.f4858a, this.f4859b, i10, charset);
        this.f4859b += i10;
        return str;
    }

    public final int q() {
        return (r() << 21) | (r() << 14) | (r() << 7) | r();
    }

    public final int r() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        this.f4859b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long s() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        int i11 = i10 + 1;
        this.f4859b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f4859b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f4859b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f4859b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public final int t() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        int i11 = i10 + 1;
        this.f4859b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f4859b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f4859b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public final int u() {
        int iE = e();
        if (iE >= 0) {
            return iE;
        }
        throw new IllegalStateException(i0.a.k(iE, "Top bit not zero: "));
    }

    public final long v() {
        long jL = l();
        if (jL >= 0) {
            return jL;
        }
        throw new IllegalStateException(a9.p.l(jL, "Top bit not zero: "));
    }

    public final int w() {
        byte[] bArr = this.f4858a;
        int i10 = this.f4859b;
        int i11 = i10 + 1;
        this.f4859b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f4859b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long x() {
        int i10;
        int i11;
        long j10 = this.f4858a[this.f4859b];
        int i12 = 7;
        while (true) {
            if (i12 >= 0) {
                int i13 = 1 << i12;
                if ((((long) i13) & j10) == 0) {
                    if (i12 < 6) {
                        j10 &= (long) (i13 - 1);
                        i11 = 7 - i12;
                        break;
                    }
                    if (i12 == 7) {
                        i11 = 1;
                        break;
                    }
                } else {
                    i12--;
                }
            }
            i11 = 0;
            break;
        }
        if (i11 == 0) {
            throw new NumberFormatException(a9.p.l(j10, "Invalid UTF-8 sequence first byte: "));
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f4858a[this.f4859b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(a9.p.l(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f4859b += i11;
        return j10;
    }

    public final Charset y() {
        if (a() >= 3) {
            byte[] bArr = this.f4858a;
            int i10 = this.f4859b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f4859b = i10 + 3;
                return o8.d.f19363c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f4858a;
        int i11 = this.f4859b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f4859b = i11 + 2;
            return o8.d.d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f4859b = i11 + 2;
        return o8.d.f19364e;
    }

    public final void z(int i10) {
        byte[] bArr = this.f4858a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        A(i10, bArr);
    }

    public z(int i10) {
        this.f4858a = new byte[i10];
        this.f4860c = i10;
    }

    public z(byte[] bArr) {
        this.f4858a = bArr;
        this.f4860c = bArr.length;
    }

    public z(byte[] bArr, int i10) {
        this.f4858a = bArr;
        this.f4860c = i10;
    }
}
