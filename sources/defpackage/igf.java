package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
public final class igf {
    public static final Logger e = Logger.getLogger(igf.class.getName());
    public static final boolean f = hjf.e;
    public hoe a;
    public final byte[] b;
    public final int c;
    public int d;

    public igf(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.b = bArr;
            this.d = 0;
            this.c = i;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
    }

    public static int m(int i) {
        if (i >= 0) {
            return o(i);
        }
        return 10;
    }

    public static int n(String str) {
        int length;
        try {
            length = jjf.c(str);
        } catch (ijf unused) {
            length = str.getBytes(fhf.a).length;
        }
        return o(length) + length;
    }

    public static int o(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int p(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        if ((j & (-16384)) != 0) {
            return i + 1;
        }
        return i;
    }

    public final void a(byte b) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new ol2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void b(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i);
            this.d += i;
        } catch (IndexOutOfBoundsException e2) {
            throw new ol2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i)), e2);
        }
    }

    public final void c(int i, yff yffVar) {
        j((i << 3) | 2);
        j(yffVar.j());
        b(yffVar.j(), yffVar.b);
    }

    public final void d(int i, int i2) {
        j((i << 3) | 5);
        e(i2);
    }

    public final void e(int i) {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new ol2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void f(int i, long j) {
        j((i << 3) | 1);
        g(j);
    }

    public final void g(long j) {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
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
        } catch (IndexOutOfBoundsException e2) {
            throw new ol2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void h(int i, String str) {
        j((i << 3) | 2);
        int i2 = this.d;
        try {
            int o = o(str.length() * 3);
            int o2 = o(str.length());
            int i3 = this.c;
            byte[] bArr = this.b;
            if (o2 == o) {
                int i4 = i2 + o2;
                this.d = i4;
                int b = jjf.b(str, bArr, i4, i3 - i4);
                this.d = i2;
                j((b - i2) - o2);
                this.d = b;
                return;
            }
            j(jjf.c(str));
            int i5 = this.d;
            this.d = jjf.b(str, bArr, i5, i3 - i5);
        } catch (ijf e2) {
            this.d = i2;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(fhf.a);
            try {
                int length = bytes.length;
                j(length);
                b(length, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new ol2(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new ol2(e4);
        }
    }

    public final void i(int i, int i2) {
        j((i << 3) | i2);
    }

    public final void j(int i) {
        while (true) {
            int i2 = i & (-128);
            try {
                byte[] bArr = this.b;
                int i3 = this.d;
                if (i2 == 0) {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                }
                this.d = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new ol2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
            }
        }
    }

    public final void k(int i, long j) {
        j(i << 3);
        l(j);
    }

    public final void l(long j) {
        boolean z = f;
        byte[] bArr = this.b;
        int i = this.c;
        if (!z || i - this.d < 10) {
            while (true) {
                int i2 = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                try {
                    int i3 = this.d;
                    if (i2 == 0) {
                        this.d = i3 + 1;
                        bArr[i3] = (byte) j;
                        return;
                    }
                    this.d = i3 + 1;
                    bArr[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new ol2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
                }
            }
        } else {
            while (true) {
                int i4 = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                int i5 = (int) j;
                int i6 = this.d;
                if (i4 == 0) {
                    this.d = i6 + 1;
                    hjf.c.u(bArr, hjf.f + i6, (byte) i5);
                    return;
                }
                this.d = i6 + 1;
                hjf.c.u(bArr, hjf.f + i6, (byte) ((i5 & 127) | 128));
                j >>>= 7;
            }
        }
    }
}
