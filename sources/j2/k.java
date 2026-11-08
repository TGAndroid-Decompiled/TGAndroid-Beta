package j2;

import a8.ia;
import java.io.InputStream;
public final class k extends InputStream {
    public final h f16438a;
    public final m f16439b;
    public boolean d = false;
    public boolean f16441e = false;
    public final byte[] f16440c = new byte[1];

    public k(h hVar, m mVar) {
        this.f16438a = hVar;
        this.f16439b = mVar;
    }

    public final void a() {
        if (!this.d) {
            this.f16438a.open(this.f16439b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.f16441e) {
            this.f16438a.close();
            this.f16441e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f16440c;
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
        ia.p(!this.f16441e);
        a();
        int read = this.f16438a.read(bArr, i7, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
