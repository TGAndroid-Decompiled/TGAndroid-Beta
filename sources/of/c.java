package of;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f17159a;
    public final byte[] f17160b = new byte[1];
    public long f17161c;

    public c(h hVar, m mVar) {
        this.f17159a = hVar;
        try {
            this.f17161c = hVar.open(mVar);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public final int available() {
        return (int) this.f17161c;
    }

    @Override
    public final void close() {
        this.f17159a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f17159a;
        byte[] bArr = this.f17160b;
        int read = hVar.read(bArr, 0, 1);
        this.f17161c--;
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
        int read = this.f17159a.read(bArr, i10, i11);
        this.f17161c -= read;
        return read;
    }
}
