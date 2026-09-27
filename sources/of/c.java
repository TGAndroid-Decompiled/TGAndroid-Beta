package of;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f15734a;
    public final byte[] f15735b = new byte[1];
    public long f15736c;

    public c(h hVar, m mVar) {
        this.f15734a = hVar;
        try {
            this.f15736c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f15736c;
    }

    @Override
    public final void close() {
        this.f15734a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f15734a;
        byte[] bArr = this.f15735b;
        int read = hVar.read(bArr, 0, 1);
        this.f15736c--;
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
        int read = this.f15734a.read(bArr, i10, i11);
        this.f15736c -= read;
        return read;
    }
}
