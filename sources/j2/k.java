package j2;

import a8.ja;
import java.io.InputStream;
public final class k extends InputStream {
    public final h f16792a;
    public final m f16793b;
    public boolean d = false;
    public boolean f16795e = false;
    public final byte[] f16794c = new byte[1];

    public k(h hVar, m mVar) {
        this.f16792a = hVar;
        this.f16793b = mVar;
    }

    public final void a() {
        if (!this.d) {
            this.f16792a.open(this.f16793b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.f16795e) {
            this.f16792a.close();
            this.f16795e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f16794c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        ja.p(!this.f16795e);
        a();
        int read = this.f16792a.read(bArr, i7, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
