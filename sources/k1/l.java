package k1;

import java.io.FileOutputStream;
import java.io.OutputStream;
public final class l extends OutputStream {
    public final FileOutputStream f13172a;

    public l(FileOutputStream fileOutputStream) {
        this.f13172a = fileOutputStream;
    }

    @Override
    public final void flush() {
        this.f13172a.flush();
    }

    @Override
    public final void write(int i10) {
        this.f13172a.write(i10);
    }

    @Override
    public final void write(byte[] b10) {
        kotlin.jvm.internal.i.e(b10, "b");
        this.f13172a.write(b10);
    }

    @Override
    public final void write(byte[] bytes, int i10, int i11) {
        kotlin.jvm.internal.i.e(bytes, "bytes");
        this.f13172a.write(bytes, i10, i11);
    }

    @Override
    public final void close() {
    }
}
