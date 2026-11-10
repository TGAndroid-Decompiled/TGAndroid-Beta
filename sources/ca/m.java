package ca;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class m implements Closeable {
    public static final Logger h = Logger.getLogger(m.class.getName());
    public final RandomAccessFile f6026a;
    public final int f6027b;
    public final int f6028c;
    public final j d;
    public final j f6029e;
    public final byte[] f6030f = new byte[16];

    public m(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i7 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = iArr[i10];
                    bArr[i7] = (byte) (i11 >> 24);
                    bArr[i7 + 1] = (byte) (i11 >> 16);
                    bArr[i7 + 2] = (byte) (i11 >> 8);
                    bArr[i7 + 3] = (byte) i11;
                    i7 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f6026a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        byte[] bArr2 = this.f6030f;
        randomAccessFile2.readFully(bArr2);
        int c10 = c(0, bArr2);
        this.f6027b = c10;
        if (c10 <= randomAccessFile2.length()) {
            this.f6028c = c(4, bArr2);
            int c11 = c(8, bArr2);
            int c12 = c(12, bArr2);
            this.d = b(c11);
            this.f6029e = b(c12);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f6027b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int c(int i7, byte[] bArr) {
        return ((bArr[i7] & 255) << 24) + ((bArr[i7 + 1] & 255) << 16) + ((bArr[i7 + 2] & 255) << 8) + (bArr[i7 + 3] & 255);
    }

    public final synchronized void a(l lVar) {
        int i7 = this.d.f6021a;
        for (int i10 = 0; i10 < this.f6028c; i10++) {
            j b10 = b(i7);
            lVar.a(new k(this, b10), b10.f6022b);
            i7 = d(b10.f6021a + 4 + b10.f6022b);
        }
    }

    public final j b(int i7) {
        if (i7 == 0) {
            return j.f6020c;
        }
        RandomAccessFile randomAccessFile = this.f6026a;
        randomAccessFile.seek(i7);
        return new j(i7, randomAccessFile.readInt());
    }

    @Override
    public final synchronized void close() {
        this.f6026a.close();
    }

    public final int d(int i7) {
        int i10 = this.f6027b;
        if (i7 < i10) {
            return i7;
        }
        return (i7 + 16) - i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f6027b);
        sb2.append(", size=");
        sb2.append(this.f6028c);
        sb2.append(", first=");
        sb2.append(this.d);
        sb2.append(", last=");
        sb2.append(this.f6029e);
        sb2.append(", element lengths=[");
        try {
            a(new i(sb2, 0));
        } catch (IOException e10) {
            h.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
