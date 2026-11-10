package ca;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class k extends InputStream {
    public int f6023a;
    public int f6024b;
    public final m f6025c;

    public k(m mVar, j jVar) {
        this.f6025c = mVar;
        this.f6023a = mVar.d(jVar.f6021a + 4);
        this.f6024b = jVar.f6022b;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (bArr != null) {
            if ((i7 | i10) >= 0 && i10 <= bArr.length - i7) {
                int i11 = this.f6024b;
                if (i11 > 0) {
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    int i12 = this.f6023a;
                    m mVar = this.f6025c;
                    RandomAccessFile randomAccessFile = mVar.f6026a;
                    int d = mVar.d(i12);
                    int i13 = d + i10;
                    int i14 = mVar.f6027b;
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
                    this.f6023a = mVar.d(this.f6023a + i10);
                    this.f6024b -= i10;
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
        if (this.f6024b == 0) {
            return -1;
        }
        m mVar = this.f6025c;
        mVar.f6026a.seek(this.f6023a);
        int read = mVar.f6026a.read();
        this.f6023a = mVar.d(this.f6023a + 1);
        this.f6024b--;
        return read;
    }
}
