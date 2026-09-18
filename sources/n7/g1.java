package n7;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
public final class g1 implements Closeable {
    public final ByteArrayInputStream f15132a;
    public f1 f15133b;
    public final byte[] f15134c = new byte[8];
    public final k2.u d = new k2.u(8);

    public g1(ByteArrayInputStream byteArrayInputStream) {
        this.f15132a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f7 = f();
        int i10 = (f7 > 0L ? 1 : (f7 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 > 0) {
                ((ArrayDeque) this.d.f13385b).push(Long.valueOf(f7));
            }
            return f7;
        }
        throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
    }

    public final long b() {
        boolean z10;
        d();
        byte b10 = this.f15133b.f15128a;
        if (b10 == 0) {
            z10 = true;
        } else if (b10 == 32) {
            z10 = false;
        } else {
            throw new IllegalStateException(hg.k0.i((this.f15133b.f15128a >> 5) & 7, "expected major type 0 or 1 but found "));
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
                ((ArrayDeque) this.d.f13385b).push(Long.valueOf(f7 + f7));
            }
            return f7;
        }
        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
    }

    @Override
    public final void close() {
        this.f15132a.close();
        this.d.d0();
    }

    public final n7.f1 d() {
        throw new UnsupportedOperationException("Method not decompiled: n7.g1.d():n7.f1");
    }

    public final boolean e() {
        h((byte) -32);
        if (this.f15133b.f15129b <= 24) {
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
        byte b10 = this.f15133b.f15129b;
        if (b10 < 24) {
            long j3 = b10;
            this.f15133b = null;
            return j3;
        } else if (b10 == 24) {
            int read = this.f15132a.read();
            if (read != -1) {
                this.f15133b = null;
                return read & 255;
            }
            throw new EOFException();
        } else {
            byte[] bArr = this.f15134c;
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
                f1 f1Var = this.f15133b;
                throw new IOException(a4.a.l(f1Var.f15129b, (f1Var.f15128a >> 5) & 7, "invalid additional information ", " for major type "));
            }
        }
    }

    public final void g() {
        d();
        if (this.f15133b.f15129b != 31) {
            return;
        }
        throw new IllegalStateException(hg.k0.i(this.f15133b.f15129b, "expected definite length but found "));
    }

    public final void h(byte b10) {
        d();
        if (this.f15133b.f15128a == b10) {
            return;
        }
        throw new IllegalStateException(a4.a.l((b10 >> 5) & 7, (this.f15133b.f15128a >> 5) & 7, "expected major type ", " but found "));
    }

    public final void i(int i10, byte[] bArr) {
        int i11 = 0;
        while (i11 != i10) {
            int read = this.f15132a.read(bArr, i11, i10 - i11);
            if (read != -1) {
                i11 += read;
            } else {
                throw new EOFException();
            }
        }
        this.f15133b = null;
    }

    public final byte[] j() {
        g();
        long f7 = f();
        if (f7 >= 0 && f7 <= 2147483647L) {
            if (this.f15132a.available() >= f7) {
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
