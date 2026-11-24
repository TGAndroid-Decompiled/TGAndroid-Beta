package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.util.ArrayDeque;
public final class iie implements Closeable {
    public final ByteArrayInputStream a;
    public xbc b;
    public final byte[] c = new byte[8];
    public final cf9 d = new cf9((byte) 29);

    public iie(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f = f();
        int i = (f > 0L ? 1 : (f == 0L ? 0 : -1));
        if (i >= 0) {
            if (i > 0) {
                ((ArrayDeque) this.d.b).push(Long.valueOf(f));
            }
            return f;
        }
        rjb.j("the maximum supported array length is 9223372036854775807");
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
            dq9.m(hg9.j((b >> 5) & 7, "expected major type 0 or 1 but found "));
            return 0L;
        }
        long f = f();
        if (f >= 0) {
            if (z) {
                return f;
            }
            return ~f;
        }
        rjb.j("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long c() {
        h((byte) -96);
        g();
        long f = f();
        int i = (f > 0L ? 1 : (f == 0L ? 0 : -1));
        if (i >= 0 && f <= 4611686018427387903L) {
            if (i > 0) {
                ((ArrayDeque) this.d.b).push(Long.valueOf(f << 1));
            }
            return f;
        }
        rjb.j("the maximum supported map length is 4611686018427387903L");
        return 0L;
    }

    @Override
    public final void close() {
        this.a.close();
        this.d.D();
    }

    public final defpackage.xbc d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iie.d():xbc");
    }

    public final boolean e() {
        h((byte) -32);
        if (this.b.b <= 24) {
            int f = (int) f();
            if (f != 20) {
                if (f == 21) {
                    return true;
                }
                dq9.m("expected FALSE or TRUE");
                return false;
            }
            return false;
        }
        dq9.m("expected simple value");
        return false;
    }

    public final long f() {
        xbc xbcVar = this.b;
        byte b = xbcVar.b;
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
                wa3.d(b10.g(b, (xbcVar.a >> 5) & 7, "invalid additional information ", " for major type "));
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
        dq9.m(hg9.j(b, "expected definite length but found "));
    }

    public final void h(byte b) {
        d();
        byte b2 = this.b.a;
        if (b2 == b) {
            return;
        }
        dq9.m(b10.g((b >> 5) & 7, (b2 >> 5) & 7, "expected major type ", " but found "));
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
        rjb.j("the maximum supported byte/text string length is 2147483647 bytes");
        return null;
    }
}
