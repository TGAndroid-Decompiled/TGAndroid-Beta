package g2;

import java.io.InputStream;
import v7.u6;
public final class k extends InputStream {
    public final h f10801a;
    public final m f10802b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] f10803c = new byte[1];

    public k(h hVar, m mVar) {
        this.f10801a = hVar;
        this.f10802b = mVar;
    }

    public final void a() {
        if (!this.d) {
            this.f10801a.open(this.f10802b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.e) {
            this.f10801a.close();
            this.e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f10803c;
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
        u6.p(!this.e);
        a();
        int read = this.f10801a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
