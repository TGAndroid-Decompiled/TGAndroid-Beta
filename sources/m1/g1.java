package m1;

import java.io.FileOutputStream;
import java.io.OutputStream;
public final class g1 extends OutputStream {
    public final FileOutputStream f19383a;

    public g1(FileOutputStream fileOutputStream) {
        this.f19383a = fileOutputStream;
    }

    @Override
    public final void flush() {
        this.f19383a.flush();
    }

    @Override
    public final void write(int i7) {
        this.f19383a.write(i7);
    }

    @Override
    public final void write(byte[] b10) {
        kotlin.jvm.internal.j.e(b10, "b");
        this.f19383a.write(b10);
    }

    @Override
    public final void write(byte[] bytes, int i7, int i10) {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        this.f19383a.write(bytes, i7, i10);
    }

    @Override
    public final void close() {
    }
}
