package j9;

import java.io.InputStream;
import java.io.RandomAccessFile;
public final class i extends InputStream {
    public int f9333a;
    public int f9334b;
    public final k f9335c;

    public i(k kVar, h hVar) {
        this.f9335c = kVar;
        this.f9333a = kVar.d(hVar.f9331a + 4);
        this.f9334b = hVar.f9332b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f9334b;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = this.f9333a;
                    k kVar = this.f9335c;
                    RandomAccessFile randomAccessFile = kVar.f9336a;
                    int d = kVar.d(i13);
                    int i14 = d + i11;
                    int i15 = kVar.f9337b;
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
                    this.f9333a = kVar.d(this.f9333a + i11);
                    this.f9334b -= i11;
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
        if (this.f9334b == 0) {
            return -1;
        }
        k kVar = this.f9335c;
        kVar.f9336a.seek(this.f9333a);
        int read = kVar.f9336a.read();
        this.f9333a = kVar.d(this.f9333a + 1);
        this.f9334b--;
        return read;
    }
}
