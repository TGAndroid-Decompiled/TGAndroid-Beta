package f9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class i extends InputStream {
    public int f6012a;
    public int f6013b;
    public final k f6014c;

    public i(k kVar, h hVar) {
        this.f6014c = kVar;
        this.f6012a = kVar.d(hVar.f6010a + 4);
        this.f6013b = hVar.f6011b;
    }

    @Override
    public final int read(byte[] bArr, int i9, int i10) {
        if (bArr != null) {
            if ((i9 | i10) >= 0 && i10 <= bArr.length - i9) {
                int i11 = this.f6013b;
                if (i11 > 0) {
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    int i12 = this.f6012a;
                    k kVar = this.f6014c;
                    RandomAccessFile randomAccessFile = kVar.f6015a;
                    int d = kVar.d(i12);
                    int i13 = d + i10;
                    int i14 = kVar.f6016b;
                    if (i13 <= i14) {
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i9, i10);
                    } else {
                        int i15 = i14 - d;
                        randomAccessFile.seek(d);
                        randomAccessFile.readFully(bArr, i9, i15);
                        randomAccessFile.seek(16L);
                        randomAccessFile.readFully(bArr, i9 + i15, i10 - i15);
                    }
                    this.f6012a = kVar.d(this.f6012a + i10);
                    this.f6013b -= i10;
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
        if (this.f6013b == 0) {
            return -1;
        }
        k kVar = this.f6014c;
        kVar.f6015a.seek(this.f6012a);
        int read = kVar.f6015a.read();
        this.f6012a = kVar.d(this.f6012a + 1);
        this.f6013b--;
        return read;
    }
}
