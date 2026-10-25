package g9;

import a8.yb;
import java.io.OutputStream;
public final class e extends OutputStream {
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
        yb.n(i10, i11 + i10, bArr.length);
    }
}
