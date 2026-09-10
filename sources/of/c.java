package of;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f14296a;
    public final byte[] f14297b = new byte[1];
    public long f14298c;

    public c(h hVar, m mVar) {
        this.f14296a = hVar;
        try {
            this.f14298c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f14298c;
    }

    @Override
    public final void close() {
        this.f14296a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f14296a;
        byte[] bArr = this.f14297b;
        int read = hVar.read(bArr, 0, 1);
        this.f14298c--;
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
        int read = this.f14296a.read(bArr, i10, i11);
        this.f14298c -= read;
        return read;
    }
}
