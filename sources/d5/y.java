package d5;

import j3.r0;
import java.nio.charset.Charset;
import java.util.Arrays;
public final class y {
    public static final char[] d = {'\r', '\n'};
    public static final char[] f4408e = {'\n'};
    public static final o8.c0 f4409f = o8.c0.t(5, n8.d.f18511a, n8.d.f18513c, n8.d.f18515f, n8.d.d, n8.d.f18514e);
    public byte[] f4410a;
    public int f4411b;
    public int f4412c;

    public y() {
        this.f4410a = f0.f4353f;
    }

    public final void A(int i9, byte[] bArr) {
        this.f4410a = bArr;
        this.f4412c = i9;
        this.f4411b = 0;
    }

    public final void B(int i9) {
        boolean z10;
        if (i9 >= 0 && i9 <= this.f4410a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.f(z10);
        this.f4412c = i9;
    }

    public final void C(int i9) {
        boolean z10;
        if (i9 >= 0 && i9 <= this.f4412c) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.f(z10);
        this.f4411b = i9;
    }

    public final void D(int i9) {
        C(this.f4411b + i9);
    }

    public final int a() {
        return this.f4412c - this.f4411b;
    }

    public final void b(int i9) {
        byte[] bArr = this.f4410a;
        if (i9 > bArr.length) {
            this.f4410a = Arrays.copyOf(bArr, i9);
        }
    }

    public final void c(int i9, int i10, byte[] bArr) {
        System.arraycopy(this.f4410a, this.f4411b, bArr, i9, i10);
        this.f4411b += i10;
    }

    public final char d(Charset charset, char[] cArr) {
        char c10;
        boolean z10;
        int i9;
        boolean z11;
        byte b10;
        byte b11;
        if ((charset.equals(n8.d.f18513c) || charset.equals(n8.d.f18511a)) && a() >= 1) {
            long j10 = this.f4410a[this.f4411b] & 255;
            c10 = (char) j10;
            if (c10 == j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i9 = 1;
            } else {
                throw new IllegalArgumentException(g7.e0.a("Out of range: %s", Long.valueOf(j10)));
            }
        } else {
            i9 = 2;
            if ((charset.equals(n8.d.f18515f) || charset.equals(n8.d.d)) && a() >= 2) {
                byte[] bArr = this.f4410a;
                int i10 = this.f4411b;
                b10 = bArr[i10];
                b11 = bArr[i10 + 1];
            } else {
                if (charset.equals(n8.d.f18514e) && a() >= 2) {
                    byte[] bArr2 = this.f4410a;
                    int i11 = this.f4411b;
                    b10 = bArr2[i11 + 1];
                    b11 = bArr2[i11];
                }
                return (char) 0;
            }
            c10 = (char) ((b11 & 255) | (b10 << 8));
        }
        for (char c11 : cArr) {
            if (c11 == c10) {
                this.f4411b += i9;
                long j11 = c10;
                char c12 = (char) j11;
                if (c12 == j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return c12;
                }
                throw new IllegalArgumentException(g7.e0.a("Out of range: %s", Long.valueOf(j11)));
            }
        }
        return (char) 0;
    }

    public final int e() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        int i10 = i9 + 1;
        this.f4411b = i10;
        int i11 = i9 + 2;
        this.f4411b = i11;
        int i12 = ((bArr[i10] & 255) << 16) | ((bArr[i9] & 255) << 24);
        int i13 = i9 + 3;
        this.f4411b = i13;
        this.f4411b = i9 + 4;
        return (bArr[i13] & 255) | i12 | ((bArr[i11] & 255) << 8);
    }

