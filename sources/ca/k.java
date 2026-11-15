package ca;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class k extends InputStream {
    public int f4845a;
    public int f4846b;
    public final m f4847c;

    public k(m mVar, j jVar) {
        this.f4847c = mVar;
        this.f4845a = mVar.d(jVar.f4843a + 4);
        this.f4846b = jVar.f4844b;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (bArr != null) {
            if ((i7 | i10) >= 0 && i10 <= bArr.length - i7) {
                int i11 = this.f4846b;
                if (i11 > 0) {
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    int i12 = this.f4845a;
                    m mVar = this.f4847c;
                    RandomAccessFile randomAccessFile = mVar.f4848a;
                    int d = mVar.d(i12);
                    int i13 = d + i10;
                    int i14 = mVar.f4849b;
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
                    this.f4845a = mVar.d(this.f4845a + i10);
                    this.f4846b -= i10;
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
        if (this.f4846b == 0) {
            return -1;
        }
        m mVar = this.f4847c;
        mVar.f4848a.seek(this.f4845a);
        int read = mVar.f4848a.read();
        this.f4845a = mVar.d(this.f4845a + 1);
        this.f4846b--;
        return read;
    }
}
