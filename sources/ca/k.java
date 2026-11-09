package ca;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class k extends InputStream {
    public int f6018a;
    public int f6019b;
    public final m f6020c;

    public k(m mVar, j jVar) {
        this.f6020c = mVar;
        this.f6018a = mVar.d(jVar.f6016a + 4);
        this.f6019b = jVar.f6017b;
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        if (bArr != null) {
            if ((i7 | i10) >= 0 && i10 <= bArr.length - i7) {
                int i11 = this.f6019b;
                if (i11 > 0) {
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    int i12 = this.f6018a;
                    m mVar = this.f6020c;
                    RandomAccessFile randomAccessFile = mVar.f6021a;
                    int d = mVar.d(i12);
                    int i13 = d + i10;
                    int i14 = mVar.f6022b;
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
                    this.f6018a = mVar.d(this.f6018a + i10);
                    this.f6019b -= i10;
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
        if (this.f6019b == 0) {
            return -1;
        }
        m mVar = this.f6020c;
        mVar.f6021a.seek(this.f6018a);
        int read = mVar.f6021a.read();
        this.f6018a = mVar.d(this.f6018a + 1);
        this.f6019b--;
        return read;
    }
}
