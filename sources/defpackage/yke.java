package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.util.ArrayDeque;
public final class yke implements Closeable {
    public final ByteArrayInputStream a;
    public wdc b;
    public final byte[] c = new byte[8];
    public final oqd d;

    public yke(ByteArrayInputStream byteArrayInputStream) {
        ?? obj = new Object();
        obj.a = new ArrayDeque(16);
        this.d = obj;
        this.a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f = f();
        int i = (f > 0L ? 1 : (f == 0L ? 0 : -1));
        if (i >= 0) {
            if (i > 0) {
                ((ArrayDeque) this.d.a).push(Long.valueOf(f));
            }
            return f;
        }
        qyc.c("the maximum supported array length is 9223372036854775807");
        return 0L;
    }

    public final long b() {
        boolean z;
        d();
        byte b = this.b.a;
        if (b == 0) {
            z = true;
        } else if (b == 32) {
            z = false;
        } else {
            grb.i(uh9.k((b >> 5) & 7, "expected major type 0 or 1 but found "));
            return 0L;
        }
        long f = f();
        if (f >= 0) {
            if (z) {
                return f;
            }
            return ~f;
        }
        qyc.c("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long c() {
        h((byte) -96);
        g();
        long f = f();
        int i = (f > 0L ? 1 : (f == 0L ? 0 : -1));
        if (i >= 0 && f <= 4611686018427387903L) {
            if (i > 0) {
                ((ArrayDeque) this.d.a).push(Long.valueOf(f << 1));
            }
            return f;
        }
        qyc.c("the maximum supported map length is 4611686018427387903L");
        return 0L;
    }

    @Override
    public final void close() {
        this.a.close();
        this.d.a();
    }

    public final defpackage.wdc d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yke.d():wdc");
    }

    public final boolean e() {
        h((byte) -32);
        if (this.b.b <= 24) {
            int f = (int) f();
            if (f != 20) {
                if (f == 21) {
                    return true;
                }
                grb.i("expected FALSE or TRUE");
                return false;
            }
            return false;
        }
        grb.i("expected simple value");
        return false;
    }

    public final long f() {
        wdc wdcVar = this.b;
        byte b = wdcVar.b;
        if (b < 24) {
            long j = b;
            this.b = null;
            return j;
        } else if (b == 24) {
            int read = this.a.read();
            if (read != -1) {
                this.b = null;
                return read & 255;
            }
            throw new EOFException();
        } else {
            byte[] bArr = this.c;
            if (b == 25) {
                i(2, bArr);
                return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            } else if (b == 26) {
                i(4, bArr);
                return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            } else if (b == 27) {
                i(8, bArr);
                return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            } else {
                su3.e(c00.h(b, (wdcVar.a >> 5) & 7, "invalid additional information ", " for major type "));
                return 0L;
            }
        }
    }

    public final void g() {
        d();
        byte b = this.b.b;
        if (b != 31) {
            return;
        }
        grb.i(uh9.k(b, "expected definite length but found "));
    }

    public final void h(byte b) {
        d();
        byte b2 = this.b.a;
        if (b2 == b) {
            return;
        }
        grb.i(c00.h((b >> 5) & 7, (b2 >> 5) & 7, "expected major type ", " but found "));
    }

    public final void i(int i, byte[] bArr) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.a.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
        this.b = null;
    }

    public final byte[] j() {
        g();
        long f = f();
        if (f >= 0 && f <= 2147483647L) {
            if (this.a.available() >= f) {
                int i = (int) f;
                byte[] bArr = new byte[i];
                i(i, bArr);
                return bArr;
            }
            throw new EOFException();
        }
        qyc.c("the maximum supported byte/text string length is 2147483647 bytes");
        return null;
    }
}
