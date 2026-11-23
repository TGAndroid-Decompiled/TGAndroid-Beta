package j2;

import a8.ma;
import java.io.InputStream;
public final class k extends InputStream {
    public final h f17168a;
    public final m f17169b;
    public boolean d = false;
    public boolean f17171e = false;
    public final byte[] f17170c = new byte[1];

    public k(h hVar, m mVar) {
        this.f17168a = hVar;
        this.f17169b = mVar;
    }

    public final void a() {
        if (!this.d) {
            this.f17168a.open(this.f17169b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.f17171e) {
            this.f17168a.close();
            this.f17171e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f17170c;
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
        ma.p(!this.f17171e);
        a();
        int read = this.f17168a.read(bArr, i7, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
