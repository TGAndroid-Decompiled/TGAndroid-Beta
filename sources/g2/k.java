package g2;

import java.io.InputStream;
public final class k extends InputStream {
    public final h f10319a;
    public final m f10320b;
    public boolean d = false;
    public boolean f10322e = false;
    public final byte[] f10321c = new byte[1];

    public k(h hVar, m mVar) {
        this.f10319a = hVar;
        this.f10320b = mVar;
    }

    @Override
    public final void close() {
        if (!this.f10322e) {
            this.f10319a.close();
            this.f10322e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f10321c;
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
        e2.d.g(!this.f10322e);
        boolean z10 = this.d;
        h hVar = this.f10319a;
        if (!z10) {
            hVar.open(this.f10320b);
            this.d = true;
        }
        int read = hVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
