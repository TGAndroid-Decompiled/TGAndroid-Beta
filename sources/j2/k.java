package j2;

import a8.la;
import java.io.InputStream;
public final class k extends InputStream {
    public final h f17177a;
    public final m f17178b;
    public boolean d = false;
    public boolean f17180e = false;
    public final byte[] f17179c = new byte[1];

    public k(h hVar, m mVar) {
        this.f17177a = hVar;
        this.f17178b = mVar;
    }

    public final void a() {
        if (!this.d) {
            this.f17177a.open(this.f17178b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.f17180e) {
            this.f17177a.close();
            this.f17180e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f17179c;
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
        la.p(!this.f17180e);
        a();
        int read = this.f17177a.read(bArr, i7, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
