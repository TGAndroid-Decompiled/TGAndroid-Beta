package h9;

import b8.zb;
import java.io.OutputStream;
public final class e extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override
    public final void write(int i3) {
    }

    @Override
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override
    public final void write(byte[] bArr, int i3, int i10) {
        bArr.getClass();
        zb.n(i3, i10 + i3, bArr.length);
    }
}
