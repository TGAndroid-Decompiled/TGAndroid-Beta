package k1;

import java.io.FileOutputStream;
import java.io.OutputStream;
public final class l extends OutputStream {
    public final FileOutputStream f13177a;

    public l(FileOutputStream fileOutputStream) {
        this.f13177a = fileOutputStream;
    }

    @Override
    public final void flush() {
        this.f13177a.flush();
    }

    @Override
    public final void write(int i10) {
        this.f13177a.write(i10);
    }

    @Override
    public final void write(byte[] b10) {
        kotlin.jvm.internal.i.e(b10, "b");
        this.f13177a.write(b10);
    }

    @Override
    public final void write(byte[] bytes, int i10, int i11) {
        kotlin.jvm.internal.i.e(bytes, "bytes");
        this.f13177a.write(bytes, i10, i11);
    }

    @Override
    public final void close() {
    }
}
