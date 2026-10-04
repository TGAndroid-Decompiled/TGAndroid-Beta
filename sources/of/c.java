package of;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f17164a;
    public final byte[] f17165b = new byte[1];
    public long f17166c;

    public c(h hVar, m mVar) {
        this.f17164a = hVar;
        try {
            this.f17166c = hVar.open(mVar);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final int available() {
        return (int) this.f17166c;
    }

    @Override
    public final void close() {
        this.f17164a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f17164a;
        byte[] bArr = this.f17165b;
        int read = hVar.read(bArr, 0, 1);
        this.f17166c--;
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
        int read = this.f17164a.read(bArr, i10, i11);
        this.f17166c -= read;
        return read;
    }
}
