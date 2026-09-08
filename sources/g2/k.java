package g2;

import java.io.InputStream;
public final class k extends InputStream {
    public final h f10347a;
    public final m f10348b;
    public boolean d = false;
    public boolean f10350e = false;
    public final byte[] f10349c = new byte[1];

    public k(h hVar, m mVar) {
        this.f10347a = hVar;
        this.f10348b = mVar;
    }

    @Override
    public final void close() {
        if (!this.f10350e) {
            this.f10347a.close();
            this.f10350e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f10349c;
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
        e2.d.g(!this.f10350e);
        boolean z10 = this.d;
        h hVar = this.f10347a;
        if (!z10) {
            hVar.open(this.f10348b);
            this.d = true;
        }
        int read = hVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
