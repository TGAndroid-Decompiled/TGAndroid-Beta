package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
public final class pl2 {
    public static final Logger f = Logger.getLogger(pl2.class.getName());
    public static final boolean g = d8c.e;
    public k6d a;
    public final byte[] b;
    public final int c;
    public int d;
    public final p6c e;

    public pl2(p6c p6cVar, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.b = new byte[max];
            this.c = max;
            this.e = p6cVar;
            return;
        }
        u36.j("bufferSize must be >= 0");
        throw null;
    }

    public static int f(String str) {
        int length;
        try {
            length = gac.a(str);
        } catch (fac unused) {
            length = str.getBytes(mr5.a).length;
        }
        return h(length) + length;
    }

    public static int g(int i) {
        return h(i << 3);
    }

    public static int h(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int i(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A(int i, int i2) {
        C((i << 3) | i2);
    }

    public final void B(int i, int i2) {
        k(20);
        c(i, 0);
        d(i2);
    }

    public final void C(int i) {
        k(5);
        d(i);
    }

    public final void D(int i, long j) {
        k(20);
        c(i, 0);
        e(j);
    }

    public final void E(long j) {
        k(10);
        e(j);
    }

    public final void a(int i) {
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        byte[] bArr = this.b;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.d = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.d = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.d = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void b(long j) {
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        byte[] bArr = this.b;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.d = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.d = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.d = i5;
        bArr[i4] = (byte) ((j >> 24) & 255);
        int i6 = i + 5;
        this.d = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.d = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.d = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.d = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void c(int i, int i2) {
        d((i << 3) | i2);
    }

    public final void d(int i) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.d;
                if (i2 == 0) {
                    this.d = i3 + 1;
                    d8c.j(bArr, i3, (byte) i);
                    return;
                }
                this.d = i3 + 1;
                d8c.j(bArr, i3, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.d;
                if (i4 == 0) {
                    this.d = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                }
                this.d = i5 + 1;
                bArr[i5] = (byte) ((i | 128) & 255);
                i >>>= 7;
            }
        }
    }

    public final void e(long j) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                int i = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i2 = this.d;
                if (i == 0) {
                    this.d = i2 + 1;
                    d8c.j(bArr, i2, (byte) j);
                    return;
                }
                this.d = i2 + 1;
                d8c.j(bArr, i2, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i3 = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i4 = this.d;
                if (i3 == 0) {
                    this.d = i4 + 1;
                    bArr[i4] = (byte) j;
                    return;
                }
                this.d = i4 + 1;
                bArr[i4] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            }
        }
    }

    public final void j() {
        this.e.a.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void k(int i) {
        if (this.c - this.d < i) {
            j();
        }
    }

    public final void l(byte b) {
        if (this.d == this.c) {
            j();
        }
        int i = this.d;
        this.d = i + 1;
        this.b[i] = b;
    }

    public final void m(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.d = i4;
        j();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
            return;
        }
        this.e.a.write(bArr, i6, i7);
    }

    public final void n(int i, boolean z) {
        k(11);
        c(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.d;
        this.d = i2 + 1;
        this.b[i2] = b;
    }

    public final void o(int i, m61 m61Var) {
        A(i, 2);
        p(m61Var);
    }

    public final void p(m61 m61Var) {
        C(m61Var.size());
        w(m61Var.l(), m61Var.size(), m61Var.b);
    }

    public final void q(int i, int i2) {
        k(14);
        c(i, 5);
        a(i2);
    }

    public final void r(int i) {
        k(4);
        a(i);
    }

    public final void s(int i, long j) {
        k(18);
        c(i, 1);
        b(j);
    }

    public final void t(long j) {
        k(8);
        b(j);
    }

    public final void u(int i, int i2) {
        k(20);
        c(i, 0);
        if (i2 >= 0) {
            d(i2);
        } else {
            e(i2);
        }
    }

    public final void v(int i) {
        if (i >= 0) {
            C(i);
        } else {
            E(i);
        }
    }

    public final void w(int i, int i2, byte[] bArr) {
        m(bArr, i, i2);
    }

    public final void x(int i, o3 o3Var, os9 os9Var) {
        A(i, 2);
        C(o3Var.a(os9Var));
        os9Var.g(o3Var, this.a);
    }

    public final void y(int i, String str) {
        A(i, 2);
        z(str);
    }

    public final void z(String str) {
        try {
            int length = str.length() * 3;
            int h = h(length);
            int i = h + length;
            int i2 = this.c;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int b = gac.a.b(str, bArr, 0, length);
                C(b);
                m(bArr, 0, b);
                return;
            }
            if (i > i2 - this.d) {
                j();
            }
            int h2 = h(str.length());
            int i3 = this.d;
            byte[] bArr2 = this.b;
            try {
                try {
                    if (h2 == h) {
                        int i4 = i3 + h2;
                        this.d = i4;
                        int b2 = gac.a.b(str, bArr2, i4, i2 - i4);
                        this.d = i3;
                        d((b2 - i3) - h2);
                        this.d = b2;
                        return;
                    }
                    int a = gac.a(str);
                    d(a);
                    this.d = gac.a.b(str, bArr2, this.d, a);
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new ol2(e);
                }
            } catch (fac e2) {
                this.d = i3;
                throw e2;
            }
        } catch (fac e3) {
            f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(mr5.a);
            try {
                C(bytes.length);
                w(0, bytes.length, bytes);
            } catch (IndexOutOfBoundsException e4) {
                throw new ol2(e4);
            }
        }
    }
}
