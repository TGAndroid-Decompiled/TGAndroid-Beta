package g2;

import java.io.InputStream;
public final class k extends InputStream {
    public final h f10255a;
    public final m f10256b;
    public boolean d = false;
    public boolean f10258e = false;
    public final byte[] f10257c = new byte[1];

    public k(h hVar, m mVar) {
        this.f10255a = hVar;
        this.f10256b = mVar;
    }

    @Override
    public final void close() {
        if (!this.f10258e) {
            this.f10255a.close();
            this.f10258e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f10257c;
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
        e2.d.g(!this.f10258e);
        boolean z10 = this.d;
        h hVar = this.f10255a;
        if (!z10) {
            hVar.open(this.f10256b);
            this.d = true;
        }
        int read = hVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
