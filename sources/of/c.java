package of;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f15699a;
    public final byte[] f15700b = new byte[1];
    public long f15701c;

    public c(h hVar, m mVar) {
        this.f15699a = hVar;
        try {
            this.f15701c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f15701c;
    }

    @Override
    public final void close() {
        this.f15699a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f15699a;
        byte[] bArr = this.f15700b;
        int read = hVar.read(bArr, 0, 1);
        this.f15701c--;
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
        int read = this.f15699a.read(bArr, i10, i11);
        this.f15701c -= read;
        return read;
    }
}
