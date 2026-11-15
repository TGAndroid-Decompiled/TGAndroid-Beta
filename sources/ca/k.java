package ca;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class k extends InputStream {
    public int f4848a;
    public int f4849b;
    public final m f4850c;

    public k(m mVar, j jVar) {
        this.f4850c = mVar;
        this.f4848a = mVar.d(jVar.f4846a + 4);
        this.f4849b = jVar.f4847b;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (bArr != null) {
            if ((i7 | i10) >= 0 && i10 <= bArr.length - i7) {
                int i11 = this.f4849b;
                if (i11 > 0) {
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    int i12 = this.f4848a;
                    m mVar = this.f4850c;
                    RandomAccessFile randomAccessFile = mVar.f4851a;
                    int d = mVar.d(i12);
                    int i13 = d + i10;
                    int i14 = mVar.f4852b;
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
                    this.f4848a = mVar.d(this.f4848a + i10);
                    this.f4849b -= i10;
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
        if (this.f4849b == 0) {
            return -1;
        }
        m mVar = this.f4850c;
        mVar.f4851a.seek(this.f4848a);
        int read = mVar.f4851a.read();
        this.f4848a = mVar.d(this.f4848a + 1);
        this.f4849b--;
        return read;
    }
}
