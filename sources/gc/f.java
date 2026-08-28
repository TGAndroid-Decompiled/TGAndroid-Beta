package gc;

import java.io.FilterOutputStream;
public final class f extends FilterOutputStream {
    public final void a() {
        ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
    }

    @Override
    public final void write(int i9) {
        write(new byte[]{(byte) i9}, 0, 1);
    }

    @Override
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override
    public final void write(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return;
        }
        ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i10)).getBytes());
        ((FilterOutputStream) this).out.write(bArr, i9, i10);
        ((FilterOutputStream) this).out.write("\r\n".getBytes());
    }
}