    public final String f(Charset charset) {
        int i9;
        boolean contains = f4409f.contains(charset);
        a.e("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = n8.d.f18511a;
        if (!charset.equals(charset2)) {
            y();
        }
        if (!charset.equals(n8.d.f18513c) && !charset.equals(charset2)) {
            if (!charset.equals(n8.d.f18515f) && !charset.equals(n8.d.f18514e) && !charset.equals(n8.d.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i9 = 2;
        } else {
            i9 = 1;
        }
        int i10 = this.f4411b;
        while (true) {
            int i11 = this.f4412c;
            if (i10 < i11 - (i9 - 1)) {
                if ((charset.equals(n8.d.f18513c) || charset.equals(n8.d.f18511a)) && f0.E(this.f4410a[i10])) {
                    break;
                }
                if (charset.equals(n8.d.f18515f) || charset.equals(n8.d.d)) {
                    byte[] bArr = this.f4410a;
                    if (bArr[i10] == 0 && f0.E(bArr[i10 + 1])) {
                        break;
                    }
                }
                if (charset.equals(n8.d.f18514e)) {
                    byte[] bArr2 = this.f4410a;
                    if (bArr2[i10 + 1] == 0 && f0.E(bArr2[i10])) {
                        break;
                    }
                }
                i10 += i9;
            } else {
                i10 = i11;
                break;
            }
        }
        String p6 = p(i10 - this.f4411b, charset);
        if (this.f4411b != this.f4412c && d(charset, d) == '\r') {
            d(charset, f4408e);
        }
        return p6;
    }

    public final int g() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        int i10 = i9 + 1;
        this.f4411b = i10;
        int i11 = i9 + 2;
        this.f4411b = i11;
        int i12 = ((bArr[i10] & 255) << 8) | (bArr[i9] & 255);
        int i13 = i9 + 3;
        this.f4411b = i13;
        this.f4411b = i9 + 4;
        return ((bArr[i13] & 255) << 24) | i12 | ((bArr[i11] & 255) << 16);
    }

    public final long h() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        int i10 = i9 + 1;
        this.f4411b = i10;
        int i11 = i9 + 2;
        this.f4411b = i11;
        long j10 = (bArr[i9] & 255) | ((bArr[i10] & 255) << 8);
        int i12 = i9 + 3;
        this.f4411b = i12;
        int i13 = i9 + 4;
        this.f4411b = i13;
        long j11 = j10 | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 24);
        int i14 = i9 + 5;
        this.f4411b = i14;
        int i15 = i9 + 6;
        this.f4411b = i15;
        long j12 = j11 | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 40);
        int i16 = i9 + 7;
        this.f4411b = i16;
        this.f4411b = i9 + 8;
        return ((bArr[i16] & 255) << 56) | j12 | ((bArr[i15] & 255) << 48);
    }

    public final long i() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        int i10 = i9 + 1;
        this.f4411b = i10;
        int i11 = i9 + 2;
        this.f4411b = i11;
        int i12 = i9 + 3;
        this.f4411b = i12;
        this.f4411b = i9 + 4;
        return ((bArr[i12] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i10] & 255) << 8) | ((bArr[i11] & 255) << 16);
    }

    public final int j() {
        int g10 = g();
        if (g10 >= 0) {
            return g10;
        }
        throw new IllegalStateException(r0.l(g10, "Top bit not zero: "));
    }

    public final int k() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        int i10 = i9 + 1;
        this.f4411b = i10;
        this.f4411b = i9 + 2;
        return ((bArr[i10] & 255) << 8) | (bArr[i9] & 255);
    }

    public final long l() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        int i10 = i9 + 1;
        this.f4411b = i10;
        int i11 = i9 + 2;
        this.f4411b = i11;
        int i12 = i9 + 3;
        this.f4411b = i12;
        long j10 = ((bArr[i9] & 255) << 56) | ((bArr[i10] & 255) << 48) | ((bArr[i11] & 255) << 40);
        int i13 = i9 + 4;
        this.f4411b = i13;
        int i14 = i9 + 5;
        this.f4411b = i14;
        long j11 = j10 | ((bArr[i12] & 255) << 32) | ((bArr[i13] & 255) << 24);
        int i15 = i9 + 6;
        this.f4411b = i15;
        int i16 = i9 + 7;
        this.f4411b = i16;
        this.f4411b = i9 + 8;
        return (bArr[i16] & 255) | j11 | ((bArr[i14] & 255) << 16) | ((bArr[i15] & 255) << 8);
    }

    public final String m() {
        if (a() == 0) {
            return null;
        }
        int i9 = this.f4411b;
        while (i9 < this.f4412c && this.f4410a[i9] != 0) {
            i9++;
        }
        byte[] bArr = this.f4410a;
        int i10 = this.f4411b;
        int i11 = f0.f4349a;
        String str = new String(bArr, i10, i9 - i10, n8.d.f18513c);
        this.f4411b = i9;
        if (i9 < this.f4412c) {
            this.f4411b = i9 + 1;
        }
        return str;
    }

    public final String n(int i9) {
        int i10;
        if (i9 == 0) {
            return "";
        }
        int i11 = this.f4411b;
        int i12 = (i11 + i9) - 1;
        if (i12 < this.f4412c && this.f4410a[i12] == 0) {
            i10 = i9 - 1;
        } else {
            i10 = i9;
        }
        byte[] bArr = this.f4410a;
        int i13 = f0.f4349a;
        String str = new String(bArr, i11, i10, n8.d.f18513c);
        this.f4411b += i9;
        return str;
    }

    public final short o() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        int i10 = i9 + 1;
        this.f4411b = i10;
        this.f4411b = i9 + 2;
        return (short) ((bArr[i10] & 255) | ((bArr[i9] & 255) << 8));
    }

    public final String p(int i9, Charset charset) {
        String str = new String(this.f4410a, this.f4411b, i9, charset);
        this.f4411b += i9;
        return str;
    }

    public final int q() {
        return (r() << 21) | (r() << 14) | (r() << 7) | r();
    }

    public final int r() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        this.f4411b = i9 + 1;
        return bArr[i9] & 255;
    }

    public final long s() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        int i10 = i9 + 1;
        this.f4411b = i10;
        int i11 = i9 + 2;
        this.f4411b = i11;
        int i12 = i9 + 3;
        this.f4411b = i12;
        this.f4411b = i9 + 4;
        return (bArr[i12] & 255) | ((bArr[i9] & 255) << 24) | ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
    }

    public final int t() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        int i10 = i9 + 1;
        this.f4411b = i10;
        int i11 = i9 + 2;
        this.f4411b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f4411b = i9 + 3;
        return (bArr[i11] & 255) | i12 | ((bArr[i9] & 255) << 16);
    }

    public final int u() {
        int e10 = e();
        if (e10 >= 0) {
            return e10;
        }
        throw new IllegalStateException(r0.l(e10, "Top bit not zero: "));
    }

    public final long v() {
        long l10 = l();
        if (l10 >= 0) {
            return l10;
        }
        throw new IllegalStateException(aa.d.m(l10, "Top bit not zero: "));
    }

    public final int w() {
        byte[] bArr = this.f4410a;
        int i9 = this.f4411b;
        int i10 = i9 + 1;
        this.f4411b = i10;
        this.f4411b = i9 + 2;
        return (bArr[i10] & 255) | ((bArr[i9] & 255) << 8);
    }

    public final long x() {
        int i9;
        int i10;
        byte b10;
        int i11;
        long j10 = this.f4410a[this.f4411b];
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
            for (i9 = 1; i9 < i10; i9++) {
                if ((this.f4410a[this.f4411b + i9] & 192) == 128) {
                    j10 = (j10 << 6) | (b10 & 63);
                } else {
                    throw new NumberFormatException(aa.d.m(j10, "Invalid UTF-8 sequence continuation byte: "));
                }
            }
            this.f4411b += i10;
            return j10;
        }
        throw new NumberFormatException(aa.d.m(j10, "Invalid UTF-8 sequence first byte: "));
    }

    public final Charset y() {
        if (a() >= 3) {
            byte[] bArr = this.f4410a;
            int i9 = this.f4411b;
            if (bArr[i9] == -17 && bArr[i9 + 1] == -69 && bArr[i9 + 2] == -65) {
                this.f4411b = i9 + 3;
                return n8.d.f18513c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f4410a;
            int i10 = this.f4411b;
            byte b10 = bArr2[i10];
            if (b10 == -2 && bArr2[i10 + 1] == -1) {
                this.f4411b = i10 + 2;
                return n8.d.d;
            } else if (b10 == -1 && bArr2[i10 + 1] == -2) {
                this.f4411b = i10 + 2;
                return n8.d.f18514e;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void z(int i9) {
        byte[] bArr = this.f4410a;
        if (bArr.length < i9) {
            bArr = new byte[i9];
        }
        A(i9, bArr);
    }

    public y(int i9) {
        this.f4410a = new byte[i9];
        this.f4412c = i9;
    }

    public y(byte[] bArr) {
        this.f4410a = bArr;
        this.f4412c = bArr.length;
    }

    public y(byte[] bArr, int i9) {
        this.f4410a = bArr;
        this.f4412c = i9;
    }
}
