package org.telegram.messenger.utils;

import java.io.OutputStream;
import java.util.Arrays;

public class ImmutableByteArrayOutputStream extends OutputStream {
    public byte[] buf;
    protected int count;

    public ImmutableByteArrayOutputStream() {
        this(32);
    }

    public ImmutableByteArrayOutputStream(int i) {
        this.buf = new byte[i];
    }

    private void ensureCapacity(int i) {
        if (i - this.buf.length > 0) {
            grow(i);
        }
    }

    private void grow(int i) {
        int length = this.buf.length << 1;
        if (length - i < 0) {
            length = i;
        }
        if (length - 2147483639 > 0) {
            length = hugeCapacity(i);
        }
        this.buf = Arrays.copyOf(this.buf, length);
    }

    private static int hugeCapacity(int i) {
        if (i >= 0) {
            return i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        throw new OutOfMemoryError();
    }

    public int count() {
        return this.count;
    }

    public synchronized void reset() {
        this.count = 0;
    }

    @Override
    public synchronized void write(int i) {
        ensureCapacity(this.count + 1);
        byte[] bArr = this.buf;
        int i2 = this.count;
        bArr[i2] = (byte) i;
        this.count = i2 + 1;
    }

    @Override
    public synchronized void write(byte[] bArr, int i, int i2) {
        if (i >= 0) {
            if (i <= bArr.length && i2 >= 0 && (i + i2) - bArr.length <= 0) {
                ensureCapacity(this.count + i2);
                System.arraycopy(bArr, i, this.buf, this.count, i2);
                this.count += i2;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public void writeInt(int i) {
        ensureCapacity(this.count + 4);
        byte[] bArr = this.buf;
        int i2 = this.count;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.count = i2 + 4;
    }

    public void writeLong(long j) {
        ensureCapacity(this.count + 8);
        byte[] bArr = this.buf;
        int i = this.count;
        bArr[i] = (byte) (j >>> 56);
        bArr[i + 1] = (byte) (j >>> 48);
        bArr[i + 2] = (byte) (j >>> 40);
        bArr[i + 3] = (byte) (j >>> 32);
        bArr[i + 4] = (byte) (j >>> 24);
        bArr[i + 5] = (byte) (j >>> 16);
        bArr[i + 6] = (byte) (j >>> 8);
        bArr[i + 7] = (byte) j;
        this.count = i + 8;
    }
}
