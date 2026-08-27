package k1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class l extends OutputStream {

    public final FileOutputStream f14275a;

    public l(FileOutputStream fileOutputStream) {
        this.f14275a = fileOutputStream;
    }

    @Override
    public final void flush() throws IOException {
        this.f14275a.flush();
    }

    @Override
    public final void write(int i10) throws IOException {
        this.f14275a.write(i10);
    }

    @Override
    public final void write(byte[] b10) throws IOException {
        kotlin.jvm.internal.j.e(b10, "b");
        this.f14275a.write(b10);
    }

    @Override
    public final void write(byte[] bytes, int i10, int i11) throws IOException {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        this.f14275a.write(bytes, i10, i11);
    }

    @Override
    public final void close() {
    }
}
