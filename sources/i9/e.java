package i9;

import a8.ia;
import java.io.OutputStream;
public final class e extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override
    public final void write(int i7) {
    }

    @Override
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override
    public final void write(byte[] bArr, int i7, int i10) {
        bArr.getClass();
        ia.n(i7, i10 + i7, bArr.length);
    }
}
