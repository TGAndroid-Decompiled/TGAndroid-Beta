package lc;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public final class a extends FilterInputStream {
    public int f15996a;
    public int f15997b;

    public a(InputStream inputStream) {
        super(inputStream);
        this.f15996a = -1;
        this.f15997b = -1;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int read() {
        int read = super.read();
        if (read == 3 && this.f15996a == 0 && this.f15997b == 0) {
            this.f15996a = -1;
            this.f15997b = -1;
            read = super.read();
        }
        this.f15996a = this.f15997b;
        this.f15997b = read;
        return read;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i10] = (byte) read;
        int i12 = 1;
        while (true) {
            if (i12 < i11) {
                try {
                    int read2 = read();
                    if (read2 == -1) {
                        break;
                    }
                    bArr[i10 + i12] = (byte) read2;
                    i12++;
                } catch (IOException unused) {
                }
            }
            return i12;
        }
        return i12;
    }
}
