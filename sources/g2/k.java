package g2;

import java.io.InputStream;
public final class k extends InputStream {
    public final h f9368a;
    public final m f9369b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] f9370c = new byte[1];

    public k(h hVar, m mVar) {
        this.f9368a = hVar;
        this.f9369b = mVar;
    }

    @Override
    public final void close() {
        if (!this.e) {
            this.f9368a.close();
            this.e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f9370c;
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
        h hVar = this.f9368a;
        if (!z10) {
            hVar.open(this.f9369b);
            this.d = true;
        }
        int read = hVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
