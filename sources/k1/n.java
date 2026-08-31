package k1;

import java.io.FileOutputStream;
import java.io.OutputStream;
public final class n extends OutputStream {
    public final FileOutputStream f10293a;

    public n(FileOutputStream fileOutputStream) {
        this.f10293a = fileOutputStream;
    }

    @Override
    public final void flush() {
        this.f10293a.flush();
    }

    @Override
    public final void write(int i10) {
        this.f10293a.write(i10);
    }

    @Override
    public final void write(byte[] b10) {
        kotlin.jvm.internal.j.e(b10, "b");
        this.f10293a.write(b10);
    }

    @Override
    public final void write(byte[] bytes, int i10, int i11) {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        this.f10293a.write(bytes, i10, i11);
    }

    @Override
    public final void close() {
    }
}
