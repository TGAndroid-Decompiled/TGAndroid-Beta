package g2;

import java.io.InputStream;
public final class k extends InputStream {
    public final h f9365a;
    public final m f9366b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] f9367c = new byte[1];

    public k(h hVar, m mVar) {
        this.f9365a = hVar;
        this.f9366b = mVar;
    }

    @Override
    public final void close() {
        if (!this.e) {
            this.f9365a.close();
            this.e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f9367c;
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
        e2.d.g(!this.e);
        boolean z10 = this.d;
        h hVar = this.f9365a;
        if (!z10) {
            hVar.open(this.f9366b);
            this.d = true;
        }
        int read = hVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
