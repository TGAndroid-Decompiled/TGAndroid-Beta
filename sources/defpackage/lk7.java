package defpackage;

import java.io.FilterOutputStream;
public final class lk7 extends FilterOutputStream {
    public final void a() {
        ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
    }

    @Override
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        ((FilterOutputStream) this).out.write("\r\n".getBytes());
    }

    @Override
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
