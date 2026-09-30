package of;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f15696a;
    public final byte[] f15697b = new byte[1];
    public long f15698c;

    public c(h hVar, m mVar) {
        this.f15696a = hVar;
        try {
            this.f15698c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f15698c;
    }

    @Override
    public final void close() {
        this.f15696a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f15696a;
        byte[] bArr = this.f15697b;
        int read = hVar.read(bArr, 0, 1);
        this.f15698c--;
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
        int read = this.f15696a.read(bArr, i10, i11);
        this.f15698c -= read;
        return read;
    }
}
