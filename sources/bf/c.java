package bf;

import g5.m;
import g5.p;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final m f1784a;
    public final byte[] f1785b = new byte[1];
    public long f1786c;

    public c(m mVar, p pVar) {
        this.f1784a = mVar;
        try {
            this.f1786c = mVar.open(pVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f1786c;
    }

    @Override
    public final void close() {
        this.f1784a.close();
    }

    @Override
    public final int read() {
        m mVar = this.f1784a;
        byte[] bArr = this.f1785b;
        int read = mVar.read(bArr, 0, 1);
        this.f1786c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int read = this.f1784a.read(bArr, i10, i11);
        this.f1786c -= read;
        return read;
    }
}
