package f9;

import c2.t;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class k implements Closeable {
    public static final Logger h = Logger.getLogger(k.class.getName());
    public final RandomAccessFile f6015a;
    public final int f6016b;
    public final int f6017c;
    public final h d;
    public final h f6018e;
    public final byte[] f6019f = new byte[16];

    public k(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i9 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = iArr[i10];
                    bArr[i9] = (byte) (i11 >> 24);
                    bArr[i9 + 1] = (byte) (i11 >> 16);
                    bArr[i9 + 2] = (byte) (i11 >> 8);
                    bArr[i9 + 3] = (byte) i11;
                    i9 += 4;
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
        this.f6015a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        byte[] bArr2 = this.f6019f;
        randomAccessFile2.readFully(bArr2);
        int c10 = c(0, bArr2);
        this.f6016b = c10;
        if (c10 <= randomAccessFile2.length()) {
            this.f6017c = c(4, bArr2);
            int c11 = c(8, bArr2);
            int c12 = c(12, bArr2);
            this.d = b(c11);
            this.f6018e = b(c12);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f6016b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int c(int i9, byte[] bArr) {
        return ((bArr[i9] & 255) << 24) + ((bArr[i9 + 1] & 255) << 16) + ((bArr[i9 + 2] & 255) << 8) + (bArr[i9 + 3] & 255);
    }

    public final synchronized void a(j jVar) {
        int i9 = this.d.f6010a;
        for (int i10 = 0; i10 < this.f6017c; i10++) {
            h b10 = b(i9);
            jVar.a(new i(this, b10), b10.f6011b);
            i9 = d(b10.f6010a + 4 + b10.f6011b);
        }
    }

    public final h b(int i9) {
        if (i9 == 0) {
            return h.f6009c;
        }
        RandomAccessFile randomAccessFile = this.f6015a;
        randomAccessFile.seek(i9);
        return new h(i9, randomAccessFile.readInt());
    }

    @Override
    public final synchronized void close() {
        this.f6015a.close();
    }

    public final int d(int i9) {
        int i10 = this.f6016b;
        if (i9 < i10) {
            return i9;
        }
        return (i9 + 16) - i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f6016b);
        sb2.append(", size=");
        sb2.append(this.f6017c);
        sb2.append(", first=");
        sb2.append(this.d);
        sb2.append(", last=");
        sb2.append(this.f6018e);
        sb2.append(", element lengths=[");
        try {
            a(new t(sb2));
        } catch (IOException e10) {
            h.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
