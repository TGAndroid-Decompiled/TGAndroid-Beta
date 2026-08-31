package j9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class i extends InputStream {
    public int f9967a;
    public int f9968b;
    public final k f9969c;

    public i(k kVar, h hVar) {
        this.f9969c = kVar;
        this.f9967a = kVar.d(hVar.f9965a + 4);
        this.f9968b = hVar.f9966b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f9968b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f9967a;
                    k kVar = this.f9969c;
                    RandomAccessFile randomAccessFile = kVar.f9970a;
                    int d = kVar.d(i13);
                    int i14 = d + i11;
                    int i15 = kVar.f9971b;
                    if (i14 <= i15) {
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i10, i11);
                    } else {
                        int i16 = i15 - d;
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i10, i16);
                        randomAccessFile.seek(16L);
                        randomAccessFile.readFully(bArr, i10 + i16, i11 - i16);
                    }
                    this.f9967a = kVar.d(this.f9967a + i11);
                    this.f9968b -= i11;
                    return i11;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }

    @Override
    public final int read() {
        if (this.f9968b == 0) {
            return -1;
        }
        k kVar = this.f9969c;
        kVar.f9970a.seek(this.f9967a);
        int read = kVar.f9970a.read();
        this.f9967a = kVar.d(this.f9967a + 1);
        this.f9968b--;
        return read;
    }
}
