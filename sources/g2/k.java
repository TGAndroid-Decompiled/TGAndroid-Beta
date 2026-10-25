package g2;

import a8.yb;
import java.io.InputStream;
public final class k extends InputStream {
    public final h f12249a;
    public final m f12250b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] f12251c = new byte[1];

    public k(h hVar, m mVar) {
        this.f12249a = hVar;
        this.f12250b = mVar;
    }

    public final void a() {
        if (!this.d) {
            this.f12249a.open(this.f12250b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.e) {
            this.f12249a.close();
            this.e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f12251c;
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
    public final int read(byte[] bArr, int i10, int i11) {
        yb.p(!this.e);
        a();
        int read = this.f12249a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
