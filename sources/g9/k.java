package g9;

import c2.t;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class k implements Closeable {
    public static final Logger h = Logger.getLogger(k.class.getName());

    public final RandomAccessFile f6815a;

    public final int f6816b;

    public final int f6817c;
    public final h d;

    public final h f6818e;

    public final byte[] f6819f = new byte[16];

    public k(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    int i12 = iArr[i11];
                    bArr[i10] = (byte) (i12 >> 24);
                    bArr[i10 + 1] = (byte) (i12 >> 16);
                    bArr[i10 + 2] = (byte) (i12 >> 8);
                    bArr[i10 + 3] = (byte) i12;
                    i10 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f6815a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        byte[] bArr2 = this.f6819f;
        randomAccessFile2.readFully(bArr2);
        int iC = c(0, bArr2);
        this.f6816b = iC;
        if (iC > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f6816b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f6817c = c(4, bArr2);
        int iC2 = c(8, bArr2);
        int iC3 = c(12, bArr2);
        this.d = b(iC2);
        this.f6818e = b(iC3);
    }

    public static int c(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public final synchronized void a(j jVar) {
        int iD = this.d.f6810a;
        for (int i10 = 0; i10 < this.f6817c; i10++) {
            h hVarB = b(iD);
            jVar.a(new i(this, hVarB), hVarB.f6811b);
            iD = d(hVarB.f6810a + 4 + hVarB.f6811b);
        }
    }

    public final h b(int i10) throws IOException {
        if (i10 == 0) {
            return h.f6809c;
        }
        RandomAccessFile randomAccessFile = this.f6815a;
        randomAccessFile.seek(i10);
        return new h(i10, randomAccessFile.readInt());
    }

    @Override
    public final synchronized void close() {
        this.f6815a.close();
    }

    public final int d(int i10) {
        int i11 = this.f6816b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f6816b);
        sb2.append(", size=");
        sb2.append(this.f6817c);
        sb2.append(", first=");
        sb2.append(this.d);
        sb2.append(", last=");
        sb2.append(this.f6818e);
        sb2.append(", element lengths=[");
        try {
            a(new t(sb2));
        } catch (IOException e9) {
            h.log(Level.WARNING, "read error", (Throwable) e9);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
