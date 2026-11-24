package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;
public final class p6c extends OutputStream {
    public final FileOutputStream a;

    public p6c(FileOutputStream fileOutputStream) {
        this.a = fileOutputStream;
    }

    @Override
    public final void flush() {
        this.a.flush();
    }

    @Override
    public final void write(byte[] bArr) {
        bArr.getClass();
        this.a.write(bArr);
    }

    @Override
    public final void write(int i) {
        this.a.write(i);
    }

    @Override
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.a.write(bArr, i, i2);
    }

    @Override
    public final void close() {
    }
}
