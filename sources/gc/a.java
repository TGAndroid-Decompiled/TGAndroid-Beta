package gc;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public final class a extends FilterInputStream {
    public int f12239a;
    public int f12240b;

    public a(InputStream inputStream) {
        super(inputStream);
        this.f12239a = -1;
        this.f12240b = -1;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int read() {
        int read = super.read();
        if (read == 3 && this.f12239a == 0 && this.f12240b == 0) {
            this.f12239a = -1;
            this.f12240b = -1;
            read = super.read();
        }
        this.f12239a = this.f12240b;
        this.f12240b = read;
        return read;
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        bArr.getClass();
        if (i3 < 0 || i10 < 0 || i10 > bArr.length - i3) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i3] = (byte) read;
        int i11 = 1;
        while (true) {
            if (i11 < i10) {
                try {
                    int read2 = read();
                    if (read2 == -1) {
                        break;
                    }
                    bArr[i3 + i11] = (byte) read2;
                    i11++;
                } catch (IOException unused) {
                }
            }
            return i11;
        }
        return i11;
    }
}
