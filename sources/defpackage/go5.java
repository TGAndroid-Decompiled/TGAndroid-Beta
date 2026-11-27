package defpackage;

import java.io.OutputStream;
import java.util.Arrays;
public final class go5 extends OutputStream {
    public byte[] a;
    public int b;

    public go5(int i) {
        this.a = new byte[i];
    }

    public final void a(int i) {
        byte[] bArr = this.a;
        if (i - bArr.length > 0) {
            int length = bArr.length << 1;
            if (length - i < 0) {
                length = i;
            }
            if (length - 2147483639 > 0) {
                if (i >= 0) {
                    if (i > 2147483639) {
                        length = Integer.MAX_VALUE;
                    } else {
                        length = 2147483639;
                    }
                } else {
                    throw new OutOfMemoryError();
                }
            }
            this.a = Arrays.copyOf(bArr, length);
        }
    }

    public final synchronized void b() {
        this.b = 0;
    }

    public final void c(int i) {
        a(this.b + 4);
        byte[] bArr = this.a;
        int i2 = this.b;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.b = i2 + 4;
    }

    public final void d(long j) {
        a(this.b + 8);
        byte[] bArr = this.a;
        int i = this.b;
        bArr[i] = (byte) (j >>> 56);
        bArr[i + 1] = (byte) (j >>> 48);
        bArr[i + 2] = (byte) (j >>> 40);
        bArr[i + 3] = (byte) (j >>> 32);
        bArr[i + 4] = (byte) (j >>> 24);
        bArr[i + 5] = (byte) (j >>> 16);
        bArr[i + 6] = (byte) (j >>> 8);
        bArr[i + 7] = (byte) j;
        this.b = i + 8;
    }

    @Override
    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (i >= 0) {
            if (i <= bArr.length && i2 >= 0 && (i + i2) - bArr.length <= 0) {
                a(this.b + i2);
                System.arraycopy(bArr, i, this.a, this.b, i2);
                this.b += i2;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final synchronized void write(int i) {
        a(this.b + 1);
        byte[] bArr = this.a;
        int i2 = this.b;
        bArr[i2] = (byte) i;
        this.b = i2 + 1;
    }
}
