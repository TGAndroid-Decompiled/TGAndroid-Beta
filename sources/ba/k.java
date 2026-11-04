package ba;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class k extends InputStream {
    public int f3191a;
    public int f3192b;
    public final m f3193c;

    public k(m mVar, j jVar) {
        this.f3193c = mVar;
        this.f3191a = mVar.d(jVar.f3189a + 4);
        this.f3192b = jVar.f3190b;
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        if (bArr != null) {
            if ((i3 | i10) >= 0 && i10 <= bArr.length - i3) {
                int i11 = this.f3192b;
                if (i11 > 0) {
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    int i12 = this.f3191a;
                    m mVar = this.f3193c;
                    RandomAccessFile randomAccessFile = mVar.f3194a;
                    int d = mVar.d(i12);
                    int i13 = d + i10;
                    int i14 = mVar.f3195b;
                    if (i13 <= i14) {
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i3, i10);
                    } else {
                        int i15 = i14 - d;
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i3, i15);
                        randomAccessFile.seek(16L);
                        randomAccessFile.readFully(bArr, i3 + i15, i10 - i15);
                    }
                    this.f3191a = mVar.d(this.f3191a + i10);
                    this.f3192b -= i10;
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
        if (this.f3192b == 0) {
            return -1;
        }
        m mVar = this.f3193c;
        mVar.f3194a.seek(this.f3191a);
        int read = mVar.f3194a.read();
        this.f3191a = mVar.d(this.f3191a + 1);
        this.f3192b--;
        return read;
    }
}
