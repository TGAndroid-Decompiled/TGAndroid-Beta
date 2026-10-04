package g2;

import java.io.InputStream;
public final class k extends InputStream {
    public final h f10182a;
    public final m f10183b;
    public boolean d = false;
    public boolean f10185e = false;
    public final byte[] f10184c = new byte[1];

    public k(h hVar, m mVar) {
        this.f10182a = hVar;
        this.f10183b = mVar;
    }

    @Override
    public final void close() {
        if (!this.f10185e) {
            this.f10182a.close();
            this.f10185e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f10184c;
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
        e2.d.g(!this.f10185e);
        boolean z10 = this.d;
        h hVar = this.f10182a;
        if (!z10) {
            hVar.open(this.f10183b);
            this.d = true;
        }
        int read = hVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
