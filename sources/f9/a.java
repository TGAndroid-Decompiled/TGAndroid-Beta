package f9;

import java.io.OutputStream;
import v7.t6;
public final class a extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override
    public final void write(int i10) {
    }

    @Override
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override
    public final void write(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        t6.f(i10, i11 + i10, bArr.length);
    }
}
