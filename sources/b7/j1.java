package b7;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
public final class j1 implements Closeable {
    public final ByteArrayInputStream f1828a;
    public i1 f1829b;
    public final byte[] f1830c = new byte[8];
    public final y5.h d = new y5.h(6);

    public j1(ByteArrayInputStream byteArrayInputStream) {
        this.f1828a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f10 = f();
        int i10 = (f10 > 0L ? 1 : (f10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 > 0) {
                ((ArrayDeque) this.d.f50813b).push(Long.valueOf(f10));
            }
            return f10;
        }
        throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
    }

    public final long b() {
        boolean z4;
        d();
        byte b10 = this.f1829b.f1824a;
        if (b10 == 0) {
            z4 = true;
        } else if (b10 == 32) {
            z4 = false;
        } else {
            throw new IllegalStateException(l.d.j((this.f1829b.f1824a >> 5) & 7, "expected major type 0 or 1 but found "));
        }
        long f10 = f();
        if (f10 >= 0) {
            if (z4) {
                return f10;
            }
            return ~f10;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long c() {
        h((byte) -96);
        g();
        long f10 = f();
        int i10 = (f10 > 0L ? 1 : (f10 == 0L ? 0 : -1));
        if (i10 >= 0 && f10 <= 4611686018427387903L) {
            if (i10 > 0) {
                ((ArrayDeque) this.d.f50813b).push(Long.valueOf(f10 + f10));
            }
            return f10;
        }
        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
    }

    @Override
    public final void close() {
        this.f1828a.close();
        this.d.v();
    }

    public final b7.i1 d() {
        throw new UnsupportedOperationException("Method not decompiled: b7.j1.d():b7.i1");
    }

    public final boolean e() {
        h((byte) -32);
        if (this.f1829b.f1825b <= 24) {
            int f10 = (int) f();
            if (f10 == 20) {
                return false;
            }
            if (f10 == 21) {
                return true;
            }
            throw new IllegalStateException("expected FALSE or TRUE");
        }
        throw new IllegalStateException("expected simple value");
    }

    public final long f() {
        byte b10 = this.f1829b.f1825b;
        if (b10 < 24) {
            long j10 = b10;
            this.f1829b = null;
            return j10;
        } else if (b10 == 24) {
            int read = this.f1828a.read();
            if (read != -1) {
                this.f1829b = null;
                return read & 255;
            }
            throw new EOFException();
        } else {
            byte[] bArr = this.f1830c;
            if (b10 == 25) {
                i(2, bArr);
                return ((bArr[0] & 255) << 8) | (255 & bArr[1]);
            } else if (b10 == 26) {
                i(4, bArr);
                return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            } else if (b10 == 27) {
                i(8, bArr);
                return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            } else {
                i1 i1Var = this.f1829b;
                throw new IOException(android.support.v4.media.a.k(i1Var.f1825b, (i1Var.f1824a >> 5) & 7, "invalid additional information ", " for major type "));
            }
        }
    }

    public final void g() {
        d();
        if (this.f1829b.f1825b != 31) {
            return;
        }
        throw new IllegalStateException(l.d.j(this.f1829b.f1825b, "expected definite length but found "));
    }

    public final void h(byte b10) {
        d();
        if (this.f1829b.f1824a == b10) {
            return;
        }
        throw new IllegalStateException(android.support.v4.media.a.k((b10 >> 5) & 7, (this.f1829b.f1824a >> 5) & 7, "expected major type ", " but found "));
    }

    public final void i(int i10, byte[] bArr) {
        int i11 = 0;
        while (i11 != i10) {
            int read = this.f1828a.read(bArr, i11, i10 - i11);
            if (read != -1) {
                i11 += read;
            } else {
                throw new EOFException();
            }
        }
        this.f1829b = null;
    }

    public final byte[] j() {
        g();
        long f10 = f();
        if (f10 >= 0 && f10 <= 2147483647L) {
            if (this.f1828a.available() >= f10) {
                int i10 = (int) f10;
                byte[] bArr = new byte[i10];
                i(i10, bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
    }
}
