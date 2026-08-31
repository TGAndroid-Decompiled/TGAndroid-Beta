package lf;

import java.io.OutputStream;
import java.util.Arrays;
public final class c0 extends OutputStream {
    public byte[] f12412a;
    public int f12413b;

    public c0(int i10) {
        this.f12412a = new byte[i10];
    }

    public final void a(int i10) {
        byte[] bArr = this.f12412a;
        if (i10 - bArr.length > 0) {
            int length = bArr.length << 1;
            if (length - i10 < 0) {
                length = i10;
            }
            if (length - 2147483639 > 0) {
                if (i10 >= 0) {
                    if (i10 > 2147483639) {
                        length = Integer.MAX_VALUE;
                    } else {
                        length = 2147483639;
                    }
                } else {
                    throw new OutOfMemoryError();
                }
            }
            this.f12412a = Arrays.copyOf(bArr, length);
        }
    }

    public final synchronized void b() {
        this.f12413b = 0;
    }

    public final void c(int i10) {
        a(this.f12413b + 4);
        byte[] bArr = this.f12412a;
        int i11 = this.f12413b;
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
        this.f12413b = i11 + 4;
    }

    public final void d(long j10) {
        a(this.f12413b + 8);
        byte[] bArr = this.f12412a;
        int i10 = this.f12413b;
        bArr[i10] = (byte) (j10 >>> 56);
        bArr[i10 + 1] = (byte) (j10 >>> 48);
        bArr[i10 + 2] = (byte) (j10 >>> 40);
        bArr[i10 + 3] = (byte) (j10 >>> 32);
        bArr[i10 + 4] = (byte) (j10 >>> 24);
        bArr[i10 + 5] = (byte) (j10 >>> 16);
        bArr[i10 + 6] = (byte) (j10 >>> 8);
        bArr[i10 + 7] = (byte) j10;
        this.f12413b = i10 + 8;
    }

    @Override
    public final synchronized void write(int i10) {
        a(this.f12413b + 1);
        byte[] bArr = this.f12412a;
        int i11 = this.f12413b;
        bArr[i11] = (byte) i10;
        this.f12413b = i11 + 1;
    }

    @Override
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        if (i10 >= 0) {
            if (i10 <= bArr.length && i11 >= 0 && (i10 + i11) - bArr.length <= 0) {
                a(this.f12413b + i11);
                System.arraycopy(bArr, i10, this.f12412a, this.f12413b, i11);
                this.f12413b += i11;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
