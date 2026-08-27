package g9;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public final class i extends InputStream {

    public int f6812a;

    public int f6813b;

    public final k f6814c;

    public i(k kVar, h hVar) {
        this.f6814c = kVar;
        this.f6812a = kVar.d(hVar.f6810a + 4);
        this.f6813b = hVar.f6811b;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f6813b;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.f6812a;
        k kVar = this.f6814c;
        RandomAccessFile randomAccessFile = kVar.f6815a;
        int iD = kVar.d(i13);
        int i14 = iD + i11;
        int i15 = kVar.f6816b;
        if (i14 <= i15) {
            randomAccessFile.seek(iD);
            randomAccessFile.readFully(bArr, i10, i11);
        } else {
            int i16 = i15 - iD;
            randomAccessFile.seek(iD);
            randomAccessFile.readFully(bArr, i10, i16);
            randomAccessFile.seek(16L);
            randomAccessFile.readFully(bArr, i10 + i16, i11 - i16);
        }
        this.f6812a = kVar.d(this.f6812a + i11);
        this.f6813b -= i11;
        return i11;
    }

    @Override
    public final int read() throws IOException {
        if (this.f6813b == 0) {
            return -1;
        }
        k kVar = this.f6814c;
        kVar.f6815a.seek(this.f6812a);
        int i10 = kVar.f6815a.read();
        this.f6812a = kVar.d(this.f6812a + 1);
        this.f6813b--;
        return i10;
    }
}
