package ba;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class m implements Closeable {
    public static final Logger h = Logger.getLogger(m.class.getName());
    public final RandomAccessFile f3194a;
    public final int f3195b;
    public final int f3196c;
    public final j d;
    public final j f3197e;
    public final byte[] f3198f = new byte[16];

    public m(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i3 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = iArr[i10];
                    bArr[i3] = (byte) (i11 >> 24);
                    bArr[i3 + 1] = (byte) (i11 >> 16);
                    bArr[i3 + 2] = (byte) (i11 >> 8);
                    bArr[i3 + 3] = (byte) i11;
                    i3 += 4;
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
        this.f3194a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        byte[] bArr2 = this.f3198f;
        randomAccessFile2.readFully(bArr2);
        int c2 = c(0, bArr2);
        this.f3195b = c2;
        if (c2 <= randomAccessFile2.length()) {
            this.f3196c = c(4, bArr2);
            int c10 = c(8, bArr2);
            int c11 = c(12, bArr2);
            this.d = b(c10);
            this.f3197e = b(c11);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f3195b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int c(int i3, byte[] bArr) {
        return ((bArr[i3] & 255) << 24) + ((bArr[i3 + 1] & 255) << 16) + ((bArr[i3 + 2] & 255) << 8) + (bArr[i3 + 3] & 255);
    }

    public final synchronized void a(l lVar) {
        int i3 = this.d.f3189a;
        for (int i10 = 0; i10 < this.f3196c; i10++) {
            j b10 = b(i3);
            lVar.a(new k(this, b10), b10.f3190b);
            i3 = d(b10.f3189a + 4 + b10.f3190b);
        }
    }

    public final j b(int i3) {
        if (i3 == 0) {
            return j.f3188c;
        }
        RandomAccessFile randomAccessFile = this.f3194a;
        randomAccessFile.seek(i3);
        return new j(i3, randomAccessFile.readInt());
    }

    @Override
    public final synchronized void close() {
        this.f3194a.close();
    }

    public final int d(int i3) {
        int i10 = this.f3195b;
        if (i3 < i10) {
            return i3;
        }
        return (i3 + 16) - i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f3195b);
        sb2.append(", size=");
        sb2.append(this.f3196c);
        sb2.append(", first=");
        sb2.append(this.d);
        sb2.append(", last=");
        sb2.append(this.f3197e);
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
