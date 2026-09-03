package af;

import g5.m;
import g5.p;
import java.io.IOException;
import java.io.InputStream;
public final class e extends InputStream {
    public final m f161a;
    public final byte[] f162b = new byte[1];
    public long f163c;

    public e(m mVar, p pVar) {
        this.f161a = mVar;
        try {
            this.f163c = mVar.open(pVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f163c;
    }

    @Override
    public final void close() {
        this.f161a.close();
    }

    @Override
    public final int read() {
        m mVar = this.f161a;
        byte[] bArr = this.f162b;
        int read = mVar.read(bArr, 0, 1);
        this.f163c--;
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
        int read = this.f161a.read(bArr, i10, i11);
        this.f163c -= read;
        return read;
    }
}
