package hf;

import g2.h;
import g2.n;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f7660a;
    public final byte[] f7661b = new byte[1];
    public long f7662c;

    public c(h hVar, n nVar) {
        this.f7660a = hVar;
        try {
            this.f7662c = hVar.open(nVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f7662c;
    }

    @Override
    public final void close() {
        this.f7660a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f7660a;
        byte[] bArr = this.f7661b;
        int read = hVar.read(bArr, 0, 1);
        this.f7662c--;
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
        int read = this.f7660a.read(bArr, i10, i11);
        this.f7662c -= read;
        return read;
    }
}
