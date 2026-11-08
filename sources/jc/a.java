package jc;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public final class a extends FilterInputStream {
    public int f16644a;
    public int f16645b;

    public a(InputStream inputStream) {
        super(inputStream);
        this.f16644a = -1;
        this.f16645b = -1;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int read() {
        int read = super.read();
        if (read == 3 && this.f16644a == 0 && this.f16645b == 0) {
            this.f16644a = -1;
            this.f16645b = -1;
            read = super.read();
        }
        this.f16644a = this.f16645b;
        this.f16645b = read;
        return read;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        bArr.getClass();
        if (i7 < 0 || i10 < 0 || i10 > bArr.length - i7) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i7] = (byte) read;
        int i11 = 1;
        while (true) {
            if (i11 < i10) {
                try {
                    int read2 = read();
                    if (read2 == -1) {
                        break;
                    }
                    bArr[i7 + i11] = (byte) read2;
                    i11++;
                } catch (IOException unused) {
                }
            }
            return i11;
        }
        return i11;
    }
}
