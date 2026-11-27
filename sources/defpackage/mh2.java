package defpackage;

import java.io.IOException;
import java.io.InputStream;
public final class mh2 extends InputStream {
    public final h73 a;
    public final byte[] b = new byte[1];
    public long c;

    public mh2(h73 h73Var, n73 n73Var) {
        this.a = h73Var;
        try {
            this.c = h73Var.open(n73Var);
        } catch (IOException e) {
            grb.m(e);
            throw null;
        }
    }

    @Override
    public final int available() {
        return (int) this.c;
    }

    @Override
    public final void close() {
        this.a.close();
    }

    @Override
    public final int read() {
        h73 h73Var = this.a;
        byte[] bArr = this.b;
        int read = h73Var.read(bArr, 0, 1);
        this.c--;
        if (read == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int read = this.a.read(bArr, i, i2);
        this.c -= read;
        return read;
    }
}
