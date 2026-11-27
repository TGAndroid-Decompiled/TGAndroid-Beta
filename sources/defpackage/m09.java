package defpackage;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class m09 extends InputStream {
    public int a;
    public int b;
    public final o09 c;

    public m09(o09 o09Var, l09 l09Var) {
        this.c = o09Var;
        this.a = o09Var.d(l09Var.b + 4);
        this.b = l09Var.c;
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
                    o09 o09Var = this.c;
                    int d = o09Var.d(i4);
                    int i5 = d + i2;
                    int i6 = o09Var.b;
                    RandomAccessFile randomAccessFile = o09Var.a;
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
                    this.a = o09Var.d(this.a + i2);
                    this.b -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        p3d.h("buffer");
        return 0;
    }

    @Override
    public final int read() {
        o09 o09Var = this.c;
        RandomAccessFile randomAccessFile = o09Var.a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.a);
        int read = randomAccessFile.read();
        this.a = o09Var.d(this.a + 1);
        this.b--;
        return read;
    }
}
