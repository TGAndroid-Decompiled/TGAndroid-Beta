package hf;

import g2.h;
import g2.n;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f7659a;
    public final byte[] f7660b = new byte[1];
    public long f7661c;

    public c(h hVar, n nVar) {
        this.f7659a = hVar;
        try {
            this.f7661c = hVar.open(nVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f7661c;
    }

    @Override
    public final void close() {
        this.f7659a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f7659a;
        byte[] bArr = this.f7660b;
        int read = hVar.read(bArr, 0, 1);
        this.f7661c--;
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
        int read = this.f7659a.read(bArr, i10, i11);
        this.f7661c -= read;
        return read;
    }
}
