package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public final class oi2 extends FilterInputStream {
    public int a;
    public int b;

    public oi2(InputStream inputStream) {
        super(inputStream);
        this.a = -1;
        this.b = -1;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            if (i2 == 0) {
                return 0;
            }
            int read = read();
            if (read == -1) {
                return -1;
            }
            bArr[i] = (byte) read;
            int i3 = 1;
            while (i3 < i2) {
                try {
                    int read2 = read();
                    if (read2 == -1) {
                        break;
                    }
                    bArr[i + i3] = (byte) read2;
                    i3++;
                } catch (IOException unused) {
                }
            }
            return i3;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final int read() {
        int read = super.read();
        if (read == 3 && this.a == 0 && this.b == 0) {
            this.a = -1;
            this.b = -1;
            read = super.read();
        }
        this.a = this.b;
        this.b = read;
        return read;
    }
}
