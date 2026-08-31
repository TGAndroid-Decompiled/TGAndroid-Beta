package g5;

import java.io.InputStream;
public final class o extends InputStream {
    public final m f6880a;
    public final p f6881b;
    public boolean d = false;
    public boolean f6883e = false;
    public final byte[] f6882c = new byte[1];

    public o(m mVar, p pVar) {
        this.f6880a = mVar;
        this.f6881b = pVar;
    }

    public final void a() {
        if (!this.d) {
            this.f6880a.open(this.f6881b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.f6883e) {
            this.f6880a.close();
            this.f6883e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f6882c;
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
        h5.a.i(!this.f6883e);
        a();
        int read = this.f6880a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
