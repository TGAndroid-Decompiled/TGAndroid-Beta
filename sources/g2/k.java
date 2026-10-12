package g2;

import java.io.InputStream;
public final class k extends InputStream {
    public final h f10254a;
    public final m f10255b;
    public boolean d = false;
    public boolean f10257e = false;
    public final byte[] f10256c = new byte[1];

    public k(h hVar, m mVar) {
        this.f10254a = hVar;
        this.f10255b = mVar;
    }

    @Override
    public final void close() {
        if (!this.f10257e) {
            this.f10254a.close();
            this.f10257e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f10256c;
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
        e2.d.g(!this.f10257e);
        boolean z10 = this.d;
        h hVar = this.f10254a;
        if (!z10) {
            hVar.open(this.f10255b);
            this.d = true;
        }
        int read = hVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
