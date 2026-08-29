package f5;

import i7.q6;
import j7.l1;
import java.nio.charset.Charset;
import java.util.Arrays;
public final class w {
    public static final char[] d = {'\r', '\n'};
    public static final char[] f6638e = {'\n'};
    public static final q8.c0 f6639f = q8.c0.t(5, p8.d.f45656a, p8.d.f45658c, p8.d.f45660f, p8.d.d, p8.d.f45659e);
    public byte[] f6640a;
    public int f6641b;
    public int f6642c;

    public w() {
        this.f6640a = d0.f6583f;
    }

    public final void A(int i10, byte[] bArr) {
        this.f6640a = bArr;
        this.f6642c = i10;
        this.f6641b = 0;
    }

    public final void B(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f6640a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.f(z10);
        this.f6642c = i10;
    }

    public final void C(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f6642c) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.f(z10);
        this.f6641b = i10;
    }

    public final void D(int i10) {
        C(this.f6641b + i10);
    }

    public final int a() {
        return this.f6642c - this.f6641b;
    }

    public final void b(int i10) {
        byte[] bArr = this.f6640a;
        if (i10 > bArr.length) {
            this.f6640a = Arrays.copyOf(bArr, i10);
        }
    }

    public final void c(int i10, int i11, byte[] bArr) {
        System.arraycopy(this.f6640a, this.f6641b, bArr, i10, i11);
        this.f6641b += i11;
    }

    public final char d(Charset charset, char[] cArr) {
        char c3;
        boolean z10;
        int i10;
        boolean z11;
        byte b10;
        byte b11;
        if ((charset.equals(p8.d.f45658c) || charset.equals(p8.d.f45656a)) && a() >= 1) {
            long j10 = this.f6640a[this.f6641b] & 255;
            c3 = (char) j10;
            if (c3 == j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = 1;
            } else {
                throw new IllegalArgumentException(q6.a("Out of range: %s", Long.valueOf(j10)));
            }
        } else {
            i10 = 2;
            if ((charset.equals(p8.d.f45660f) || charset.equals(p8.d.d)) && a() >= 2) {
                byte[] bArr = this.f6640a;
                int i11 = this.f6641b;
                b10 = bArr[i11];
                b11 = bArr[i11 + 1];
            } else {
                if (charset.equals(p8.d.f45659e) && a() >= 2) {
                    byte[] bArr2 = this.f6640a;
                    int i12 = this.f6641b;
                    b10 = bArr2[i12 + 1];
                    b11 = bArr2[i12];
                }
                return (char) 0;
            }
            c3 = (char) ((b11 & 255) | (b10 << 8));
        }
        for (char c6 : cArr) {
            if (c6 == c3) {
                this.f6641b += i10;
                long j11 = c3;
                char c10 = (char) j11;
                if (c10 == j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return c10;
                }
                throw new IllegalArgumentException(q6.a("Out of range: %s", Long.valueOf(j11)));
            }
        }
        return (char) 0;
    }

    public final int e() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        int i11 = i10 + 1;
        this.f6641b = i11;
        int i12 = i10 + 2;
        this.f6641b = i12;
        int i13 = ((bArr[i11] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i14 = i10 + 3;
        this.f6641b = i14;
        this.f6641b = i10 + 4;
        return (bArr[i14] & 255) | i13 | ((bArr[i12] & 255) << 8);
    }

    public final String f(Charset charset) {
        int i10;
        boolean contains = f6639f.contains(charset);
        a.e("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = p8.d.f45656a;
        if (!charset.equals(charset2)) {
            y();
        }
        if (!charset.equals(p8.d.f45658c) && !charset.equals(charset2)) {
            if (!charset.equals(p8.d.f45660f) && !charset.equals(p8.d.f45659e) && !charset.equals(p8.d.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f6641b;
        while (true) {
            int i12 = this.f6642c;
            if (i11 < i12 - (i10 - 1)) {
                if ((charset.equals(p8.d.f45658c) || charset.equals(p8.d.f45656a)) && d0.E(this.f6640a[i11])) {
                    break;
                }
                if (charset.equals(p8.d.f45660f) || charset.equals(p8.d.d)) {
                    byte[] bArr = this.f6640a;
                    if (bArr[i11] == 0 && d0.E(bArr[i11 + 1])) {
                        break;
                    }
                }
                if (charset.equals(p8.d.f45659e)) {
                    byte[] bArr2 = this.f6640a;
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
        String p10 = p(i11 - this.f6641b, charset);
        if (this.f6641b != this.f6642c && d(charset, d) == '\r') {
            d(charset, f6638e);
        }
        return p10;
    }

    public final int g() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        int i11 = i10 + 1;
        this.f6641b = i11;
        int i12 = i10 + 2;
        this.f6641b = i12;
        int i13 = ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
        int i14 = i10 + 3;
        this.f6641b = i14;
        this.f6641b = i10 + 4;
        return ((bArr[i14] & 255) << 24) | i13 | ((bArr[i12] & 255) << 16);
    }

    public final long h() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        int i11 = i10 + 1;
        this.f6641b = i11;
        int i12 = i10 + 2;
        this.f6641b = i12;
        long j10 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i13 = i10 + 3;
        this.f6641b = i13;
        int i14 = i10 + 4;
        this.f6641b = i14;
        long j11 = j10 | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24);
        int i15 = i10 + 5;
        this.f6641b = i15;
        int i16 = i10 + 6;
        this.f6641b = i16;
        long j12 = j11 | ((bArr[i14] & 255) << 32) | ((bArr[i15] & 255) << 40);
        int i17 = i10 + 7;
        this.f6641b = i17;
        this.f6641b = i10 + 8;
        return ((bArr[i17] & 255) << 56) | j12 | ((bArr[i16] & 255) << 48);
    }

    public final long i() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        int i11 = i10 + 1;
        this.f6641b = i11;
        int i12 = i10 + 2;
        this.f6641b = i12;
        int i13 = i10 + 3;
        this.f6641b = i13;
        this.f6641b = i10 + 4;
        return ((bArr[i13] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16);
    }

    public final int j() {
        int g10 = g();
        if (g10 >= 0) {
            return g10;
        }
        throw new IllegalStateException(l1.k(g10, "Top bit not zero: "));
    }

    public final int k() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        int i11 = i10 + 1;
        this.f6641b = i11;
        this.f6641b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | (bArr[i10] & 255);
    }

    public final long l() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        int i11 = i10 + 1;
        this.f6641b = i11;
        int i12 = i10 + 2;
        this.f6641b = i12;
        int i13 = i10 + 3;
        this.f6641b = i13;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40);
        int i14 = i10 + 4;
        this.f6641b = i14;
        int i15 = i10 + 5;
        this.f6641b = i15;
        long j11 = j10 | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24);
        int i16 = i10 + 6;
        this.f6641b = i16;
        int i17 = i10 + 7;
        this.f6641b = i17;
        this.f6641b = i10 + 8;
        return (bArr[i17] & 255) | j11 | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8);
    }

    public final String m() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f6641b;
        while (i10 < this.f6642c && this.f6640a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f6640a;
        int i11 = this.f6641b;
        int i12 = d0.f6579a;
        String str = new String(bArr, i11, i10 - i11, p8.d.f45658c);
        this.f6641b = i10;
        if (i10 < this.f6642c) {
            this.f6641b = i10 + 1;
        }
        return str;
    }

    public final String n(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.f6641b;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.f6642c && this.f6640a[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        byte[] bArr = this.f6640a;
        int i14 = d0.f6579a;
        String str = new String(bArr, i12, i11, p8.d.f45658c);
        this.f6641b += i10;
        return str;
    }

    public final short o() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        int i11 = i10 + 1;
        this.f6641b = i11;
        this.f6641b = i10 + 2;
        return (short) ((bArr[i11] & 255) | ((bArr[i10] & 255) << 8));
    }

    public final String p(int i10, Charset charset) {
        String str = new String(this.f6640a, this.f6641b, i10, charset);
        this.f6641b += i10;
        return str;
    }

    public final int q() {
        return (r() << 21) | (r() << 14) | (r() << 7) | r();
    }

    public final int r() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        this.f6641b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long s() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        int i11 = i10 + 1;
        this.f6641b = i11;
        int i12 = i10 + 2;
        this.f6641b = i12;
        int i13 = i10 + 3;
        this.f6641b = i13;
        this.f6641b = i10 + 4;
        return (bArr[i13] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
    }

    public final int t() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        int i11 = i10 + 1;
        this.f6641b = i11;
        int i12 = i10 + 2;
        this.f6641b = i12;
        int i13 = (bArr[i11] & 255) << 8;
        this.f6641b = i10 + 3;
        return (bArr[i12] & 255) | i13 | ((bArr[i10] & 255) << 16);
    }

    public final int u() {
        int e10 = e();
        if (e10 >= 0) {
            return e10;
        }
        throw new IllegalStateException(l1.k(e10, "Top bit not zero: "));
    }

    public final long v() {
        long l10 = l();
        if (l10 >= 0) {
            return l10;
        }
        throw new IllegalStateException(a4.w.m(l10, "Top bit not zero: "));
    }

    public final int w() {
        byte[] bArr = this.f6640a;
        int i10 = this.f6641b;
        int i11 = i10 + 1;
        this.f6641b = i11;
        this.f6641b = i10 + 2;
        return (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
    }

    public final long x() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j10 = this.f6640a[this.f6641b];
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
                if ((this.f6640a[this.f6641b + i10] & 192) == 128) {
                    j10 = (j10 << 6) | (b10 & 63);
                } else {
                    throw new NumberFormatException(a4.w.m(j10, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.f6641b += i11;
            return j10;
        }
        throw new NumberFormatException(a4.w.m(j10, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset y() {
        if (a() >= 3) {
            byte[] bArr = this.f6640a;
            int i10 = this.f6641b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f6641b = i10 + 3;
                return p8.d.f45658c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f6640a;
            int i11 = this.f6641b;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f6641b = i11 + 2;
                return p8.d.d;
            } else if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f6641b = i11 + 2;
                return p8.d.f45659e;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void z(int i10) {
        byte[] bArr = this.f6640a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        A(i10, bArr);
    }

    public w(int i10) {
        this.f6640a = new byte[i10];
        this.f6642c = i10;
    }

    public w(byte[] bArr) {
        this.f6640a = bArr;
        this.f6642c = bArr.length;
    }

    public w(byte[] bArr, int i10) {
        this.f6640a = bArr;
        this.f6642c = i10;
    }
}
