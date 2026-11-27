package defpackage;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class s0e {
    public static final Logger e = Logger.getLogger(s0e.class.getName());
    public static final boolean f = eke.e;
    public oqd a;
    public final byte[] b;
    public final int c;
    public int d;

    public s0e(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.b = bArr;
            this.d = 0;
            this.c = i;
            return;
        }
        Locale locale = Locale.US;
        lq5.j(c00.h(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        throw null;
    }

    public static int a(String str) {
        int length;
        try {
            length = tke.c(str);
        } catch (oke unused) {
            length = str.getBytes(x7e.a).length;
        }
        return b(length) + length;
    }

    public static int b(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int c(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int r(int i, hwd hwdVar, rfe rfeVar) {
        return hwdVar.b(rfeVar) + (b(i << 3) << 1);
    }

    public final void d(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i);
            this.d += i;
        } catch (IndexOutOfBoundsException e2) {
            throw new wk2(this.d, this.c, i, e2);
        }
    }

    public final void e(int i, pzd pzdVar) {
        o((i << 3) | 2);
        o(pzdVar.j());
        d(pzdVar.j(), pzdVar.b);
    }

    public final void f(int i, int i2) {
        o((i << 3) | 5);
        g(i2);
    }

    public final void g(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new wk2(i2, this.c, 4, e2);
        }
    }

    public final void h(int i, long j) {
        o((i << 3) | 1);
        i(j);
    }

    public final void i(long j) {
        int i = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new wk2(i, this.c, 8, e2);
        }
    }

    public final void j(int i, int i2) {
        o(i << 3);
        k(i2);
    }

    public final void k(int i) {
        if (i >= 0) {
            o(i);
        } else {
            q(i);
        }
    }

    public final void l(int i, String str) {
        o((i << 3) | 2);
        int i2 = this.d;
        try {
            int b = b(str.length() * 3);
            int b2 = b(str.length());
            int i3 = this.c;
            byte[] bArr = this.b;
            if (b2 == b) {
                int i4 = i2 + b2;
                this.d = i4;
                int b3 = tke.b(str, bArr, i4, i3 - i4);
                this.d = i2;
                o((b3 - i2) - b2);
                this.d = b3;
                return;
            }
            o(tke.c(str));
            int i5 = this.d;
            this.d = tke.b(str, bArr, i5, i3 - i5);
        } catch (IndexOutOfBoundsException e2) {
            throw new wk2(e2);
        } catch (oke e3) {
            this.d = i2;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(x7e.a);
            try {
                int length = bytes.length;
                o(length);
                d(length, bytes);
            } catch (IndexOutOfBoundsException e4) {
                throw new wk2(e4);
            }
        }
    }

    public final void m(int i, int i2) {
        o((i << 3) | i2);
    }

    public final void n(int i, int i2) {
        o(i << 3);
        o(i2);
    }

    public final void o(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.d;
        while (true) {
            int i3 = i & (-128);
            try {
                byte[] bArr = this.b;
                int i4 = i2 + 1;
                if (i3 == 0) {
                    bArr[i2] = (byte) i;
                    this.d = i4;
                    return;
                }
                try {
                    bArr[i2] = (byte) (i | 128);
                    i >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i2 = i4;
                }
                indexOutOfBoundsException = e2;
                i2 = i4;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
            }
            throw new wk2(i2, this.c, 1, indexOutOfBoundsException);
        }
    }

    public final void p(int i, long j) {
        o(i << 3);
        q(j);
    }

    public final void q(long j) {
        int i;
        int i2 = this.d;
        boolean z = f;
        byte[] bArr = this.b;
        int i3 = this.c;
        if (z && i3 - i2 >= 10) {
            int i4 = i2;
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                eke.c.u(bArr, eke.f + i4, (byte) (((int) j2) | 128));
                j2 >>>= 7;
                i4++;
            }
            i = i4 + 1;
            eke.c.u(bArr, eke.f + i4, (byte) j2);
        } else {
            int i5 = i2;
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                int i6 = i5 + 1;
                try {
                    bArr[i5] = (byte) (((int) j3) | 128);
                    j3 >>>= 7;
                    i5 = i6;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i = i6;
                    throw new wk2(i, i3, 1, e);
                }
            }
            i = i5 + 1;
            try {
                bArr[i5] = (byte) j3;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                throw new wk2(i, i3, 1, e);
            }
        }
        this.d = i;
    }
}
