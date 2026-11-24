package defpackage;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class ax8 extends InputStream {
    public int a;
    public int b;
    public final cx8 c;

    public ax8(cx8 cx8Var, zw8 zw8Var) {
        this.c = cx8Var;
        this.a = cx8Var.d(zw8Var.b + 4);
        this.b = zw8Var.c;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.b;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    int i4 = this.a;
                    cx8 cx8Var = this.c;
                    int d = cx8Var.d(i4);
                    int i5 = d + i2;
                    int i6 = cx8Var.b;
                    RandomAccessFile randomAccessFile = cx8Var.a;
                    if (i5 <= i6) {
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i, i2);
                    } else {
                        int i7 = i6 - d;
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i, i7);
                        randomAccessFile.seek(16L);
                        randomAccessFile.readFully(bArr, i + i7, i2 - i7);
                    }
                    this.a = cx8Var.d(this.a + i2);
                    this.b -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        fvc.f("buffer");
        return 0;
    }

    @Override
    public final int read() {
        cx8 cx8Var = this.c;
        RandomAccessFile randomAccessFile = cx8Var.a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.a);
        int read = randomAccessFile.read();
        this.a = cx8Var.d(this.a + 1);
        this.b--;
        return read;
    }
}
