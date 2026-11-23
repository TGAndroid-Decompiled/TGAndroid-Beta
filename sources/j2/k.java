package j2;

import a8.la;
import java.io.InputStream;
public final class k extends InputStream {
    public final h f17202a;
    public final m f17203b;
    public boolean d = false;
    public boolean f17205e = false;
    public final byte[] f17204c = new byte[1];

    public k(h hVar, m mVar) {
        this.f17202a = hVar;
        this.f17203b = mVar;
    }

    public final void a() {
        if (!this.d) {
            this.f17202a.open(this.f17203b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.f17205e) {
            this.f17202a.close();
            this.f17205e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f17204c;
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
        la.p(!this.f17205e);
        a();
        int read = this.f17202a.read(bArr, i7, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
