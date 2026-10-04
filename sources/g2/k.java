package g2;

import java.io.InputStream;
public final class k extends InputStream {
    public final h f10183a;
    public final m f10184b;
    public boolean d = false;
    public boolean f10186e = false;
    public final byte[] f10185c = new byte[1];

    public k(h hVar, m mVar) {
        this.f10183a = hVar;
        this.f10184b = mVar;
    }

    @Override
    public final void close() {
        if (!this.f10186e) {
            this.f10183a.close();
            this.f10186e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f10185c;
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
        e2.d.g(!this.f10186e);
        boolean z10 = this.d;
        h hVar = this.f10183a;
        if (!z10) {
            hVar.open(this.f10184b);
            this.d = true;
        }
        int read = hVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
