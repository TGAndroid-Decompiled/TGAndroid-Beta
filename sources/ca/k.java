package ca;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class k extends InputStream {
    public int f6020a;
    public int f6021b;
    public final m f6022c;

    public k(m mVar, j jVar) {
        this.f6022c = mVar;
        this.f6020a = mVar.d(jVar.f6018a + 4);
        this.f6021b = jVar.f6019b;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (bArr != null) {
            if ((i7 | i10) >= 0 && i10 <= bArr.length - i7) {
                int i11 = this.f6021b;
                if (i11 > 0) {
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    int i12 = this.f6020a;
                    m mVar = this.f6022c;
                    RandomAccessFile randomAccessFile = mVar.f6023a;
                    int d = mVar.d(i12);
                    int i13 = d + i10;
                    int i14 = mVar.f6024b;
                    if (i13 <= i14) {
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i7, i10);
                    } else {
                        int i15 = i14 - d;
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i7, i15);
                        randomAccessFile.seek(16L);
                        randomAccessFile.readFully(bArr, i7 + i15, i10 - i15);
                    }
                    this.f6020a = mVar.d(this.f6020a + i10);
                    this.f6021b -= i10;
                    return i10;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }

    @Override
    public final int read() {
        if (this.f6021b == 0) {
            return -1;
        }
        m mVar = this.f6022c;
        mVar.f6023a.seek(this.f6020a);
        int read = mVar.f6023a.read();
        this.f6020a = mVar.d(this.f6020a + 1);
        this.f6021b--;
        return read;
    }
}
