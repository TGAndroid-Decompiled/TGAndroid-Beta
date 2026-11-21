package j2;

import a8.la;
import java.io.InputStream;
public final class k extends InputStream {
    public final h f17199a;
    public final m f17200b;
    public boolean d = false;
    public boolean f17202e = false;
    public final byte[] f17201c = new byte[1];

    public k(h hVar, m mVar) {
        this.f17199a = hVar;
        this.f17200b = mVar;
    }

    public final void a() {
        if (!this.d) {
            this.f17199a.open(this.f17200b);
            this.d = true;
        }
    }

    @Override
    public final void close() {
        if (!this.f17202e) {
            this.f17199a.close();
            this.f17202e = true;
        }
    }

    @Override
    public final int read() {
        byte[] bArr = this.f17201c;
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
    public final int read(byte[] bArr, int i7, int i10) {
        la.p(!this.f17202e);
        a();
        int read = this.f17199a.read(bArr, i7, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
