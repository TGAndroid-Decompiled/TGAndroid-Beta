package g2;

import java.io.InputStream;
import v7.t6;
public final class l extends InputStream {
    public final h f7306a;
    public final n f7307b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] f7308c = new byte[1];

    public l(h hVar, n nVar) {
        this.f7306a = hVar;
        this.f7307b = nVar;
    }

    public final void a() {
        if (!this.d) {
            this.f7306a.open(this.f7307b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.e) {
            this.f7306a.close();
            this.e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f7308c;
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
        t6.p(!this.e);
        a();
        int read = this.f7306a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
