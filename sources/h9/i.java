package h9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class i extends InputStream {
    public int f7959a;
    public int f7960b;
    public final k f7961c;

    public i(k kVar, h hVar) {
        this.f7961c = kVar;
        this.f7959a = kVar.d(hVar.f7957a + 4);
        this.f7960b = hVar.f7958b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f7960b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f7959a;
                    k kVar = this.f7961c;
                    RandomAccessFile randomAccessFile = kVar.f7962a;
                    int d = kVar.d(i13);
                    int i14 = d + i11;
                    int i15 = kVar.f7963b;
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
                    this.f7959a = kVar.d(this.f7959a + i11);
                    this.f7960b -= i11;
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
        if (this.f7960b == 0) {
            return -1;
        }
        k kVar = this.f7961c;
        kVar.f7962a.seek(this.f7959a);
        int read = kVar.f7962a.read();
        this.f7959a = kVar.d(this.f7959a + 1);
        this.f7960b--;
        return read;
    }
}
