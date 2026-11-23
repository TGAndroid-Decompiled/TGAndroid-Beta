package j2;

import a8.ma;
import java.io.InputStream;
public final class k extends InputStream {
    public final h f17265a;
    public final m f17266b;
    public boolean d = false;
    public boolean f17268e = false;
    public final byte[] f17267c = new byte[1];

    public k(h hVar, m mVar) {
        this.f17265a = hVar;
        this.f17266b = mVar;
    }

    public final void a() {
        if (!this.d) {
            this.f17265a.open(this.f17266b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.f17268e) {
            this.f17265a.close();
            this.f17268e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f17267c;
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
        ma.p(!this.f17268e);
        a();
        int read = this.f17265a.read(bArr, i7, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
