package g5;

import java.io.InputStream;
public final class o extends InputStream {
    public final m f6397a;
    public final p f6398b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] f6399c = new byte[1];

    public o(m mVar, p pVar) {
        this.f6397a = mVar;
        this.f6398b = pVar;
    }

    public final void a() {
        if (!this.d) {
            this.f6397a.open(this.f6398b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.e) {
            this.f6397a.close();
            this.e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f6399c;
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
        h5.a.i(!this.e);
        a();
        int read = this.f6397a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
