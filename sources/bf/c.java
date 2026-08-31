package bf;

import g5.m;
import g5.p;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final m f1937a;
    public final byte[] f1938b = new byte[1];
    public long f1939c;

    public c(m mVar, p pVar) {
        this.f1937a = mVar;
        try {
            this.f1939c = mVar.open(pVar);
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override
    public final int available() {
        return (int) this.f1939c;
    }

    @Override
    public final void close() {
        this.f1937a.close();
    }

    @Override
    public final int read() {
        m mVar = this.f1937a;
        byte[] bArr = this.f1938b;
        int read = mVar.read(bArr, 0, 1);
        this.f1939c--;
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
        int read = this.f1937a.read(bArr, i10, i11);
        this.f1939c -= read;
        return read;
    }
}
