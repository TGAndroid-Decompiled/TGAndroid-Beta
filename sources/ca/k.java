package ca;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class k extends InputStream {
    public int f5127a;
    public int f5128b;
    public final m f5129c;

    public k(m mVar, j jVar) {
        this.f5129c = mVar;
        this.f5127a = mVar.d(jVar.f5125a + 4);
        this.f5128b = jVar.f5126b;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (bArr != null) {
            if ((i7 | i10) >= 0 && i10 <= bArr.length - i7) {
                int i11 = this.f5128b;
                if (i11 > 0) {
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    int i12 = this.f5127a;
                    m mVar = this.f5129c;
                    RandomAccessFile randomAccessFile = mVar.f5130a;
                    int d = mVar.d(i12);
                    int i13 = d + i10;
                    int i14 = mVar.f5131b;
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
                    this.f5127a = mVar.d(this.f5127a + i10);
                    this.f5128b -= i10;
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
        if (this.f5128b == 0) {
            return -1;
        }
        m mVar = this.f5129c;
        mVar.f5130a.seek(this.f5127a);
        int read = mVar.f5130a.read();
        this.f5127a = mVar.d(this.f5127a + 1);
        this.f5128b--;
        return read;
    }
}
