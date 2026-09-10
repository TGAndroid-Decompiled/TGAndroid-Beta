package n7;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
public final class g1 implements Closeable {
    public final ByteArrayInputStream f13952a;
    public f1 f13953b;
    public final byte[] f13954c = new byte[8];
    public final l2.h d = new l2.h(5);

    public g1(ByteArrayInputStream byteArrayInputStream) {
        this.f13952a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f7 = f();
        int i10 = (f7 > 0L ? 1 : (f7 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 > 0) {
                ((ArrayDeque) this.d.f12721b).push(Long.valueOf(f7));
            }
            return f7;
        }
        throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
    }

    public final long b() {
        boolean z10;
        d();
        byte b10 = this.f13953b.f13948a;
        if (b10 == 0) {
            z10 = true;
        } else if (b10 == 32) {
            z10 = false;
        } else {
            throw new IllegalStateException(hc.b.j((this.f13953b.f13948a >> 5) & 7, "expected major type 0 or 1 but found "));
        }
        long f7 = f();
        if (f7 >= 0) {
            if (z10) {
                return f7;
            }
            return ~f7;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long c() {
        h((byte) -96);
        g();
        long f7 = f();
        int i10 = (f7 > 0L ? 1 : (f7 == 0L ? 0 : -1));
        if (i10 >= 0 && f7 <= 4611686018427387903L) {
            if (i10 > 0) {
                ((ArrayDeque) this.d.f12721b).push(Long.valueOf(f7 + f7));
            }
            return f7;
        }
        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
    }

    @Override
    public final void close() {
        this.f13952a.close();
        this.d.E();
    }

    public final n7.f1 d() {
        throw new UnsupportedOperationException("Method not decompiled: n7.g1.d():n7.f1");
    }

    public final boolean e() {
        h((byte) -32);
        if (this.f13953b.f13949b <= 24) {
            int f7 = (int) f();
            if (f7 == 20) {
                return false;
            }
            if (f7 == 21) {
                return true;
            }
            throw new IllegalStateException("expected FALSE or TRUE");
        }
        throw new IllegalStateException("expected simple value");
    }

    public final long f() {
        byte b10 = this.f13953b.f13949b;
        if (b10 < 24) {
            long j3 = b10;
            this.f13953b = null;
            return j3;
        } else if (b10 == 24) {
            int read = this.f13952a.read();
            if (read != -1) {
                this.f13953b = null;
                return read & 255;
            }
            throw new EOFException();
        } else {
            byte[] bArr = this.f13954c;
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
                f1 f1Var = this.f13953b;
                throw new IOException(a4.a.l(f1Var.f13949b, (f1Var.f13948a >> 5) & 7, "invalid additional information ", " for major type "));
            }
        }
    }

    public final void g() {
        d();
        if (this.f13953b.f13949b != 31) {
            return;
        }
        throw new IllegalStateException(hc.b.j(this.f13953b.f13949b, "expected definite length but found "));
    }

    public final void h(byte b10) {
        d();
        if (this.f13953b.f13948a == b10) {
            return;
        }
        throw new IllegalStateException(a4.a.l((b10 >> 5) & 7, (this.f13953b.f13948a >> 5) & 7, "expected major type ", " but found "));
    }

    public final void i(int i10, byte[] bArr) {
        int i11 = 0;
        while (i11 != i10) {
            int read = this.f13952a.read(bArr, i11, i10 - i11);
            if (read != -1) {
                i11 += read;
            } else {
                throw new EOFException();
            }
        }
        this.f13953b = null;
    }

    public final byte[] j() {
        g();
        long f7 = f();
        if (f7 >= 0 && f7 <= 2147483647L) {
            if (this.f13952a.available() >= f7) {
                int i10 = (int) f7;
                byte[] bArr = new byte[i10];
                i(i10, bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
    }
}
