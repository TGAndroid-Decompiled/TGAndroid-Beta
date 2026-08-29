package ic;

import java.io.FilterOutputStream;
public final class g extends FilterOutputStream {
    public final void a() {
        ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
    }

    @Override
    public final void write(int i10) {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override
    public final void write(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i11)).getBytes());
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        ((FilterOutputStream) this).out.write("\r\n".getBytes());
    }
}
