package ca;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class k extends InputStream {
    public int f5130a;
    public int f5131b;
    public final m f5132c;

    public k(m mVar, j jVar) {
        this.f5132c = mVar;
        this.f5130a = mVar.d(jVar.f5128a + 4);
        this.f5131b = jVar.f5129b;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (bArr != null) {
            if ((i7 | i10) >= 0 && i10 <= bArr.length - i7) {
                int i11 = this.f5131b;
                if (i11 > 0) {
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    int i12 = this.f5130a;
                    m mVar = this.f5132c;
                    RandomAccessFile randomAccessFile = mVar.f5133a;
                    int d = mVar.d(i12);
                    int i13 = d + i10;
                    int i14 = mVar.f5134b;
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
                    this.f5130a = mVar.d(this.f5130a + i10);
                    this.f5131b -= i10;
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
        if (this.f5131b == 0) {
            return -1;
        }
        m mVar = this.f5132c;
        mVar.f5133a.seek(this.f5130a);
        int read = mVar.f5133a.read();
        this.f5130a = mVar.d(this.f5130a + 1);
        this.f5131b--;
        return read;
    }
}
