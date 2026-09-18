package of;

import g2.h;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
public final class c extends InputStream {
    public final h f15652a;
    public final byte[] f15653b = new byte[1];
    public long f15654c;

    public c(h hVar, m mVar) {
        this.f15652a = hVar;
        try {
            this.f15654c = hVar.open(mVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final int available() {
        return (int) this.f15654c;
    }

    @Override
    public final void close() {
        this.f15652a.close();
    }

    @Override
    public final int read() {
        h hVar = this.f15652a;
        byte[] bArr = this.f15653b;
        int read = hVar.read(bArr, 0, 1);
        this.f15654c--;
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
        int read = this.f15652a.read(bArr, i10, i11);
        this.f15654c -= read;
        return read;
    }
}
