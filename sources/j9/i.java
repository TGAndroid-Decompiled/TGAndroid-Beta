package j9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class i extends InputStream {
    public int f9315a;
    public int f9316b;
    public final k f9317c;

    public i(k kVar, h hVar) {
        this.f9317c = kVar;
        this.f9315a = kVar.d(hVar.f9313a + 4);
        this.f9316b = hVar.f9314b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f9316b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f9315a;
                    k kVar = this.f9317c;
                    RandomAccessFile randomAccessFile = kVar.f9318a;
                    int d = kVar.d(i13);
                    int i14 = d + i11;
                    int i15 = kVar.f9319b;
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
                    this.f9315a = kVar.d(this.f9315a + i11);
                    this.f9316b -= i11;
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
        if (this.f9316b == 0) {
            return -1;
        }
        k kVar = this.f9317c;
        kVar.f9318a.seek(this.f9315a);
        int read = kVar.f9318a.read();
        this.f9315a = kVar.d(this.f9315a + 1);
        this.f9316b--;
        return read;
    }
}
