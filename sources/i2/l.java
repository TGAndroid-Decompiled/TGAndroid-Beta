package i2;

import b8.zb;
import java.io.InputStream;
public final class l extends InputStream {
    public final h f14553a;
    public final n f14554b;
    public boolean d = false;
    public boolean f14556e = false;
    public final byte[] f14555c = new byte[1];

    public l(h hVar, n nVar) {
        this.f14553a = hVar;
        this.f14554b = nVar;
    }

    public final void a() {
        if (!this.d) {
            this.f14553a.open(this.f14554b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.f14556e) {
            this.f14553a.close();
            this.f14556e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f14555c;
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
    public final int read(byte[] bArr, int i3, int i10) {
        zb.p(!this.f14556e);
        a();
        int read = this.f14553a.read(bArr, i3, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
