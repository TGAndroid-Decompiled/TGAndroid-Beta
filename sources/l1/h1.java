package l1;

import java.io.FileOutputStream;
import java.io.OutputStream;
public final class h1 extends OutputStream {
    public final FileOutputStream f17551a;

    public h1(FileOutputStream fileOutputStream) {
        this.f17551a = fileOutputStream;
    }

    @Override
    public final void flush() {
        this.f17551a.flush();
    }

    @Override
    public final void write(int i3) {
        this.f17551a.write(i3);
    }

    @Override
    public final void write(byte[] b10) {
        kotlin.jvm.internal.j.e(b10, "b");
        this.f17551a.write(b10);
    }

    @Override
    public final void write(byte[] bytes, int i3, int i10) {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        this.f17551a.write(bytes, i3, i10);
    }

    @Override
    public final void close() {
    }
}
