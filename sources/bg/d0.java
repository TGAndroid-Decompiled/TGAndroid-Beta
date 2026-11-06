package bg;

import java.io.OutputStream;
import java.util.Arrays;
public final class d0 extends OutputStream {
    public byte[] f3267a;
    public int f3268b;

    public d0(int i7) {
        this.f3267a = new byte[i7];
    }

    public final void a(int i7) {
        byte[] bArr = this.f3267a;
        if (i7 - bArr.length > 0) {
            int length = bArr.length << 1;
            if (length - i7 < 0) {
                length = i7;
            }
            if (length - 2147483639 > 0) {
                if (i7 >= 0) {
                    if (i7 > 2147483639) {
                        length = Integer.MAX_VALUE;
                    } else {
                        length = 2147483639;
                    }
                } else {
                    throw new OutOfMemoryError();
                }
            }
            this.f3267a = Arrays.copyOf(bArr, length);
        }
    }

    public final synchronized void b() {
        this.f3268b = 0;
    }

    public final void c(int i7) {
        a(this.f3268b + 4);
        byte[] bArr = this.f3267a;
        int i10 = this.f3268b;
        bArr[i10] = (byte) (i7 >>> 24);
        bArr[i10 + 1] = (byte) (i7 >>> 16);
        bArr[i10 + 2] = (byte) (i7 >>> 8);
        bArr[i10 + 3] = (byte) i7;
        this.f3268b = i10 + 4;
    }

    public final void d(long j3) {
        a(this.f3268b + 8);
        byte[] bArr = this.f3267a;
        int i7 = this.f3268b;
        bArr[i7] = (byte) (j3 >>> 56);
        bArr[i7 + 1] = (byte) (j3 >>> 48);
        bArr[i7 + 2] = (byte) (j3 >>> 40);
        bArr[i7 + 3] = (byte) (j3 >>> 32);
        bArr[i7 + 4] = (byte) (j3 >>> 24);
        bArr[i7 + 5] = (byte) (j3 >>> 16);
        bArr[i7 + 6] = (byte) (j3 >>> 8);
        bArr[i7 + 7] = (byte) j3;
        this.f3268b = i7 + 8;
    }

    @Override
    public final synchronized void write(int i7) {
        a(this.f3268b + 1);
        byte[] bArr = this.f3267a;
        int i10 = this.f3268b;
        bArr[i10] = (byte) i7;
        this.f3268b = i10 + 1;
    }

    @Override
    public final synchronized void write(byte[] bArr, int i7, int i10) {
        if (i7 >= 0) {
            if (i7 <= bArr.length && i10 >= 0 && (i7 + i10) - bArr.length <= 0) {
                a(this.f3268b + i10);
                System.arraycopy(bArr, i7, this.f3267a, this.f3268b, i10);
                this.f3268b += i10;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
